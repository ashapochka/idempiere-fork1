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

import java.math.BigDecimal;
import org.compiere.util.KeyNamePair;

/** Generated Interface for ASP_ClientLevel
 *  @author Trifon Trifonov (generated) 
 *  @version Release 3.5.1a
 */
public interface I_ASP_ClientLevel 
{

    /** TableName=ASP_ClientLevel */
    public static final String Table_Name = "ASP_ClientLevel";

    /** AD_Table_ID=53056 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 2 - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /** Column name ASP_ClientLevel_ID */
    public static final String COLUMNNAME_ASP_ClientLevel_ID = "ASP_ClientLevel_ID";

	/** Set Client Level	  */
	public void setASP_ClientLevel_ID (int ASP_ClientLevel_ID);

	/** Get Client Level	  */
	public int getASP_ClientLevel_ID();

    /** Column name ASP_Level_ID */
    public static final String COLUMNNAME_ASP_Level_ID = "ASP_Level_ID";

	/** Set ASP Level	  */
	public void setASP_Level_ID (int ASP_Level_ID);

	/** Get ASP Level	  */
	public int getASP_Level_ID();

	public I_ASP_Level getASP_Level() throws Exception;

    /** Column name ASP_Module_ID */
    public static final String COLUMNNAME_ASP_Module_ID = "ASP_Module_ID";

	/** Set ASP Module	  */
	public void setASP_Module_ID (int ASP_Module_ID);

	/** Get ASP Module	  */
	public int getASP_Module_ID();

	public I_ASP_Module getASP_Module() throws Exception;

    /** Column name Help */
    public static final String COLUMNNAME_Help = "Help";

	/** Set Comment/Help.
	  * Comment or Hint
	  */
	public void setHelp (String Help);

	/** Get Comment/Help.
	  * Comment or Hint
	  */
	public String getHelp();
}
