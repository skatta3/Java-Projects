package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.form.ExcelForm;
import com.form.UserData;

/**
 *
 * @author info@tutorials4u.net
 */
public class ExcelAction extends DispatchAction {
    
    /* forward name="success" path="" */
    private final static String DISPLAY_JSP = "jsp";
    private final static String DISPLAY_EXCEL = "excel";
    
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    public ActionForward displayJSP(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ExcelForm excelForm = (ExcelForm) form;
        UserData userData = new UserData();
        excelForm.setUserList(userData.loadData());
        return mapping.findForward(DISPLAY_JSP);
    }
    
    public ActionForward displayExcel(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	System.out.println("From Display Excel Method");
        ExcelForm excelForm = (ExcelForm) form;
        UserData userData = new UserData();
        excelForm.setUserList(userData.loadData());
        return mapping.findForward(DISPLAY_EXCEL);
    }
}
