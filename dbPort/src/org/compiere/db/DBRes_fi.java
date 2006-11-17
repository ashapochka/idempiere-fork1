/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                        *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.db;

import java.util.*;

/**
 *  Connection Resource Strings for Finnish language
 *
 * 	@author 	Petteri Soininen (petteri.soininen@netorek.fi)
 * 	@version 	$Id: DBRes_fi.java,v 1.2 2006/07/30 00:55:13 jjanke Exp $
 */
public class DBRes_fi extends ListResourceBundle
{
	/** 
    * Data 
    */
	static final Object[][] contents = new String[][]{
	{ "CConnectionDialog", 	"Adempiere-yhteys" },
	{ "Name", 				"Nimi" },
	{ "AppsHost", 			"Sovellusverkkoasema" },
	{ "AppsPort", 			"Sovellusportti" },
	{ "TestApps", 			"Testisovelluspalvelin" },
	{ "DBHost", 			"Tietokantaverkkoasema" },
	{ "DBPort", 			"Tietokantaportti" },
	{ "DBName", 			"Tietokannan nimi" },
	{ "DBUidPwd", 			"K�ytt�j�tunnus / Salasana" },
	{ "ViaFirewall", 		"Palomuurin l�pi" },
	{ "FWHost", 			"Palomuuriverkkoasema" },
	{ "FWPort", 			"Palomuuriportti" },
	{ "TestConnection", 	"Testitietokanta" },
	{ "Type", 				"Tietokantatyyppi" },
	{ "BequeathConnection", "Periytyv� yhteys" },
	{ "Overwrite", 			"Korvaa" },
	{ "ConnectionProfile",	"Connection" },
	{ "LAN",		 		"LAN" },
	{ "TerminalServer",		"Terminal Server" },
	{ "VPN",		 		"VPN" },
	{ "WAN", 				"WAN" },
	{ "ConnectionError", 	"Yhteysvirhe" },
	{ "ServerNotActive", 	"Palvelin ei aktiivinen" }
	};

	/**
	 * Get Contsnts
	 * @return contents
	 */
	public Object[][] getContents()
	{
		return contents;
	}   //  getContent
}   //  Res

