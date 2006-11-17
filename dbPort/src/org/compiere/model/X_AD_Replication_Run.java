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
/** Generated Model for AD_Replication_Run
 *  @author Jorg Janke (generated) 
 *  @version Release 2.5.3d - 2006-10-10 21:55:53.875 */
public class X_AD_Replication_Run extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Replication_Run_ID id
@param trxName transaction
*/
public X_AD_Replication_Run (Properties ctx, int AD_Replication_Run_ID, String trxName)
{
super (ctx, AD_Replication_Run_ID, trxName);
/** if (AD_Replication_Run_ID == 0)
{
setAD_Replication_ID (0);
setAD_Replication_Run_ID (0);
setIsReplicated (false);	// N
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Replication_Run (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=603 */
public static final int Table_ID=603;

/** TableName=AD_Replication_Run */
public static final String Table_Name="AD_Replication_Run";

protected static KeyNamePair Model = new KeyNamePair(603,"AD_Replication_Run");

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
StringBuffer sb = new StringBuffer ("X_AD_Replication_Run[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Replication.
@param AD_Replication_ID Data Replication Target */
public void setAD_Replication_ID (int AD_Replication_ID)
{
if (AD_Replication_ID < 1) throw new IllegalArgumentException ("AD_Replication_ID is mandatory.");
set_ValueNoCheck ("AD_Replication_ID", new Integer(AD_Replication_ID));
}
/** Get Replication.
@return Data Replication Target */
public int getAD_Replication_ID() 
{
Integer ii = (Integer)get_Value("AD_Replication_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Replication Run.
@param AD_Replication_Run_ID Data Replication Run */
public void setAD_Replication_Run_ID (int AD_Replication_Run_ID)
{
if (AD_Replication_Run_ID < 1) throw new IllegalArgumentException ("AD_Replication_Run_ID is mandatory.");
set_ValueNoCheck ("AD_Replication_Run_ID", new Integer(AD_Replication_Run_ID));
}
/** Get Replication Run.
@return Data Replication Run */
public int getAD_Replication_Run_ID() 
{
Integer ii = (Integer)get_Value("AD_Replication_Run_ID");
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
/** Set Replicated.
@param IsReplicated The data is successfully replicated */
public void setIsReplicated (boolean IsReplicated)
{
set_ValueNoCheck ("IsReplicated", new Boolean(IsReplicated));
}
/** Get Replicated.
@return The data is successfully replicated */
public boolean isReplicated() 
{
Object oo = get_Value("IsReplicated");
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
}
