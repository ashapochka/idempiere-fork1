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
/** Generated Model for CM_Container
 *  @author Jorg Janke (generated) 
 *  @version Release 2.5.3d - 2006-10-10 21:55:55.796 */
public class X_CM_Container extends PO
{
/** Standard Constructor
@param ctx context
@param CM_Container_ID id
@param trxName transaction
*/
public X_CM_Container (Properties ctx, int CM_Container_ID, String trxName)
{
super (ctx, CM_Container_ID, trxName);
/** if (CM_Container_ID == 0)
{
setCM_Container_ID (0);
setCM_Template_ID (0);
setCM_WebProject_ID (0);
setContainerType (null);	// D
setIsIndexed (false);
setIsSecure (false);
setIsSummary (false);
setMeta_Description (null);
setMeta_Keywords (null);
setName (null);
setNotice (null);
setPriority (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_CM_Container (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=855 */
public static final int Table_ID=855;

/** TableName=CM_Container */
public static final String Table_Name="CM_Container";

protected static KeyNamePair Model = new KeyNamePair(855,"CM_Container");

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
StringBuffer sb = new StringBuffer ("X_CM_Container[").append(get_ID()).append("]");
return sb.toString();
}

/** CM_ContainerLink_ID AD_Reference_ID=386 */
public static final int CM_CONTAINERLINK_ID_AD_Reference_ID=386;
/** Set Container Link.
@param CM_ContainerLink_ID Link to another Container in the Web Project */
public void setCM_ContainerLink_ID (int CM_ContainerLink_ID)
{
if (CM_ContainerLink_ID <= 0) set_Value ("CM_ContainerLink_ID", null);
 else 
set_Value ("CM_ContainerLink_ID", new Integer(CM_ContainerLink_ID));
}
/** Get Container Link.
@return Link to another Container in the Web Project */
public int getCM_ContainerLink_ID() 
{
Integer ii = (Integer)get_Value("CM_ContainerLink_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Web Container.
@param CM_Container_ID Web Container contains content like images, text etc. */
public void setCM_Container_ID (int CM_Container_ID)
{
if (CM_Container_ID < 1) throw new IllegalArgumentException ("CM_Container_ID is mandatory.");
set_ValueNoCheck ("CM_Container_ID", new Integer(CM_Container_ID));
}
/** Get Web Container.
@return Web Container contains content like images, text etc. */
public int getCM_Container_ID() 
{
Integer ii = (Integer)get_Value("CM_Container_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Template.
@param CM_Template_ID Template defines how content is displayed */
public void setCM_Template_ID (int CM_Template_ID)
{
if (CM_Template_ID < 1) throw new IllegalArgumentException ("CM_Template_ID is mandatory.");
set_ValueNoCheck ("CM_Template_ID", new Integer(CM_Template_ID));
}
/** Get Template.
@return Template defines how content is displayed */
public int getCM_Template_ID() 
{
Integer ii = (Integer)get_Value("CM_Template_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Web Project.
@param CM_WebProject_ID A web project is the main data container for Containers, URLs, Ads, Media etc. */
public void setCM_WebProject_ID (int CM_WebProject_ID)
{
if (CM_WebProject_ID < 1) throw new IllegalArgumentException ("CM_WebProject_ID is mandatory.");
set_ValueNoCheck ("CM_WebProject_ID", new Integer(CM_WebProject_ID));
}
/** Get Web Project.
@return A web project is the main data container for Containers, URLs, Ads, Media etc. */
public int getCM_WebProject_ID() 
{
Integer ii = (Integer)get_Value("CM_WebProject_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set External Link (URL).
@param ContainerLinkURL External Link (IRL) for the Container */
public void setContainerLinkURL (String ContainerLinkURL)
{
if (ContainerLinkURL != null && ContainerLinkURL.length() > 60)
{
log.warning("Length > 60 - truncated");
ContainerLinkURL = ContainerLinkURL.substring(0,59);
}
set_Value ("ContainerLinkURL", ContainerLinkURL);
}
/** Get External Link (URL).
@return External Link (IRL) for the Container */
public String getContainerLinkURL() 
{
return (String)get_Value("ContainerLinkURL");
}

/** ContainerType AD_Reference_ID=385 */
public static final int CONTAINERTYPE_AD_Reference_ID=385;
/** Document = D */
public static final String CONTAINERTYPE_Document = "D";
/** Internal Link = L */
public static final String CONTAINERTYPE_InternalLink = "L";
/** External URL = U */
public static final String CONTAINERTYPE_ExternalURL = "U";
/** Set Web Container Type.
@param ContainerType Web Container Type */
public void setContainerType (String ContainerType)
{
if (ContainerType == null) throw new IllegalArgumentException ("ContainerType is mandatory");
if (ContainerType.equals("D") || ContainerType.equals("L") || ContainerType.equals("U"));
 else throw new IllegalArgumentException ("ContainerType Invalid value - " + ContainerType + " - Reference_ID=385 - D - L - U");
if (ContainerType.length() > 1)
{
log.warning("Length > 1 - truncated");
ContainerType = ContainerType.substring(0,0);
}
set_Value ("ContainerType", ContainerType);
}
/** Get Web Container Type.
@return Web Container Type */
public String getContainerType() 
{
return (String)get_Value("ContainerType");
}
/** Set ContainerXML.
@param ContainerXML Autogenerated Containerdefinition as XML Code */
public void setContainerXML (String ContainerXML)
{
if (ContainerXML != null && ContainerXML.length() > 2000)
{
log.warning("Length > 2000 - truncated");
ContainerXML = ContainerXML.substring(0,1999);
}
set_ValueNoCheck ("ContainerXML", ContainerXML);
}
/** Get ContainerXML.
@return Autogenerated Containerdefinition as XML Code */
public String getContainerXML() 
{
return (String)get_Value("ContainerXML");
}
/** Set Description.
@param Description Optional short description of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Description = Description.substring(0,1999);
}
set_Value ("Description", Description);
}
/** Get Description.
@return Optional short description of the record */
public String getDescription() 
{
return (String)get_Value("Description");
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
/** Set Indexed.
@param IsIndexed Index the document for the internal search engine */
public void setIsIndexed (boolean IsIndexed)
{
set_Value ("IsIndexed", new Boolean(IsIndexed));
}
/** Get Indexed.
@return Index the document for the internal search engine */
public boolean isIndexed() 
{
Object oo = get_Value("IsIndexed");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Set Secure content.
@param IsSecure Defines whether content needs to get encrypted */
public void setIsSecure (boolean IsSecure)
{
set_Value ("IsSecure", new Boolean(IsSecure));
}
/** Get Secure content.
@return Defines whether content needs to get encrypted */
public boolean isSecure() 
{
Object oo = get_Value("IsSecure");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Set Summary Level.
@param IsSummary This is a summary entity */
public void setIsSummary (boolean IsSummary)
{
set_ValueNoCheck ("IsSummary", new Boolean(IsSummary));
}
/** Get Summary Level.
@return This is a summary entity */
public boolean isSummary() 
{
Object oo = get_Value("IsSummary");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Set Valid.
@param IsValid Element is valid */
public void setIsValid (boolean IsValid)
{
set_Value ("IsValid", new Boolean(IsValid));
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
/** Set Meta Author.
@param Meta_Author Author of the content */
public void setMeta_Author (String Meta_Author)
{
if (Meta_Author != null && Meta_Author.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Meta_Author = Meta_Author.substring(0,1999);
}
set_Value ("Meta_Author", Meta_Author);
}
/** Get Meta Author.
@return Author of the content */
public String getMeta_Author() 
{
return (String)get_Value("Meta_Author");
}
/** Set Meta Content Type.
@param Meta_Content Defines the type of content i.e. "text/html;
 charset=UTF-8" */
public void setMeta_Content (String Meta_Content)
{
if (Meta_Content != null && Meta_Content.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Meta_Content = Meta_Content.substring(0,1999);
}
set_Value ("Meta_Content", Meta_Content);
}
/** Get Meta Content Type.
@return Defines the type of content i.e. "text/html;
 charset=UTF-8" */
public String getMeta_Content() 
{
return (String)get_Value("Meta_Content");
}
/** Set Meta Copyright.
@param Meta_Copyright Contains Copyright information for the content */
public void setMeta_Copyright (String Meta_Copyright)
{
if (Meta_Copyright != null && Meta_Copyright.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Meta_Copyright = Meta_Copyright.substring(0,1999);
}
set_Value ("Meta_Copyright", Meta_Copyright);
}
/** Get Meta Copyright.
@return Contains Copyright information for the content */
public String getMeta_Copyright() 
{
return (String)get_Value("Meta_Copyright");
}
/** Set Meta Description.
@param Meta_Description Meta info describing the contents of the page */
public void setMeta_Description (String Meta_Description)
{
if (Meta_Description == null) throw new IllegalArgumentException ("Meta_Description is mandatory.");
if (Meta_Description.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Meta_Description = Meta_Description.substring(0,1999);
}
set_Value ("Meta_Description", Meta_Description);
}
/** Get Meta Description.
@return Meta info describing the contents of the page */
public String getMeta_Description() 
{
return (String)get_Value("Meta_Description");
}
/** Set Meta Keywords.
@param Meta_Keywords Contains the keywords for the content */
public void setMeta_Keywords (String Meta_Keywords)
{
if (Meta_Keywords == null) throw new IllegalArgumentException ("Meta_Keywords is mandatory.");
if (Meta_Keywords.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Meta_Keywords = Meta_Keywords.substring(0,1999);
}
set_Value ("Meta_Keywords", Meta_Keywords);
}
/** Get Meta Keywords.
@return Contains the keywords for the content */
public String getMeta_Keywords() 
{
return (String)get_Value("Meta_Keywords");
}
/** Set Meta Language.
@param Meta_Language Language HTML Meta Tag */
public void setMeta_Language (String Meta_Language)
{
if (Meta_Language != null && Meta_Language.length() > 2)
{
log.warning("Length > 2 - truncated");
Meta_Language = Meta_Language.substring(0,1);
}
set_Value ("Meta_Language", Meta_Language);
}
/** Get Meta Language.
@return Language HTML Meta Tag */
public String getMeta_Language() 
{
return (String)get_Value("Meta_Language");
}
/** Set Meta Publisher.
@param Meta_Publisher Meta Publisher defines the publisher of the content */
public void setMeta_Publisher (String Meta_Publisher)
{
if (Meta_Publisher != null && Meta_Publisher.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Meta_Publisher = Meta_Publisher.substring(0,1999);
}
set_Value ("Meta_Publisher", Meta_Publisher);
}
/** Get Meta Publisher.
@return Meta Publisher defines the publisher of the content */
public String getMeta_Publisher() 
{
return (String)get_Value("Meta_Publisher");
}
/** Set Meta RobotsTag.
@param Meta_RobotsTag RobotsTag defines how search robots should handle this content */
public void setMeta_RobotsTag (String Meta_RobotsTag)
{
if (Meta_RobotsTag != null && Meta_RobotsTag.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Meta_RobotsTag = Meta_RobotsTag.substring(0,1999);
}
set_Value ("Meta_RobotsTag", Meta_RobotsTag);
}
/** Get Meta RobotsTag.
@return RobotsTag defines how search robots should handle this content */
public String getMeta_RobotsTag() 
{
return (String)get_Value("Meta_RobotsTag");
}
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 120)
{
log.warning("Length > 120 - truncated");
Name = Name.substring(0,119);
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
/** Set Notice.
@param Notice Contains last write notice */
public void setNotice (String Notice)
{
if (Notice == null) throw new IllegalArgumentException ("Notice is mandatory.");
if (Notice.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Notice = Notice.substring(0,1999);
}
set_Value ("Notice", Notice);
}
/** Get Notice.
@return Contains last write notice */
public String getNotice() 
{
return (String)get_Value("Notice");
}
/** Set Priority.
@param Priority Indicates if this request is of a high, medium or low priority. */
public void setPriority (int Priority)
{
set_Value ("Priority", new Integer(Priority));
}
/** Get Priority.
@return Indicates if this request is of a high, medium or low priority. */
public int getPriority() 
{
Integer ii = (Integer)get_Value("Priority");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Relative URL.
@param RelativeURL Contains the relative URL for the container */
public void setRelativeURL (String RelativeURL)
{
if (RelativeURL != null && RelativeURL.length() > 120)
{
log.warning("Length > 120 - truncated");
RelativeURL = RelativeURL.substring(0,119);
}
set_Value ("RelativeURL", RelativeURL);
}
/** Get Relative URL.
@return Contains the relative URL for the container */
public String getRelativeURL() 
{
return (String)get_Value("RelativeURL");
}
/** Set StructureXML.
@param StructureXML Autogenerated Containerdefinition as XML Code */
public void setStructureXML (String StructureXML)
{
if (StructureXML != null && StructureXML.length() > 2000)
{
log.warning("Length > 2000 - truncated");
StructureXML = StructureXML.substring(0,1999);
}
set_Value ("StructureXML", StructureXML);
}
/** Get StructureXML.
@return Autogenerated Containerdefinition as XML Code */
public String getStructureXML() 
{
return (String)get_Value("StructureXML");
}
/** Set Title.
@param Title Name this entity is referred to as */
public void setTitle (String Title)
{
if (Title != null && Title.length() > 60)
{
log.warning("Length > 60 - truncated");
Title = Title.substring(0,59);
}
set_Value ("Title", Title);
}
/** Get Title.
@return Name this entity is referred to as */
public String getTitle() 
{
return (String)get_Value("Title");
}
}
