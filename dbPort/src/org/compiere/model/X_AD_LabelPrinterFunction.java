/******************************************************************************
 * Product: Compiere ERP & CRM Smart Business Solution                        *
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
/** Generated Model for AD_LabelPrinterFunction
 *  @author Jorg Janke (generated) 
 *  @version Release 2.6.0a - $Id$ */
public class X_AD_LabelPrinterFunction extends PO
{
/** Standard Constructor
@param ctx context
@param AD_LabelPrinterFunction_ID id
@param trxName transaction
*/
public X_AD_LabelPrinterFunction (Properties ctx, int AD_LabelPrinterFunction_ID, String trxName)
{
super (ctx, AD_LabelPrinterFunction_ID, trxName);
/** if (AD_LabelPrinterFunction_ID == 0)
{
setAD_LabelPrinterFunction_ID (0);
setAD_LabelPrinter_ID (0);
setIsXYPosition (false);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_LabelPrinterFunction (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=624 */
public static final int Table_ID=624;

/** TableName=AD_LabelPrinterFunction */
public static final String Table_Name="AD_LabelPrinterFunction";

protected static KeyNamePair Model = new KeyNamePair(624,"AD_LabelPrinterFunction");

protected BigDecimal accessLevel = new BigDecimal(6);
/** AccessLevel
@return 6 - System - Client 
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
StringBuffer sb = new StringBuffer ("X_AD_LabelPrinterFunction[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Label printer Function.
@param AD_LabelPrinterFunction_ID Function of Label Printer */
public void setAD_LabelPrinterFunction_ID (int AD_LabelPrinterFunction_ID)
{
if (AD_LabelPrinterFunction_ID < 1) throw new IllegalArgumentException ("AD_LabelPrinterFunction_ID is mandatory.");
set_ValueNoCheck ("AD_LabelPrinterFunction_ID", new Integer(AD_LabelPrinterFunction_ID));
}
/** Get Label printer Function.
@return Function of Label Printer */
public int getAD_LabelPrinterFunction_ID() 
{
Integer ii = (Integer)get_Value("AD_LabelPrinterFunction_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Label printer.
@param AD_LabelPrinter_ID Label Printer Definition */
public void setAD_LabelPrinter_ID (int AD_LabelPrinter_ID)
{
if (AD_LabelPrinter_ID < 1) throw new IllegalArgumentException ("AD_LabelPrinter_ID is mandatory.");
set_ValueNoCheck ("AD_LabelPrinter_ID", new Integer(AD_LabelPrinter_ID));
}
/** Get Label printer.
@return Label Printer Definition */
public int getAD_LabelPrinter_ID() 
{
Integer ii = (Integer)get_Value("AD_LabelPrinter_ID");
if (ii == null) return 0;
return ii.intValue();
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
/** Set Function Prefix.
@param FunctionPrefix Data sent before the function */
public void setFunctionPrefix (String FunctionPrefix)
{
if (FunctionPrefix != null && FunctionPrefix.length() > 40)
{
log.warning("Length > 40 - truncated");
FunctionPrefix = FunctionPrefix.substring(0,39);
}
set_Value ("FunctionPrefix", FunctionPrefix);
}
/** Get Function Prefix.
@return Data sent before the function */
public String getFunctionPrefix() 
{
return (String)get_Value("FunctionPrefix");
}
/** Set Function Suffix.
@param FunctionSuffix Data sent after the function */
public void setFunctionSuffix (String FunctionSuffix)
{
if (FunctionSuffix != null && FunctionSuffix.length() > 40)
{
log.warning("Length > 40 - truncated");
FunctionSuffix = FunctionSuffix.substring(0,39);
}
set_Value ("FunctionSuffix", FunctionSuffix);
}
/** Get Function Suffix.
@return Data sent after the function */
public String getFunctionSuffix() 
{
return (String)get_Value("FunctionSuffix");
}
/** Set XY Position.
@param IsXYPosition The Function is XY position */
public void setIsXYPosition (boolean IsXYPosition)
{
set_Value ("IsXYPosition", new Boolean(IsXYPosition));
}
/** Get XY Position.
@return The Function is XY position */
public boolean isXYPosition() 
{
Object oo = get_Value("IsXYPosition");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
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
/** Set XY Separator.
@param XYSeparator The separator between the X and Y function. */
public void setXYSeparator (String XYSeparator)
{
if (XYSeparator != null && XYSeparator.length() > 20)
{
log.warning("Length > 20 - truncated");
XYSeparator = XYSeparator.substring(0,19);
}
set_Value ("XYSeparator", XYSeparator);
}
/** Get XY Separator.
@return The separator between the X and Y function. */
public String getXYSeparator() 
{
return (String)get_Value("XYSeparator");
}
}
