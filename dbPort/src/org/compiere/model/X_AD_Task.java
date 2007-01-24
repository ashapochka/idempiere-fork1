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
/** Generated Model for AD_Task
 *  @author Adempiere (generated) 
 *  @version Release 3.1.4 - $Id$ */
public class X_AD_Task extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Task_ID id
@param trxName transaction
*/
public X_AD_Task (Properties ctx, int AD_Task_ID, String trxName)
{
super (ctx, AD_Task_ID, trxName);
/** if (AD_Task_ID == 0)
{
setAD_Task_ID (0);
setAccessLevel (null);
setEntityType (null);	// U
setIsServerProcess (false);	// N
setName (null);
setOS_Command (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Task (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=118 */
public static final int Table_ID=MTable.getTable_ID("AD_Task");

/** TableName=AD_Task */
public static final String Table_Name="AD_Task";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_Task");

protected BigDecimal accessLevel = BigDecimal.valueOf(6);
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
StringBuffer sb = new StringBuffer ("X_AD_Task[").append(get_ID()).append("]");
return sb.toString();
}
/** Set OS Task.
@param AD_Task_ID Operation System Task */
public void setAD_Task_ID (int AD_Task_ID)
{
if (AD_Task_ID < 1) throw new IllegalArgumentException ("AD_Task_ID is mandatory.");
set_ValueNoCheck ("AD_Task_ID", Integer.valueOf(AD_Task_ID));
}
/** Get OS Task.
@return Operation System Task */
public int getAD_Task_ID() 
{
Integer ii = (Integer)get_Value("AD_Task_ID");
if (ii == null) return 0;
return ii.intValue();
}

/** AccessLevel AD_Reference_ID=5 */
public static final int ACCESSLEVEL_AD_Reference_ID=5;
/** Organization = 1 */
public static final String ACCESSLEVEL_Organization = "1";
/** Client only = 2 */
public static final String ACCESSLEVEL_ClientOnly = "2";
/** Client+Organization = 3 */
public static final String ACCESSLEVEL_ClientPlusOrganization = "3";
/** System only = 4 */
public static final String ACCESSLEVEL_SystemOnly = "4";
/** System+Client = 6 */
public static final String ACCESSLEVEL_SystemPlusClient = "6";
/** All = 7 */
public static final String ACCESSLEVEL_All = "7";
/** Set Data Access Level.
@param AccessLevel Access Level required */
public void setAccessLevel (String AccessLevel)
{
if (AccessLevel == null) throw new IllegalArgumentException ("AccessLevel is mandatory");
if (AccessLevel.equals("1") || AccessLevel.equals("2") || AccessLevel.equals("3") || AccessLevel.equals("4") || AccessLevel.equals("6") || AccessLevel.equals("7"));
 else throw new IllegalArgumentException ("AccessLevel Invalid value - " + AccessLevel + " - Reference_ID=5 - 1 - 2 - 3 - 4 - 6 - 7");
if (AccessLevel.length() > 1)
{
log.warning("Length > 1 - truncated");
AccessLevel = AccessLevel.substring(0,0);
}
set_Value ("AccessLevel", AccessLevel);
}
/** Get Data Access Level.
@return Access Level required */
public String getAccessLevel() 
{
return (String)get_Value("AccessLevel");
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

/** EntityType AD_Reference_ID=389 */
public static final int ENTITYTYPE_AD_Reference_ID=389;
/** Set Entity Type.
@param EntityType Dictionary Entity Type;
 Determines ownership and synchronization */
public void setEntityType (String EntityType)
{
if (EntityType.length() > 4)
{
log.warning("Length > 4 - truncated");
EntityType = EntityType.substring(0,3);
}
set_Value ("EntityType", EntityType);
}
/** Get Entity Type.
@return Dictionary Entity Type;
 Determines ownership and synchronization */
public String getEntityType() 
{
return (String)get_Value("EntityType");
}
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
if (Help != null && Help.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Help = Help.substring(0,1999);
}
set_Value ("Help", Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
return (String)get_Value("Help");
}
/** Set Server Process.
@param IsServerProcess Run this Process on Server only */
public void setIsServerProcess (boolean IsServerProcess)
{
set_Value ("IsServerProcess", Boolean.valueOf(IsServerProcess));
}
/** Get Server Process.
@return Run this Process on Server only */
public boolean isServerProcess() 
{
Object oo = get_Value("IsServerProcess");
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
/** Set OS Command.
@param OS_Command Operating System Command */
public void setOS_Command (String OS_Command)
{
if (OS_Command == null) throw new IllegalArgumentException ("OS_Command is mandatory.");
if (OS_Command.length() > 2000)
{
log.warning("Length > 2000 - truncated");
OS_Command = OS_Command.substring(0,1999);
}
set_Value ("OS_Command", OS_Command);
}
/** Get OS Command.
@return Operating System Command */
public String getOS_Command() 
{
return (String)get_Value("OS_Command");
}
}
