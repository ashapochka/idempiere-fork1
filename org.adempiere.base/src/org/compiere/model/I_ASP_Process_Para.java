/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for ASP_Process_Para
 *  @author iDempiere (generated) 
 *  @version Release 2.1
 */
public interface I_ASP_Process_Para 
{

    /** TableName=ASP_Process_Para */
    public static final String Table_Name = "ASP_Process_Para";

    /** AD_Table_ID=53050 */
    public static final int Table_ID = 53050;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 4 - System 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name AD_Process_Para_ID */
    public static final String COLUMNNAME_AD_Process_Para_ID = "AD_Process_Para_ID";

	/** Set Process Parameter	  */
	public void setAD_Process_Para_ID (int AD_Process_Para_ID);

	/** Get Process Parameter	  */
	public int getAD_Process_Para_ID();

	public org.compiere.model.I_AD_Process_Para getAD_Process_Para() throws RuntimeException;

    /** Column name ASP_Process_ID */
    public static final String COLUMNNAME_ASP_Process_ID = "ASP_Process_ID";

	/** Set ASP Process	  */
	public void setASP_Process_ID (int ASP_Process_ID);

	/** Get ASP Process	  */
	public int getASP_Process_ID();

	public org.compiere.model.I_ASP_Process getASP_Process() throws RuntimeException;

    /** Column name ASP_Process_Para_ID */
    public static final String COLUMNNAME_ASP_Process_Para_ID = "ASP_Process_Para_ID";

	/** Set ASP Process Parameter	  */
	public void setASP_Process_Para_ID (int ASP_Process_Para_ID);

	/** Get ASP Process Parameter	  */
	public int getASP_Process_Para_ID();

    /** Column name ASP_Process_Para_UU */
    public static final String COLUMNNAME_ASP_Process_Para_UU = "ASP_Process_Para_UU";

	/** Set ASP_Process_Para_UU	  */
	public void setASP_Process_Para_UU (String ASP_Process_Para_UU);

	/** Get ASP_Process_Para_UU	  */
	public String getASP_Process_Para_UU();

    /** Column name ASP_Status */
    public static final String COLUMNNAME_ASP_Status = "ASP_Status";

	/** Set ASP Status	  */
	public void setASP_Status (String ASP_Status);

	/** Get ASP Status	  */
	public String getASP_Status();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();
}
