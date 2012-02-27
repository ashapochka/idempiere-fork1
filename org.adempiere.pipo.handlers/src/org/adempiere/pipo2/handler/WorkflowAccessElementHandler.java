/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2006 Adempiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *
 * Copyright (C) 2005 Robert Klein. robeklein@hotmail.com
 * Contributor(s): Low Heng Sin hengsin@avantz.com
 *****************************************************************************/
package org.adempiere.pipo2.handler;

import java.util.List;
import java.util.Properties;

import javax.xml.transform.sax.TransformerHandler;

import org.adempiere.pipo2.AbstractElementHandler;
import org.adempiere.pipo2.PackOut;
import org.adempiere.pipo2.PoExporter;
import org.adempiere.pipo2.Element;
import org.adempiere.pipo2.PoFiller;
import org.adempiere.pipo2.ReferenceUtils;
import org.compiere.model.I_AD_Role;
import org.compiere.model.I_AD_Workflow_Access;
import org.compiere.model.Query;
import org.compiere.model.X_AD_Role;
import org.compiere.model.X_AD_Workflow;
import org.compiere.model.X_AD_Workflow_Access;
import org.compiere.util.Env;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

public class WorkflowAccessElementHandler extends AbstractElementHandler {

	public void startElement(Properties ctx, Element element) throws SAXException {
		int roleid =0;
		int workflowid =0;
		List<String> excludes = defaultExcludeList(X_AD_Workflow_Access.Table_Name);

		X_AD_Workflow_Access po = findPO(ctx, element);
		if (po == null) {
			if (getParentId(element, I_AD_Role.Table_Name) > 0) {
				roleid = getParentId(element, I_AD_Role.Table_Name);
			} else {
				Element roleElement = element.properties.get(I_AD_Workflow_Access.COLUMNNAME_AD_Role_ID);
				roleid = ReferenceUtils.resolveReference(ctx, roleElement, getTrxName(ctx));
			}

			Element wfElement = element.properties.get(I_AD_Workflow_Access.COLUMNNAME_AD_Workflow_ID);
			workflowid = ReferenceUtils.resolveReference(ctx, wfElement, getTrxName(ctx));

			Query query = new Query(ctx, "AD_Workflow_Access", "AD_Role_ID=? and AD_Workflow_ID=?", getTrxName(ctx));
			po = query.setParameters(new Object[]{roleid, workflowid}).first();
			if (po == null) {
				po = new X_AD_Workflow_Access(ctx, 0, getTrxName(ctx));
				po.setAD_Role_ID(roleid);
				po.setAD_Workflow_ID(workflowid);
			}
			excludes.add(I_AD_Workflow_Access.COLUMNNAME_AD_Role_ID);
			excludes.add(I_AD_Workflow_Access.COLUMNNAME_AD_Workflow_ID);
		}

		PoFiller filler = new PoFiller(ctx, po, element, this);
		List<String> notfounds = filler.autoFill(excludes);
		if (notfounds.size() > 0) {
			element.defer = true;
			return;
		}
		po.saveEx();
	}

	public void endElement(Properties ctx, Element element) throws SAXException {
	}

	public void create(Properties ctx, TransformerHandler document)
			throws SAXException {
		int AD_Workflow_ID = Env.getContextAsInt(ctx, X_AD_Workflow.COLUMNNAME_AD_Workflow_ID);
		int AD_Role_ID = Env.getContextAsInt(ctx, X_AD_Role.COLUMNNAME_AD_Role_ID);
		AttributesImpl atts = new AttributesImpl();
		addTypeName(atts, "table");
		document.startElement("", "", I_AD_Workflow_Access.Table_Name, atts);
		createWorkflowAccessBinding(ctx, document, AD_Workflow_ID, AD_Role_ID);
		document.endElement("", "", I_AD_Workflow_Access.Table_Name);
	}

	private void createWorkflowAccessBinding(Properties ctx, TransformerHandler document,
			int workflow_id, int role_id) {

		X_AD_Workflow_Access po = null;
		Query query = new Query(ctx, "AD_Workflow_Access", "AD_Role_ID=? and AD_Workflow_ID=?", getTrxName(ctx));
		po = query.setParameters(new Object[]{role_id, workflow_id}).first();
		PoExporter filler = new PoExporter(ctx, document, po);
		List<String> excludes = defaultExcludeList(X_AD_Workflow_Access.Table_Name);

		filler.export(excludes);
	}

	@Override
	public void packOut(PackOut packout, TransformerHandler packoutHandler,
			TransformerHandler docHandler,
			int recordId) throws Exception {
		create(packout.getCtx(), packoutHandler);
	}
}
