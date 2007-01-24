/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                        *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software;
 you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY;
 without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program;
 if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;

/** Generated Model - DO NOT CHANGE */
import java.util.*;
import java.sql.*;
import java.math.*;
import org.compiere.util.*;
/** Generated Model for PA_ReportLine
 *  @author Adempiere (generated) 
 *  @version Release 3.1.4 - $Id$ */
public class X_PA_ReportLine extends PO
{
/** Standard Constructor
@param ctx context
@param PA_ReportLine_ID id
@param trxName transaction
*/
public X_PA_ReportLine (Properties ctx, int PA_ReportLine_ID, String trxName)
{
super (ctx, PA_ReportLine_ID, trxName);
/** if (PA_ReportLine_ID == 0)
{
setIsPrinted (true);	// Y
setLineType (null);
setName (null);
setPA_ReportLineSet_ID (0);
setPA_ReportLine_ID (0);
setSeqNo (0);	// @SQL=SELECT NVL(MAX(SeqNo),0)+10 AS DefaultValue FROM PA_ReportLine WHERE PA_ReportLineSet_ID=@PA_ReportLineSet_ID@
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_PA_ReportLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=448 */
public static final int Table_ID=MTable.getTable_ID("PA_ReportLine");

/** TableName=PA_ReportLine */
public static final String Table_Name="PA_ReportLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_ReportLine");

protected BigDecimal accessLevel = BigDecimal.valueOf(3);
/** AccessLevel
@return 3 - Client - Org 
*/
protected int get_AccessLevel()
{
return accessLevel.intValue();
}
/** Load Meta Data
@param ctx context
@return PO Info
*/
protected POInfo initPO (Properties ctx)
{
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_ReportLine[").append(get_ID()).append("]");
return sb.toString();
}

/** AmountType AD_Reference_ID=235 */
public static final int AMOUNTTYPE_AD_Reference_ID=235;
/** Period Balance = BP */
public static final String AMOUNTTYPE_PeriodBalance = "BP";
/** Total Balance = BT */
public static final String AMOUNTTYPE_TotalBalance = "BT";
/** Year Balance = BY */
public static final String AMOUNTTYPE_YearBalance = "BY";
/** Period Credit Only = CP */
public static final String AMOUNTTYPE_PeriodCreditOnly = "CP";
/** Total Credit Only = CT */
public static final String AMOUNTTYPE_TotalCreditOnly = "CT";
/** Year Credit Only = CY */
public static final String AMOUNTTYPE_YearCreditOnly = "CY";
/** Period Debit Only = DP */
public static final String AMOUNTTYPE_PeriodDebitOnly = "DP";
/** Total Debit Only = DT */
public static final String AMOUNTTYPE_TotalDebitOnly = "DT";
/** Year Debit Only = DY */
public static final String AMOUNTTYPE_YearDebitOnly = "DY";
/** Period Quantity = QP */
public static final String AMOUNTTYPE_PeriodQuantity = "QP";
/** Total Quantity = QT */
public static final String AMOUNTTYPE_TotalQuantity = "QT";
/** Year Quantity = QY */
public static final String AMOUNTTYPE_YearQuantity = "QY";
/** Set Amount Type.
@param AmountType Type of amount to report */
public void setAmountType (String AmountType)
{
if (AmountType == null || AmountType.equals("BP") || AmountType.equals("BT") || AmountType.equals("BY") || AmountType.equals("CP") || AmountType.equals("CT") || AmountType.equals("CY") || AmountType.equals("DP") || AmountType.equals("DT") || AmountType.equals("DY") || AmountType.equals("QP") || AmountType.equals("QT") || AmountType.equals("QY"));
 else throw new IllegalArgumentException ("AmountType Invalid value - " + AmountType + " - Reference_ID=235 - BP - BT - BY - CP - CT - CY - DP - DT - DY - QP - QT - QY");
if (AmountType != null && AmountType.length() > 2)
{
log.warning("Length > 2 - truncated");
AmountType = AmountType.substring(0,1);
}
set_Value ("AmountType", AmountType);
}
/** Get Amount Type.
@return Type of amount to report */
public String getAmountType() 
{
return (String)get_Value("AmountType");
}

/** CalculationType AD_Reference_ID=236 */
public static final int CALCULATIONTYPE_AD_Reference_ID=236;
/** Add (Op1+Op2) = A */
public static final String CALCULATIONTYPE_AddOp1PlusOp2 = "A";
/** Percentage (Op1 of Op2) = P */
public static final String CALCULATIONTYPE_PercentageOp1OfOp2 = "P";
/** Add Range (Op1 to Op2) = R */
public static final String CALCULATIONTYPE_AddRangeOp1ToOp2 = "R";
/** Subtract (Op1-Op2) = S */
public static final String CALCULATIONTYPE_SubtractOp1_Op2 = "S";
/** Set Calculation.
@param CalculationType Calculation */
public void setCalculationType (String CalculationType)
{
if (CalculationType == null || CalculationType.equals("A") || CalculationType.equals("P") || CalculationType.equals("R") || CalculationType.equals("S"));
 else throw new IllegalArgumentException ("CalculationType Invalid value - " + CalculationType + " - Reference_ID=236 - A - P - R - S");
if (CalculationType != null && CalculationType.length() > 1)
{
log.warning("Length > 1 - truncated");
CalculationType = CalculationType.substring(0,0);
}
set_Value ("CalculationType", CalculationType);
}
/** Get Calculation.
@return Calculation */
public String getCalculationType() 
{
return (String)get_Value("CalculationType");
}
/** Set Description.
@param Description Optional short description of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_Value ("Description", Description);
}
/** Get Description.
@return Optional short description of the record */
public String getDescription() 
{
return (String)get_Value("Description");
}
/** Set Budget.
@param GL_Budget_ID General Ledger Budget */
public void setGL_Budget_ID (int GL_Budget_ID)
{
if (GL_Budget_ID <= 0) set_Value ("GL_Budget_ID", null);
 else 
set_Value ("GL_Budget_ID", Integer.valueOf(GL_Budget_ID));
}
/** Get Budget.
@return General Ledger Budget */
public int getGL_Budget_ID() 
{
Integer ii = (Integer)get_Value("GL_Budget_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Printed.
@param IsPrinted Indicates if this document / line is printed */
public void setIsPrinted (boolean IsPrinted)
{
set_Value ("IsPrinted", Boolean.valueOf(IsPrinted));
}
/** Get Printed.
@return Indicates if this document / line is printed */
public boolean isPrinted() 
{
Object oo = get_Value("IsPrinted");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

/** LineType AD_Reference_ID=241 */
public static final int LINETYPE_AD_Reference_ID=241;
/** Calculation = C */
public static final String LINETYPE_Calculation = "C";
/** Segment Value = S */
public static final String LINETYPE_SegmentValue = "S";
/** Set Line Type.
@param LineType Line Type */
public void setLineType (String LineType)
{
if (LineType == null) throw new IllegalArgumentException ("LineType is mandatory");
if (LineType.equals("C") || LineType.equals("S"));
 else throw new IllegalArgumentException ("LineType Invalid value - " + LineType + " - Reference_ID=241 - C - S");
if (LineType.length() > 1)
{
log.warning("Length > 1 - truncated");
LineType = LineType.substring(0,0);
}
set_Value ("LineType", LineType);
}
/** Get Line Type.
@return Line Type */
public String getLineType() 
{
return (String)get_Value("LineType");
}
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
}
set_Value ("Name", Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
return (String)get_Value("Name");
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}

/** Oper_1_ID AD_Reference_ID=240 */
public static final int OPER_1_ID_AD_Reference_ID=240;
/** Set Operand 1.
@param Oper_1_ID First operand for calculation */
public void setOper_1_ID (int Oper_1_ID)
{
if (Oper_1_ID <= 0) set_Value ("Oper_1_ID", null);
 else 
set_Value ("Oper_1_ID", Integer.valueOf(Oper_1_ID));
}
/** Get Operand 1.
@return First operand for calculation */
public int getOper_1_ID() 
{
Integer ii = (Integer)get_Value("Oper_1_ID");
if (ii == null) return 0;
return ii.intValue();
}

/** Oper_2_ID AD_Reference_ID=240 */
public static final int OPER_2_ID_AD_Reference_ID=240;
/** Set Operand 2.
@param Oper_2_ID Second operand for calculation */
public void setOper_2_ID (int Oper_2_ID)
{
if (Oper_2_ID <= 0) set_Value ("Oper_2_ID", null);
 else 
set_Value ("Oper_2_ID", Integer.valueOf(Oper_2_ID));
}
/** Get Operand 2.
@return Second operand for calculation */
public int getOper_2_ID() 
{
Integer ii = (Integer)get_Value("Oper_2_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Report Line Set.
@param PA_ReportLineSet_ID Report Line Set */
public void setPA_ReportLineSet_ID (int PA_ReportLineSet_ID)
{
if (PA_ReportLineSet_ID < 1) throw new IllegalArgumentException ("PA_ReportLineSet_ID is mandatory.");
set_ValueNoCheck ("PA_ReportLineSet_ID", Integer.valueOf(PA_ReportLineSet_ID));
}
/** Get Report Line Set.
@return Report Line Set */
public int getPA_ReportLineSet_ID() 
{
Integer ii = (Integer)get_Value("PA_ReportLineSet_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Report Line.
@param PA_ReportLine_ID Report Line */
public void setPA_ReportLine_ID (int PA_ReportLine_ID)
{
if (PA_ReportLine_ID < 1) throw new IllegalArgumentException ("PA_ReportLine_ID is mandatory.");
set_ValueNoCheck ("PA_ReportLine_ID", Integer.valueOf(PA_ReportLine_ID));
}
/** Get Report Line.
@return Report Line */
public int getPA_ReportLine_ID() 
{
Integer ii = (Integer)get_Value("PA_ReportLine_ID");
if (ii == null) return 0;
return ii.intValue();
}

/** PostingType AD_Reference_ID=125 */
public static final int POSTINGTYPE_AD_Reference_ID=125;
/** Actual = A */
public static final String POSTINGTYPE_Actual = "A";
/** Budget = B */
public static final String POSTINGTYPE_Budget = "B";
/** Commitment = E */
public static final String POSTINGTYPE_Commitment = "E";
/** Reservation = R */
public static final String POSTINGTYPE_Reservation = "R";
/** Statistical = S */
public static final String POSTINGTYPE_Statistical = "S";
/** Set PostingType.
@param PostingType The type of posted amount for the transaction */
public void setPostingType (String PostingType)
{
if (PostingType == null || PostingType.equals("A") || PostingType.equals("B") || PostingType.equals("E") || PostingType.equals("R") || PostingType.equals("S"));
 else throw new IllegalArgumentException ("PostingType Invalid value - " + PostingType + " - Reference_ID=125 - A - B - E - R - S");
if (PostingType != null && PostingType.length() > 1)
{
log.warning("Length > 1 - truncated");
PostingType = PostingType.substring(0,0);
}
set_Value ("PostingType", PostingType);
}
/** Get PostingType.
@return The type of posted amount for the transaction */
public String getPostingType() 
{
return (String)get_Value("PostingType");
}
/** Set Sequence.
@param SeqNo Method of ordering records;
 lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_Value ("SeqNo", Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records;
 lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value("SeqNo");
if (ii == null) return 0;
return ii.intValue();
}
}
