/******************************************************************************
 * Product: Posterita Ajax UI 												  *
 * Copyright (C) 2007 Posterita Ltd.  All Rights Reserved.                    *
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
 * Posterita Ltd., 3, Draper Avenue, Quatre Bornes, Mauritius                 *
 * or via info@posterita.org or http://www.posterita.org/                     *
 *****************************************************************************/

package org.adempiere.webui.panel;

import java.util.ArrayList;
import java.util.Properties;

import org.adempiere.webui.component.Grid;
import org.adempiere.webui.component.Label;
import org.adempiere.webui.component.Row;
import org.adempiere.webui.component.Rows;
import org.adempiere.webui.component.Textbox;
import org.adempiere.webui.component.WConfirmPanel;
import org.adempiere.webui.component.Window;
import org.adempiere.webui.window.LoginWindow;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Language;
import org.compiere.util.Login;
import org.compiere.util.ValueNamePair;
import org.zkoss.zk.au.out.AuFocus;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Image;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listitem;

/**
 *
 * @author  <a href="mailto:agramdass@gmail.com">Ashley G Ramdass</a>
 * @date    Feb 25, 2007
 * @version $Revision: 0.10 $
 * @author <a href="mailto:sendy.yagambrum@posterita.org">Sendy Yagambrum</a>
 * @date    July 18, 2007
 */
public class LoginPanel extends Window implements EventListener
{
    private static final long serialVersionUID = 1L;

    private Properties ctx;
    private Label lblUserId;
    private Label lblPassword;
    private Label lblLanguage;
    private Textbox txtUserId;
    private Textbox txtPassword;
    private Listbox lstLanguage;
/*    private Button btnOk;
    private Button btnCancel;*/
    private LoginWindow wndLogin;

    public LoginPanel(Properties ctx, LoginWindow loginWindow)
    {
        this.ctx = ctx;
        this.wndLogin = loginWindow;
        initComponents();
        init();
        this.setId("loginPanel");
        
        AuFocus auf = new AuFocus(txtUserId);
        Clients.response(auf);
    }

    private void init()
    {
        Grid grid = new Grid();
        //grid.setSclass("grid-no-striped");
        grid.setOddRowSclass("even");
        grid.setId("grdLogin");
        Rows rows = new Rows();
        Row logo = new Row();
        logo.setSpans("2");
        Image image = new Image();
        image.setSrc("images/Logo.gif");
        logo.appendChild(image);        
        Row rowUser = new Row();
        rowUser.setId("rowUser");
        Row rowPassword = new Row();
        rowPassword.setId("rowPassword");
        Row rowLanguage = new Row();
        rowLanguage.setId("rowLanguage");

        rowUser.appendChild(lblUserId);
        rowUser.appendChild(this.txtUserId);

        rowPassword.appendChild(lblPassword);
        rowPassword.appendChild(txtPassword);

        rowLanguage.appendChild(lblLanguage);
        rowLanguage.appendChild(lstLanguage);

        Row rowButtons = new Row();
        //rowButtons.setAlign("right");
        //Label lblButtons = new Label();
        rowButtons.setSpans("2");
        //rowButtons.appendChild(lblButtons);
        WConfirmPanel pnlButtons = new WConfirmPanel(false);
        pnlButtons.addEventListener(this);
        //pnlButtons.appendChild(btnOk);
        //pnlButtons.appendChild(btnCancel);
        rowButtons.appendChild(pnlButtons);

        rows.appendChild(logo);
        rows.appendChild(rowUser);
        rows.appendChild(rowPassword);
        rows.appendChild(rowLanguage);
        rows.appendChild(rowButtons);
        grid.appendChild(rows);
        this.appendChild(grid);
    }

    private void initComponents()
    {
        lblUserId = new Label();
        lblUserId.setId("lblUserId");
        lblUserId.setValue("User ID: ");

        lblPassword = new Label();
        lblPassword.setId("lblPassword");
        lblPassword.setValue("Password: ");

        lblLanguage = new Label();
        lblLanguage.setId("lblLanguage");
        lblLanguage.setValue("Language: ");

        txtUserId = new Textbox();
        txtUserId.setId("txtUserId");
        txtUserId.setConstraint("no empty");
        txtUserId.setCols(25);
        txtUserId.setMaxlength(40);

        txtPassword = new Textbox();
        txtPassword.setId("txtPassword");
        txtPassword.setConstraint("no empty");
        txtPassword.setType("password");
        txtPassword.setCols(25);
        txtPassword.setMaxlength(40);

        lstLanguage = new Listbox();
        lstLanguage.setId("lstLanguage");
        lstLanguage.setRows(1);
        lstLanguage.setMold("select");
        lstLanguage.addEventListener(Events.ON_SELECT, this);
        lstLanguage.setWidth("180px");
        
        // Update Language List
        lstLanguage.getItems().clear();
        String[] availableLanguages = Language.getNames();
        for (String langName : availableLanguages) {
    		Language language = Language.getLanguage(langName);
			lstLanguage.appendItem(langName, language.getAD_Language());
		}

/*        btnOk = new Button();
        btnOk.setName("btnOk");
        btnOk.setLabel("Ok");
        btnOk.addEventListener(EventConstants.ONCLICK, this);

        btnCancel = new Button();
        btnCancel.setName("btnCancel");
        btnCancel.setLabel("Cancel");
        btnCancel.addEventListener(EventConstants.ONCLICK, this);*/
   }

    public void onEvent(Event event)
    {
        Component eventComp = event.getTarget();

        if (event.getName().equals(WConfirmPanel.A_OK))
        {
            validateLogin();
        }
        if (event.getName().equals("onSelect"))
        {
            if(eventComp.getId().equals(lstLanguage.getId())) {
            	String langName = (String) lstLanguage.getSelectedItem().getValue();
            	Env.setContext(ctx, Env.LANGUAGE, langName);
        		Language language = Language.getLanguage(langName);
            	Env.verifyLanguage(ctx, language);
            }
        }
    }
    /**
     *  validates user name and password when logging in
     *
    **/
    public void validateLogin()
    {
        Login login = new Login(ctx);
        String userId = txtUserId.getValue();
        String userPassword = txtPassword.getValue();
        KeyNamePair rolesKNPairs[] = login.getRoles(userId, userPassword);
        if(rolesKNPairs == null || rolesKNPairs.length == 0)
            throw new WrongValueException("User Id or Password invalid!!!");

        else
            wndLogin.loginOk(userId, userPassword);
    }

    public boolean isAsap()
    {
        return true;
    }
}
