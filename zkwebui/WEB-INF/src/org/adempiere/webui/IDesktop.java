package org.adempiere.webui;

import org.adempiere.webui.apps.ProcessDialog;
import org.adempiere.webui.component.Window;
import org.adempiere.webui.panel.ADForm;
import org.adempiere.webui.window.ADWindow;
import org.compiere.model.MQuery;
import org.compiere.util.WebDoc;

public interface IDesktop {

	/**
	 * 
	 * @return ClientInfo
	 */
	public ClientInfo getClientInfo();

	/**
	 * 
	 * @param nodeId
	 */
	public void onMenuSelected(int nodeId);

	/**
	 * 
	 * @param window
	 * @return windowNo
	 */
	public int registerWindow(Object window);

	/**
	 * close active window
	 */
	public void removeWindow();

	/**
	 * 
	 * @param url
	 * @param closeable
	 */
	public void showURL(String url, boolean closeable);

	/**
	 * 
	 * @param doc
	 * @param string
	 * @param closeable
	 */
	public void showURL(WebDoc doc, String string, boolean closeable);

	/**
	 * 
	 * @param win
	 */
	public void showWindow(Window win);
	
	/**
	 * 
	 * @param win
	 * @param position
	 */
	public void showWindow(Window win, String position);

	/**
	 * 
	 * @param window_ID
	 * @param query
	 */
	public void showZoomWindow(int window_ID, MQuery query);

	/**
	 * 
	 * @param windowNo
	 */
	public void unregisterWindow(int windowNo);
	
	/**
     * 
     * @param processId
     * @param soTrx
     * @return ProcessDialog
     */
	public ProcessDialog openProcessDialog(int processId, boolean soTrx);
	
	/**
     * 
     * @param formId
     * @return ADWindow
     */
	public ADForm openForm(int formId);
	
	/**
	 * 
	 * @param windowId
	 * @return ADWindow
	 */
	public ADWindow openWindow(int windowId);
}
