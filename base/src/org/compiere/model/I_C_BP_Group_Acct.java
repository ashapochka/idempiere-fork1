/**********************************************************************
 * This file is part of Adempiere ERP Bazaar                          *
 * http://www.adempiere.org                                           *
 *                                                                    *
 * Copyright (C) Trifon Trifonov.                                     *
 * Copyright (C) Contributors                                         *
 *                                                                    *
 * This program is free software;
 you can redistribute it and/or      *
 * modify it under the terms of the GNU General Public License        *
 * as published by the Free Software Foundation;
 either version 2     *
 * of the License, or (at your option) any later version.             *
 *                                                                    *
 * This program is distributed in the hope that it will be useful,    *
 * but WITHOUT ANY WARRANTY;
 without even the implied warranty of     *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the       *
 * GNU General Public License for more details.                       *
 *                                                                    *
 * You should have received a copy of the GNU General Public License  *
 * along with this program;
 if not, write to the Free Software        *
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,         *
 * MA 02110-1301, USA.                                                *
 *                                                                    *
 * Contributors:                                                      *
 * - Trifon Trifonov (trifonnt@users.sourceforge.net)                 *
 *                                                                    *
 * Sponsors:                                                          *
 * - Company (http://www.site.com)                                    *
 **********************************************************************/
package org.compiere.model;

import java.util.*;
import java.sql.Timestamp;
import java.math.*;
import org.compiere.util.*;

    /** Generated Interface for C_BP_Group_Acct
     *  @author Trifon Trifonov (generated) 
     *  @version Release 3.3.0 - 2007-08-24 11:39:37.125
     */
    public interface I_C_BP_Group_Acct 
{

    /** TableName=C_BP_Group_Acct */
    public static final String Table_Name = "C_BP_Group_Acct";

    /** AD_Table_ID=395 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = new BigDecimal(3);

    /** Load Meta Data */

    /** Column name C_AcctSchema_ID */
    public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";

	/** Set Accounting Schema.
	  * Rules for accounting
	  */
	public void setC_AcctSchema_ID (int C_AcctSchema_ID);

	/** Get Accounting Schema.
	  * Rules for accounting
	  */
	public int getC_AcctSchema_ID();

	public I_C_AcctSchema getI_C_AcctSchema() throws Exception;

    /** Column name C_BP_Group_ID */
    public static final String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";

	/** Set Business Partner Group.
	  * Business Partner Group
	  */
	public void setC_BP_Group_ID (int C_BP_Group_ID);

	/** Get Business Partner Group.
	  * Business Partner Group
	  */
	public int getC_BP_Group_ID();

	public I_C_BP_Group getI_C_BP_Group() throws Exception;

    /** Column name C_Prepayment_Acct */
    public static final String COLUMNNAME_C_Prepayment_Acct = "C_Prepayment_Acct";

	/** Set Customer Prepayment.
	  * Account for customer prepayments
	  */
	public void setC_Prepayment_Acct (int C_Prepayment_Acct);

	/** Get Customer Prepayment.
	  * Account for customer prepayments
	  */
	public int getC_Prepayment_Acct();

    /** Column name C_Receivable_Acct */
    public static final String COLUMNNAME_C_Receivable_Acct = "C_Receivable_Acct";

	/** Set Customer Receivables.
	  * Account for Customer Receivables
	  */
	public void setC_Receivable_Acct (int C_Receivable_Acct);

	/** Get Customer Receivables.
	  * Account for Customer Receivables
	  */
	public int getC_Receivable_Acct();

    /** Column name C_Receivable_Services_Acct */
    public static final String COLUMNNAME_C_Receivable_Services_Acct = "C_Receivable_Services_Acct";

	/** Set Receivable Services.
	  * Customer Accounts Receivables Services Account
	  */
	public void setC_Receivable_Services_Acct (int C_Receivable_Services_Acct);

	/** Get Receivable Services.
	  * Customer Accounts Receivables Services Account
	  */
	public int getC_Receivable_Services_Acct();

    /** Column name NotInvoicedReceipts_Acct */
    public static final String COLUMNNAME_NotInvoicedReceipts_Acct = "NotInvoicedReceipts_Acct";

	/** Set Not-invoiced Receipts.
	  * Account for not-invoiced Material Receipts
	  */
	public void setNotInvoicedReceipts_Acct (int NotInvoicedReceipts_Acct);

	/** Get Not-invoiced Receipts.
	  * Account for not-invoiced Material Receipts
	  */
	public int getNotInvoicedReceipts_Acct();

    /** Column name NotInvoicedReceivables_Acct */
    public static final String COLUMNNAME_NotInvoicedReceivables_Acct = "NotInvoicedReceivables_Acct";

	/** Set Not-invoiced Receivables.
	  * Account for not invoiced Receivables
	  */
	public void setNotInvoicedReceivables_Acct (int NotInvoicedReceivables_Acct);

	/** Get Not-invoiced Receivables.
	  * Account for not invoiced Receivables
	  */
	public int getNotInvoicedReceivables_Acct();

    /** Column name NotInvoicedRevenue_Acct */
    public static final String COLUMNNAME_NotInvoicedRevenue_Acct = "NotInvoicedRevenue_Acct";

	/** Set Not-invoiced Revenue.
	  * Account for not invoiced Revenue
	  */
	public void setNotInvoicedRevenue_Acct (int NotInvoicedRevenue_Acct);

	/** Get Not-invoiced Revenue.
	  * Account for not invoiced Revenue
	  */
	public int getNotInvoicedRevenue_Acct();

    /** Column name PayDiscount_Exp_Acct */
    public static final String COLUMNNAME_PayDiscount_Exp_Acct = "PayDiscount_Exp_Acct";

	/** Set Payment Discount Expense.
	  * Payment Discount Expense Account
	  */
	public void setPayDiscount_Exp_Acct (int PayDiscount_Exp_Acct);

	/** Get Payment Discount Expense.
	  * Payment Discount Expense Account
	  */
	public int getPayDiscount_Exp_Acct();

    /** Column name PayDiscount_Rev_Acct */
    public static final String COLUMNNAME_PayDiscount_Rev_Acct = "PayDiscount_Rev_Acct";

	/** Set Payment Discount Revenue.
	  * Payment Discount Revenue Account
	  */
	public void setPayDiscount_Rev_Acct (int PayDiscount_Rev_Acct);

	/** Get Payment Discount Revenue.
	  * Payment Discount Revenue Account
	  */
	public int getPayDiscount_Rev_Acct();

    /** Column name Processing */
    public static final String COLUMNNAME_Processing = "Processing";

	/** Set Process Now	  */
	public void setProcessing (boolean Processing);

	/** Get Process Now	  */
	public boolean isProcessing();

    /** Column name UnEarnedRevenue_Acct */
    public static final String COLUMNNAME_UnEarnedRevenue_Acct = "UnEarnedRevenue_Acct";

	/** Set Unearned Revenue.
	  * Account for unearned revenue
	  */
	public void setUnEarnedRevenue_Acct (int UnEarnedRevenue_Acct);

	/** Get Unearned Revenue.
	  * Account for unearned revenue
	  */
	public int getUnEarnedRevenue_Acct();

    /** Column name V_Liability_Acct */
    public static final String COLUMNNAME_V_Liability_Acct = "V_Liability_Acct";

	/** Set Vendor Liability.
	  * Account for Vendor Liability
	  */
	public void setV_Liability_Acct (int V_Liability_Acct);

	/** Get Vendor Liability.
	  * Account for Vendor Liability
	  */
	public int getV_Liability_Acct();

    /** Column name V_Liability_Services_Acct */
    public static final String COLUMNNAME_V_Liability_Services_Acct = "V_Liability_Services_Acct";

	/** Set Vendor Service Liability.
	  * Account for Vender Service Liability
	  */
	public void setV_Liability_Services_Acct (int V_Liability_Services_Acct);

	/** Get Vendor Service Liability.
	  * Account for Vender Service Liability
	  */
	public int getV_Liability_Services_Acct();

    /** Column name V_Prepayment_Acct */
    public static final String COLUMNNAME_V_Prepayment_Acct = "V_Prepayment_Acct";

	/** Set Vendor Prepayment.
	  * Account for Vendor Prepayments
	  */
	public void setV_Prepayment_Acct (int V_Prepayment_Acct);

	/** Get Vendor Prepayment.
	  * Account for Vendor Prepayments
	  */
	public int getV_Prepayment_Acct();

    /** Column name WriteOff_Acct */
    public static final String COLUMNNAME_WriteOff_Acct = "WriteOff_Acct";

	/** Set Write-off.
	  * Account for Receivables write-off
	  */
	public void setWriteOff_Acct (int WriteOff_Acct);

	/** Get Write-off.
	  * Account for Receivables write-off
	  */
	public int getWriteOff_Acct();
}
