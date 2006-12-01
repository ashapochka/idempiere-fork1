/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                        *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;

import java.math.*;
import java.sql.*;
import java.util.*;
import org.compiere.util.*;

/**
 *	Cash Line Model
 *	
 *  @author Jorg Janke
 *  @version $Id: MCashLine.java,v 1.3 2006/07/30 00:51:03 jjanke Exp $
 */
public class MCashLine extends X_C_CashLine
{
	/**
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param C_CashLine_ID id
	 *	@param trxName transaction
	 */
	public MCashLine (Properties ctx, int C_CashLine_ID, String trxName)
	{
		super (ctx, C_CashLine_ID, trxName);
		if (C_CashLine_ID == 0)
		{
		//	setLine (0);
		//	setCashType (CASHTYPE_GeneralExpense);
			setAmount (Env.ZERO);
			setDiscountAmt(Env.ZERO);
			setWriteOffAmt(Env.ZERO);
			setIsGenerated(false);
		}
	}	//	MCashLine

	/**
	 * 	Load Cosntructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MCashLine (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MCashLine
	
	/**
	 * 	Parent Cosntructor
	 *	@param cash parent
	 */
	public MCashLine (MCash cash)
	{
		this (cash.getCtx(), 0, cash.get_TrxName());
		setClientOrg(cash);
		setC_Cash_ID(cash.getC_Cash_ID());
		m_parent = cash;
		m_cashBook = m_parent.getCashBook();
	}	//	MCashLine

	/** Parent					*/
	private MCash			m_parent = null;
	/** Cash Book				*/
	private MCashBook 		m_cashBook = null;
	/** Bank Account			*/
	private MBankAccount 	m_bankAccount = null;
	/** Invoice					*/
	private MInvoice		m_invoice = null;
	

	/**
	 * 	Add to Description
	 *	@param description text
	 */
	public void addDescription (String description)
	{
		String desc = getDescription();
		if (desc == null)
			setDescription(description);
		else
			setDescription(desc + " | " + description);
	}	//	addDescription
	
	/**
	 * 	Set Invoice - no discount
	 *	@param invoice invoice
	 */
	public void setInvoice (MInvoice invoice)
	{
		setC_Invoice_ID(invoice.getC_Invoice_ID());
		setCashType (CASHTYPE_Invoice);
		setC_Currency_ID(invoice.getC_Currency_ID());
		//	Amount
		MDocType dt = MDocType.get(getCtx(), invoice.getC_DocType_ID());
		BigDecimal amt = invoice.getGrandTotal();
		if (MDocType.DOCBASETYPE_APInvoice.equals(dt.getDocBaseType())
			|| MDocType.DOCBASETYPE_ARCreditMemo.equals(dt.getDocBaseType()) )
			amt = amt.negate();
		setAmount (amt);
		//
		setDiscountAmt(Env.ZERO);
		setWriteOffAmt(Env.ZERO);
		setIsGenerated(true);
		m_invoice = invoice;
	}	//	setInvoiceLine

	/**
	 * 	Set Order - no discount
	 *	@param order order
	 *	@param trxName transaction
	 */
	public void setOrder (MOrder order, String trxName)
	{
		setCashType (CASHTYPE_Invoice);
		setC_Currency_ID(order.getC_Currency_ID());
		//	Amount
		BigDecimal amt = order.getGrandTotal();
		setAmount (amt);
		setDiscountAmt(Env.ZERO);
		setWriteOffAmt(Env.ZERO);
		setIsGenerated(true);
		//
		if (MOrder.DOCSTATUS_WaitingPayment.equals(order.getDocStatus()))
		{
			save(trxName);
			order.setC_CashLine_ID(getC_CashLine_ID());
			order.processIt(MOrder.ACTION_WaitComplete);
			order.save(trxName);
			//	Set Invoice
			MInvoice[] invoices = order.getInvoices();
			int length = invoices.length;
			if (length > 0)		//	get last invoice
			{
				m_invoice = invoices[length-1];
				setC_Invoice_ID (m_invoice.getC_Invoice_ID());
			}
		}
	}	//	setOrder
	
	
	/**
	 * 	Get Statement Date from header 
	 *	@return date
	 */
	public Timestamp getStatementDate()
	{
		return getParent().getStatementDate();
	}	//	getStatementDate

	/**
	 * 	Create Line Reversal
	 *	@return new reversed CashLine
	 */
	public MCashLine createReversal()
	{
		MCash parent = getParent();
		if (parent.isProcessed())
		{	//	saved
			parent = MCash.get(getCtx(), parent.getAD_Org_ID(), 
				parent.getStatementDate(), parent.getC_Currency_ID(), get_TrxName());
		}
		//
		MCashLine reversal = new MCashLine (parent);
		reversal.setClientOrg(this);
		reversal.setC_BankAccount_ID(getC_BankAccount_ID());
		reversal.setC_Charge_ID(getC_Charge_ID());
		reversal.setC_Currency_ID(getC_Currency_ID());
		reversal.setC_Invoice_ID(getC_Invoice_ID());
		reversal.setCashType(getCashType());
		reversal.setDescription(getDescription());
		reversal.setIsGenerated(true);
		//
		reversal.setAmount(getAmount().negate());
		if (getDiscountAmt() == null)
			setDiscountAmt(Env.ZERO);
		else
			reversal.setDiscountAmt(getDiscountAmt().negate());
		if (getWriteOffAmt() == null)
			setWriteOffAmt(Env.ZERO);
		else
			reversal.setWriteOffAmt(getWriteOffAmt().negate());
		reversal.addDescription("(" + getLine() + ")");
		return reversal;
	}	//	reverse
	
	
	/**
	 * 	Get Cash (parent)
	 *	@return cash
	 */
	public MCash getParent()
	{
		if (m_parent == null)
			m_parent = new MCash (getCtx(), getC_Cash_ID(), get_TrxName());
		return m_parent;
	}	//	getCash
	
	/**
	 * 	Get CashBook
	 *	@return cash book
	 */
	public MCashBook getCashBook()
	{
		if (m_cashBook == null)
			m_cashBook = MCashBook.get(getCtx(), getParent().getC_CashBook_ID());
		return m_cashBook;
	}	//	getCashBook
	
	/**
	 * 	Get Bank Account
	 *	@return bank account
	 */
	public MBankAccount getBankAccount()
	{
		if (m_bankAccount == null && getC_BankAccount_ID() != 0)
			m_bankAccount = MBankAccount.get(getCtx(), getC_BankAccount_ID());
		return m_bankAccount;
	}	//	getBankAccount
	
	/**
	 * 	Get Invoice
	 *	@return invoice
	 */
	public MInvoice getInvoice()
	{
		if (m_invoice == null && getC_Invoice_ID() != 0)
			m_invoice = MInvoice.get(getCtx(), getC_Invoice_ID());
		return m_invoice;
	}	//	getInvoice
	
	/**************************************************************************
	 * 	Before Delete
	 *	@return true/false
	 */
	protected boolean beforeDelete ()
	{
		//	Cannot Delete generated Invoices
		Boolean generated = (Boolean)get_ValueOld("IsGenerated");
		if (generated != null && generated.booleanValue())
		{
			if (get_ValueOld("C_Invoice_ID") != null)
			{
				log.warning("Cannot delete line with generated Invoice");
				return false;
			}
		}
		return true;
	}	//	beforeDelete

	/**
	 * 	After Delete
	 *	@param success
	 *	@return true/false
	 */
	protected boolean afterDelete (boolean success)
	{
		if (!success)
			return success;
		return updateHeader();
	}	//	afterDelete

	
	/**
	 * 	Before Save
	 *	@param newRecord
	 *	@return true/false
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		//	Cannot change generated Invoices
		if (is_ValueChanged("C_Invoice_ID"))
		{
			Object generated = get_ValueOld("IsGenerated");
			if (generated != null && ((Boolean)generated).booleanValue())
			{
				log.warning("Cannot change line with generated Invoice");
				return false;
			}
		}
		
		//	Verify CashType
		if (CASHTYPE_Invoice.equals(getCashType()) && getC_Invoice_ID() == 0)
			setCashType(CASHTYPE_GeneralExpense);
		if (CASHTYPE_BankAccountTransfer.equals(getCashType()) && getC_BankAccount_ID() == 0)
			setCashType(CASHTYPE_GeneralExpense);
		if (CASHTYPE_Charge.equals(getCashType()) && getC_Charge_ID() == 0)
			setCashType(CASHTYPE_GeneralExpense);

		boolean verify = newRecord 
			|| is_ValueChanged("CashType")
			|| is_ValueChanged("C_Invoice_ID")
			|| is_ValueChanged("C_BankAccount_ID");
		if (verify)
		{
			//	Verify Currency
			if (CASHTYPE_BankAccountTransfer.equals(getCashType())) 
				setC_Currency_ID(getBankAccount().getC_Currency_ID());
			else if (CASHTYPE_Invoice.equals(getCashType()))
				setC_Currency_ID(getInvoice().getC_Currency_ID());
			else	//	Cash 
				setC_Currency_ID(getCashBook().getC_Currency_ID());
		
			//	Set Organization
			if (CASHTYPE_BankAccountTransfer.equals(getCashType()))
				setAD_Org_ID(getBankAccount().getAD_Org_ID());
			//	Cash Book
			else if (CASHTYPE_Invoice.equals(getCashType()))
				setAD_Org_ID(getCashBook().getAD_Org_ID());
			//	otherwise (charge) - leave it
			//	Enforce Org
			if (getAD_Org_ID() == 0)
				setAD_Org_ID(getParent().getAD_Org_ID());
		}

		/**	General fix of Currency 
		UPDATE C_CashLine cl SET C_Currency_ID = (SELECT C_Currency_ID FROM C_Invoice i WHERE i.C_Invoice_ID=cl.C_Invoice_ID) WHERE C_Currency_ID IS NULL AND C_Invoice_ID IS NOT NULL;
		UPDATE C_CashLine cl SET C_Currency_ID = (SELECT C_Currency_ID FROM C_BankAccount b WHERE b.C_BankAccount_ID=cl.C_BankAccount_ID) WHERE C_Currency_ID IS NULL AND C_BankAccount_ID IS NOT NULL;
		UPDATE C_CashLine cl SET C_Currency_ID = (SELECT b.C_Currency_ID FROM C_Cash c, C_CashBook b WHERE c.C_Cash_ID=cl.C_Cash_ID AND c.C_CashBook_ID=b.C_CashBook_ID) WHERE C_Currency_ID IS NULL;
		**/
		
		//	Get Line No
		if (getLine() == 0)
		{
			String sql = "SELECT COALESCE(MAX(Line),0)+10 FROM C_CashLine WHERE C_Cash_ID=?";
			int ii = DB.getSQLValue (get_TrxName(), sql, getC_Cash_ID());
			setLine (ii);
		}
		
		return true;
	}	//	beforeSave
	
	/**
	 * 	After Save
	 *	@param newRecord
	 *	@param success
	 *	@return success
	 */
	protected boolean afterSave (boolean newRecord, boolean success)
	{
		if (!success)
			return success;
		return updateHeader();
	}	//	afterSave
	
	/**
	 * 	Update Cash Header.
	 * 	Statement Difference, Ending Balance
	 *	@return true if success
	 */
	private boolean updateHeader()
	{
		String sql = "UPDATE C_Cash c"
			+ " SET StatementDifference="
			//FYRACLE replace null with 0 there is no difference with this
				+ "(SELECT COALESCE(SUM(currencyConvert(cl.Amount, cl.C_Currency_ID, cb.C_Currency_ID, c.DateAcct, 0, c.AD_Client_ID, c.AD_Org_ID)),0) "
				+ "FROM C_CashLine cl, C_CashBook cb "
				+ "WHERE cb.C_CashBook_ID=c.C_CashBook_ID"
				+ " AND cl.C_Cash_ID=c.C_Cash_ID) "
			+ "WHERE C_Cash_ID=" + getC_Cash_ID();
		int no = DB.executeUpdate(sql, get_TrxName());
		if (no != 1)
			log.warning("Difference #" + no);
		//	Ending Balance
		sql = "UPDATE C_Cash"
			+ " SET EndingBalance = BeginningBalance + StatementDifference "
			+ "WHERE C_Cash_ID=" + getC_Cash_ID();
		no = DB.executeUpdate(sql, get_TrxName());
		if (no != 1)
			log.warning("Balance #" + no);
		return no == 1;
	}	//	updateHeader
	
}	//	MCashLine
