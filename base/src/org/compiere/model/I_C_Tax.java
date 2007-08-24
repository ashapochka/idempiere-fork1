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

    /** Generated Interface for C_Tax
     *  @author Trifon Trifonov (generated) 
     *  @version Release 3.3.0 - 2007-08-24 11:39:45.625
     */
    public interface I_C_Tax 
{

    /** TableName=C_Tax */
    public static final String Table_Name = "C_Tax";

    /** AD_Table_ID=261 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 2 - Client 
     */
    BigDecimal accessLevel = new BigDecimal(2);

    /** Load Meta Data */

    /** Column name C_Country_ID */
    public static final String COLUMNNAME_C_Country_ID = "C_Country_ID";

	/** Set Country.
	  * Country 
	  */
	public void setC_Country_ID (int C_Country_ID);

	/** Get Country.
	  * Country 
	  */
	public int getC_Country_ID();

    /** Column name C_Region_ID */
    public static final String COLUMNNAME_C_Region_ID = "C_Region_ID";

	/** Set Region.
	  * Identifies a geographical Region
	  */
	public void setC_Region_ID (int C_Region_ID);

	/** Get Region.
	  * Identifies a geographical Region
	  */
	public int getC_Region_ID();

    /** Column name C_TaxCategory_ID */
    public static final String COLUMNNAME_C_TaxCategory_ID = "C_TaxCategory_ID";

	/** Set Tax Category.
	  * Tax Category
	  */
	public void setC_TaxCategory_ID (int C_TaxCategory_ID);

	/** Get Tax Category.
	  * Tax Category
	  */
	public int getC_TaxCategory_ID();

	public I_C_TaxCategory getI_C_TaxCategory() throws Exception;

    /** Column name C_Tax_ID */
    public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";

	/** Set Tax.
	  * Tax identifier
	  */
	public void setC_Tax_ID (int C_Tax_ID);

	/** Get Tax.
	  * Tax identifier
	  */
	public int getC_Tax_ID();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name IsDefault */
    public static final String COLUMNNAME_IsDefault = "IsDefault";

	/** Set Default.
	  * Default value
	  */
	public void setIsDefault (boolean IsDefault);

	/** Get Default.
	  * Default value
	  */
	public boolean isDefault();

    /** Column name IsDocumentLevel */
    public static final String COLUMNNAME_IsDocumentLevel = "IsDocumentLevel";

	/** Set Document Level.
	  * Tax is calculated on document level (rather than line by line)
	  */
	public void setIsDocumentLevel (boolean IsDocumentLevel);

	/** Get Document Level.
	  * Tax is calculated on document level (rather than line by line)
	  */
	public boolean isDocumentLevel();

    /** Column name IsSalesTax */
    public static final String COLUMNNAME_IsSalesTax = "IsSalesTax";

	/** Set Sales Tax.
	  * This is a sales tax (i.e. not a value added tax)
	  */
	public void setIsSalesTax (boolean IsSalesTax);

	/** Get Sales Tax.
	  * This is a sales tax (i.e. not a value added tax)
	  */
	public boolean isSalesTax();

    /** Column name IsSummary */
    public static final String COLUMNNAME_IsSummary = "IsSummary";

	/** Set Summary Level.
	  * This is a summary entity
	  */
	public void setIsSummary (boolean IsSummary);

	/** Get Summary Level.
	  * This is a summary entity
	  */
	public boolean isSummary();

    /** Column name IsTaxExempt */
    public static final String COLUMNNAME_IsTaxExempt = "IsTaxExempt";

	/** Set Tax exempt.
	  * Business partner is exempt from tax
	  */
	public void setIsTaxExempt (boolean IsTaxExempt);

	/** Get Tax exempt.
	  * Business partner is exempt from tax
	  */
	public boolean isTaxExempt();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name Parent_Tax_ID */
    public static final String COLUMNNAME_Parent_Tax_ID = "Parent_Tax_ID";

	/** Set Parent Tax.
	  * Parent Tax indicates a tax that is made up of multiple taxes
	  */
	public void setParent_Tax_ID (int Parent_Tax_ID);

	/** Get Parent Tax.
	  * Parent Tax indicates a tax that is made up of multiple taxes
	  */
	public int getParent_Tax_ID();

    /** Column name Rate */
    public static final String COLUMNNAME_Rate = "Rate";

	/** Set Rate.
	  * Rate or Tax or Exchange
	  */
	public void setRate (BigDecimal Rate);

	/** Get Rate.
	  * Rate or Tax or Exchange
	  */
	public BigDecimal getRate();

    /** Column name RequiresTaxCertificate */
    public static final String COLUMNNAME_RequiresTaxCertificate = "RequiresTaxCertificate";

	/** Set Requires Tax Certificate.
	  * This tax rate requires the Business Partner to be tax exempt
	  */
	public void setRequiresTaxCertificate (boolean RequiresTaxCertificate);

	/** Get Requires Tax Certificate.
	  * This tax rate requires the Business Partner to be tax exempt
	  */
	public boolean isRequiresTaxCertificate();

    /** Column name SOPOType */
    public static final String COLUMNNAME_SOPOType = "SOPOType";

	/** Set SO/PO Type.
	  * Sales Tax applies to sales situations, Purchase Tax to purchase situations
	  */
	public void setSOPOType (String SOPOType);

	/** Get SO/PO Type.
	  * Sales Tax applies to sales situations, Purchase Tax to purchase situations
	  */
	public String getSOPOType();

    /** Column name TaxIndicator */
    public static final String COLUMNNAME_TaxIndicator = "TaxIndicator";

	/** Set Tax Indicator.
	  * Short form for Tax to be printed on documents
	  */
	public void setTaxIndicator (String TaxIndicator);

	/** Get Tax Indicator.
	  * Short form for Tax to be printed on documents
	  */
	public String getTaxIndicator();

    /** Column name To_Country_ID */
    public static final String COLUMNNAME_To_Country_ID = "To_Country_ID";

	/** Set To.
	  * Receiving Country
	  */
	public void setTo_Country_ID (int To_Country_ID);

	/** Get To.
	  * Receiving Country
	  */
	public int getTo_Country_ID();

    /** Column name To_Region_ID */
    public static final String COLUMNNAME_To_Region_ID = "To_Region_ID";

	/** Set To.
	  * Receiving Region
	  */
	public void setTo_Region_ID (int To_Region_ID);

	/** Get To.
	  * Receiving Region
	  */
	public int getTo_Region_ID();

    /** Column name ValidFrom */
    public static final String COLUMNNAME_ValidFrom = "ValidFrom";

	/** Set Valid from.
	  * Valid from including this date (first day)
	  */
	public void setValidFrom (Timestamp ValidFrom);

	/** Get Valid from.
	  * Valid from including this date (first day)
	  */
	public Timestamp getValidFrom();
}
