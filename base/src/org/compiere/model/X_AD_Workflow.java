/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
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
/** Generated Model for AD_Workflow
 *  @author Adempiere (generated) 
 *  @version Release 3.3.0 - $Id$ */
public class X_AD_Workflow extends PO
{
/** Standard Constructor
@param ctx context
@param AD_Workflow_ID id
@param trxName transaction
*/
public X_AD_Workflow (Properties ctx, int AD_Workflow_ID, String trxName)
{
super (ctx, AD_Workflow_ID, trxName);
/** if (AD_Workflow_ID == 0)
{
setAD_Workflow_ID (0);
setAccessLevel (null);
setAuthor (null);
setCost (0);
setDuration (0);
setEntityType (null);	// U
setIsDefault (false);
setIsValid (false);
setName (null);
setPublishStatus (null);	// U
setValue (null);
setVersion (0);
setWaitingTime (0);
setWorkflowType (null);	// G
setWorkingTime (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_Workflow (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** TableName=AD_Workflow */
public static final String Table_Name="AD_Workflow";

/** AD_Table_ID=117 */
public static final int Table_ID=MTable.getTable_ID(Table_Name);

protected static KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

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
StringBuffer sb = new StringBuffer ("X_AD_Workflow[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Table.
@param AD_Table_ID Database Table information */
public void setAD_Table_ID (int AD_Table_ID)
{
if (AD_Table_ID <= 0) set_Value ("AD_Table_ID", null);
 else 
set_Value ("AD_Table_ID", Integer.valueOf(AD_Table_ID));
}
/** Get Table.
@return Database Table information */
public int getAD_Table_ID() 
{
Integer ii = (Integer)get_Value("AD_Table_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_Table_ID */
public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
/** Set Node.
@param AD_WF_Node_ID Workflow Node (activity), step or process */
public void setAD_WF_Node_ID (int AD_WF_Node_ID)
{
if (AD_WF_Node_ID <= 0) set_Value ("AD_WF_Node_ID", null);
 else 
set_Value ("AD_WF_Node_ID", Integer.valueOf(AD_WF_Node_ID));
}
/** Get Node.
@return Workflow Node (activity), step or process */
public int getAD_WF_Node_ID() 
{
Integer ii = (Integer)get_Value("AD_WF_Node_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_WF_Node_ID */
public static final String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
/** Set Workflow Responsible.
@param AD_WF_Responsible_ID Responsible for Workflow Execution */
public void setAD_WF_Responsible_ID (int AD_WF_Responsible_ID)
{
if (AD_WF_Responsible_ID <= 0) set_Value ("AD_WF_Responsible_ID", null);
 else 
set_Value ("AD_WF_Responsible_ID", Integer.valueOf(AD_WF_Responsible_ID));
}
/** Get Workflow Responsible.
@return Responsible for Workflow Execution */
public int getAD_WF_Responsible_ID() 
{
Integer ii = (Integer)get_Value("AD_WF_Responsible_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_WF_Responsible_ID */
public static final String COLUMNNAME_AD_WF_Responsible_ID = "AD_WF_Responsible_ID";
/** Set Workflow Processor.
@param AD_WorkflowProcessor_ID Workflow Processor Server */
public void setAD_WorkflowProcessor_ID (int AD_WorkflowProcessor_ID)
{
if (AD_WorkflowProcessor_ID <= 0) set_Value ("AD_WorkflowProcessor_ID", null);
 else 
set_Value ("AD_WorkflowProcessor_ID", Integer.valueOf(AD_WorkflowProcessor_ID));
}
/** Get Workflow Processor.
@return Workflow Processor Server */
public int getAD_WorkflowProcessor_ID() 
{
Integer ii = (Integer)get_Value("AD_WorkflowProcessor_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_WorkflowProcessor_ID */
public static final String COLUMNNAME_AD_WorkflowProcessor_ID = "AD_WorkflowProcessor_ID";
/** Set Workflow.
@param AD_Workflow_ID Workflow or combination of tasks */
public void setAD_Workflow_ID (int AD_Workflow_ID)
{
if (AD_Workflow_ID < 1) throw new IllegalArgumentException ("AD_Workflow_ID is mandatory.");
set_ValueNoCheck ("AD_Workflow_ID", Integer.valueOf(AD_Workflow_ID));
}
/** Get Workflow.
@return Workflow or combination of tasks */
public int getAD_Workflow_ID() 
{
Integer ii = (Integer)get_Value("AD_Workflow_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_Workflow_ID */
public static final String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";

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
/** Column name AccessLevel */
public static final String COLUMNNAME_AccessLevel = "AccessLevel";
/** Set Author.
@param Author Author/Creator of the Entity */
public void setAuthor (String Author)
{
if (Author == null) throw new IllegalArgumentException ("Author is mandatory.");
if (Author.length() > 20)
{
log.warning("Length > 20 - truncated");
Author = Author.substring(0,19);
}
set_Value ("Author", Author);
}
/** Get Author.
@return Author/Creator of the Entity */
public String getAuthor() 
{
return (String)get_Value("Author");
}
/** Column name Author */
public static final String COLUMNNAME_Author = "Author";
/** Set Cost.
@param Cost Cost information */
public void setCost (int Cost)
{
set_Value ("Cost", Integer.valueOf(Cost));
}
/** Get Cost.
@return Cost information */
public int getCost() 
{
Integer ii = (Integer)get_Value("Cost");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name Cost */
public static final String COLUMNNAME_Cost = "Cost";
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
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Document Value Logic.
@param DocValueLogic Logic to determine Workflow Start - If true, a workflow process is started for the document */
public void setDocValueLogic (String DocValueLogic)
{
if (DocValueLogic != null && DocValueLogic.length() > 2000)
{
log.warning("Length > 2000 - truncated");
DocValueLogic = DocValueLogic.substring(0,1999);
}
set_Value ("DocValueLogic", DocValueLogic);
}
/** Get Document Value Logic.
@return Logic to determine Workflow Start - If true, a workflow process is started for the document */
public String getDocValueLogic() 
{
return (String)get_Value("DocValueLogic");
}
/** Column name DocValueLogic */
public static final String COLUMNNAME_DocValueLogic = "DocValueLogic";
/** Set Duration.
@param Duration Normal Duration in Duration Unit */
public void setDuration (int Duration)
{
set_Value ("Duration", Integer.valueOf(Duration));
}
/** Get Duration.
@return Normal Duration in Duration Unit */
public int getDuration() 
{
Integer ii = (Integer)get_Value("Duration");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name Duration */
public static final String COLUMNNAME_Duration = "Duration";

/** DurationUnit AD_Reference_ID=299 */
public static final int DURATIONUNIT_AD_Reference_ID=299;
/** Day = D */
public static final String DURATIONUNIT_Day = "D";
/** Month = M */
public static final String DURATIONUNIT_Month = "M";
/** Year = Y */
public static final String DURATIONUNIT_Year = "Y";
/** hour = h */
public static final String DURATIONUNIT_Hour = "h";
/** minute = m */
public static final String DURATIONUNIT_Minute = "m";
/** second = s */
public static final String DURATIONUNIT_Second = "s";
/** Set Duration Unit.
@param DurationUnit Unit of Duration */
public void setDurationUnit (String DurationUnit)
{
if (DurationUnit == null || DurationUnit.equals("D") || DurationUnit.equals("M") || DurationUnit.equals("Y") || DurationUnit.equals("h") || DurationUnit.equals("m") || DurationUnit.equals("s"));
 else throw new IllegalArgumentException ("DurationUnit Invalid value - " + DurationUnit + " - Reference_ID=299 - D - M - Y - h - m - s");
if (DurationUnit != null && DurationUnit.length() > 1)
{
log.warning("Length > 1 - truncated");
DurationUnit = DurationUnit.substring(0,0);
}
set_Value ("DurationUnit", DurationUnit);
}
/** Get Duration Unit.
@return Unit of Duration */
public String getDurationUnit() 
{
return (String)get_Value("DurationUnit");
}
/** Column name DurationUnit */
public static final String COLUMNNAME_DurationUnit = "DurationUnit";

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
/** Column name EntityType */
public static final String COLUMNNAME_EntityType = "EntityType";
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
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
/** Set Default.
@param IsDefault Default value */
public void setIsDefault (boolean IsDefault)
{
set_Value ("IsDefault", Boolean.valueOf(IsDefault));
}
/** Get Default.
@return Default value */
public boolean isDefault() 
{
Object oo = get_Value("IsDefault");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
/** Set Valid.
@param IsValid Element is valid */
public void setIsValid (boolean IsValid)
{
set_Value ("IsValid", Boolean.valueOf(IsValid));
}
/** Get Valid.
@return Element is valid */
public boolean isValid() 
{
Object oo = get_Value("IsValid");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Column name IsValid */
public static final String COLUMNNAME_IsValid = "IsValid";
/** Set Duration Limit.
@param Limit Maximum Duration in Duration Unit */
public void setLimit (int Limit)
{
set_Value ("Limit", Integer.valueOf(Limit));
}
/** Get Duration Limit.
@return Maximum Duration in Duration Unit */
public int getLimit() 
{
Integer ii = (Integer)get_Value("Limit");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name Limit */
public static final String COLUMNNAME_Limit = "Limit";
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
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Priority.
@param Priority Indicates if this request is of a high, medium or low priority. */
public void setPriority (int Priority)
{
set_Value ("Priority", Integer.valueOf(Priority));
}
/** Get Priority.
@return Indicates if this request is of a high, medium or low priority. */
public int getPriority() 
{
Integer ii = (Integer)get_Value("Priority");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name Priority */
public static final String COLUMNNAME_Priority = "Priority";

/** PublishStatus AD_Reference_ID=310 */
public static final int PUBLISHSTATUS_AD_Reference_ID=310;
/** Released = R */
public static final String PUBLISHSTATUS_Released = "R";
/** Test = T */
public static final String PUBLISHSTATUS_Test = "T";
/** Under Revision = U */
public static final String PUBLISHSTATUS_UnderRevision = "U";
/** Void = V */
public static final String PUBLISHSTATUS_Void = "V";
/** Set Publication Status.
@param PublishStatus Status of Publication */
public void setPublishStatus (String PublishStatus)
{
if (PublishStatus == null) throw new IllegalArgumentException ("PublishStatus is mandatory");
if (PublishStatus.equals("R") || PublishStatus.equals("T") || PublishStatus.equals("U") || PublishStatus.equals("V"));
 else throw new IllegalArgumentException ("PublishStatus Invalid value - " + PublishStatus + " - Reference_ID=310 - R - T - U - V");
if (PublishStatus.length() > 1)
{
log.warning("Length > 1 - truncated");
PublishStatus = PublishStatus.substring(0,0);
}
set_Value ("PublishStatus", PublishStatus);
}
/** Get Publication Status.
@return Status of Publication */
public String getPublishStatus() 
{
return (String)get_Value("PublishStatus");
}
/** Column name PublishStatus */
public static final String COLUMNNAME_PublishStatus = "PublishStatus";
/** Set Valid from.
@param ValidFrom Valid from including this date (first day) */
public void setValidFrom (Timestamp ValidFrom)
{
set_Value ("ValidFrom", ValidFrom);
}
/** Get Valid from.
@return Valid from including this date (first day) */
public Timestamp getValidFrom() 
{
return (Timestamp)get_Value("ValidFrom");
}
/** Column name ValidFrom */
public static final String COLUMNNAME_ValidFrom = "ValidFrom";
/** Set Valid to.
@param ValidTo Valid to including this date (last day) */
public void setValidTo (Timestamp ValidTo)
{
set_Value ("ValidTo", ValidTo);
}
/** Get Valid to.
@return Valid to including this date (last day) */
public Timestamp getValidTo() 
{
return (Timestamp)get_Value("ValidTo");
}
/** Column name ValidTo */
public static final String COLUMNNAME_ValidTo = "ValidTo";
/** Set Validate Workflow.
@param ValidateWorkflow Validate Workflow */
public void setValidateWorkflow (String ValidateWorkflow)
{
if (ValidateWorkflow != null && ValidateWorkflow.length() > 1)
{
log.warning("Length > 1 - truncated");
ValidateWorkflow = ValidateWorkflow.substring(0,0);
}
set_Value ("ValidateWorkflow", ValidateWorkflow);
}
/** Get Validate Workflow.
@return Validate Workflow */
public String getValidateWorkflow() 
{
return (String)get_Value("ValidateWorkflow");
}
/** Column name ValidateWorkflow */
public static final String COLUMNNAME_ValidateWorkflow = "ValidateWorkflow";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Value = Value.substring(0,39);
}
set_Value ("Value", Value);
}
/** Get Search Key.
@return Search key for the record in the format required - must be unique */
public String getValue() 
{
return (String)get_Value("Value");
}
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
/** Set Version.
@param Version Version of the table definition */
public void setVersion (int Version)
{
set_Value ("Version", Integer.valueOf(Version));
}
/** Get Version.
@return Version of the table definition */
public int getVersion() 
{
Integer ii = (Integer)get_Value("Version");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name Version */
public static final String COLUMNNAME_Version = "Version";
/** Set Waiting Time.
@param WaitingTime Workflow Simulation Waiting time */
public void setWaitingTime (int WaitingTime)
{
set_Value ("WaitingTime", Integer.valueOf(WaitingTime));
}
/** Get Waiting Time.
@return Workflow Simulation Waiting time */
public int getWaitingTime() 
{
Integer ii = (Integer)get_Value("WaitingTime");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name WaitingTime */
public static final String COLUMNNAME_WaitingTime = "WaitingTime";

/** WorkflowType AD_Reference_ID=328 */
public static final int WORKFLOWTYPE_AD_Reference_ID=328;
/** General = G */
public static final String WORKFLOWTYPE_General = "G";
/** Document Process = P */
public static final String WORKFLOWTYPE_DocumentProcess = "P";
/** Document Value = V */
public static final String WORKFLOWTYPE_DocumentValue = "V";
/** Set Workflow Type.
@param WorkflowType Type of Worflow */
public void setWorkflowType (String WorkflowType)
{
if (WorkflowType == null) throw new IllegalArgumentException ("WorkflowType is mandatory");
if (WorkflowType.equals("G") || WorkflowType.equals("P") || WorkflowType.equals("V"));
 else throw new IllegalArgumentException ("WorkflowType Invalid value - " + WorkflowType + " - Reference_ID=328 - G - P - V");
if (WorkflowType.length() > 1)
{
log.warning("Length > 1 - truncated");
WorkflowType = WorkflowType.substring(0,0);
}
set_Value ("WorkflowType", WorkflowType);
}
/** Get Workflow Type.
@return Type of Worflow */
public String getWorkflowType() 
{
return (String)get_Value("WorkflowType");
}
/** Column name WorkflowType */
public static final String COLUMNNAME_WorkflowType = "WorkflowType";
/** Set Working Time.
@param WorkingTime Workflow Simulation Execution Time */
public void setWorkingTime (int WorkingTime)
{
set_Value ("WorkingTime", Integer.valueOf(WorkingTime));
}
/** Get Working Time.
@return Workflow Simulation Execution Time */
public int getWorkingTime() 
{
Integer ii = (Integer)get_Value("WorkingTime");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name WorkingTime */
public static final String COLUMNNAME_WorkingTime = "WorkingTime";
}
