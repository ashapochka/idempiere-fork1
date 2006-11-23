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
/** Generated Model for AD_ImpFormat
 *  @author Jorg Janke (generated) 
 *  @version Release 2.6.0a - $Id$ */
public class X_AD_ImpFormat extends PO
{
/** Standard Constructor
@param ctx context
@param AD_ImpFormat_ID id
@param trxName transaction
*/
public X_AD_ImpFormat (Properties ctx, int AD_ImpFormat_ID, String trxName)
{
super (ctx, AD_ImpFormat_ID, trxName);
/** if (AD_ImpFormat_ID == 0)
{
setAD_ImpFormat_ID (0);
setAD_Table_ID (0);
setFormatType (null);
setName (null);
setProcessing (false);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_ImpFormat (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=381 */
public static final int Table_ID=381;

/** TableName=AD_ImpFormat */
public static final String Table_Name="AD_ImpFormat";

protected static KeyNamePair Model = new KeyNamePair(381,"AD_ImpFormat");

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
StringBuffer sb = new StringBuffer ("X_AD_ImpFormat[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Import Format.
@param AD_ImpFormat_ID Import Format */
public void setAD_ImpFormat_ID (int AD_ImpFormat_ID)
{
if (AD_ImpFormat_ID < 1) throw new IllegalArgumentException ("AD_ImpFormat_ID is mandatory.");
set_ValueNoCheck ("AD_ImpFormat_ID", new Integer(AD_ImpFormat_ID));
}
/** Get Import Format.
@return Import Format */
public int getAD_ImpFormat_ID() 
{
Integer ii = (Integer)get_Value("AD_ImpFormat_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID < 1) throw new IllegalArgumentException ("AD_Table_ID is mandatory.");
set_Value ("AD_Table_ID", new Integer(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value("AD_Table_ID");
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

/** FormatType AD_Reference_ID=209 */
public static final int FORMATTYPE_AD_Reference_ID=209;
/** Comma Separated = C */
public static final String FORMATTYPE_CommaSeparated = "C";
/** Fixed Position = F */
public static final String FORMATTYPE_FixedPosition = "F";
/** Tab Separated = T */
public static final String FORMATTYPE_TabSeparated = "T";
/** XML = X */
public static final String FORMATTYPE_XML = "X";
/** Set Format.
@param FormatType Format of the data */
public void setFormatType (String FormatType)
{
if (FormatType == null) throw new IllegalArgumentException ("FormatType is mandatory");
if (FormatType.equals("C") || FormatType.equals("F") || FormatType.equals("T") || FormatType.equals("X"));
 else throw new IllegalArgumentException ("FormatType Invalid value - " + FormatType + " - Reference_ID=209 - C - F - T - X");
if (FormatType.length() > 1)
{
log.warning("Length > 1 - truncated");
FormatType = FormatType.substring(0,0);
}
set_Value ("FormatType", FormatType);
}
/** Get Format.
@return Format of the data */
public String getFormatType() 
{
return (String)get_Value("FormatType");
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
/** Set Process Now.
@param Processing Process Now */
public void setProcessing (boolean Processing)
{
set_Value ("Processing", new Boolean(Processing));
}
/** Get Process Now.
@return Process Now */
public boolean isProcessing() 
{
Object oo = get_Value("Processing");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
}
