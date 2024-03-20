package com.form;

import java.util.ArrayList;


/**
 *
 * @author info@tutorials4u.net
 */
public class ExcelForm extends org.apache.struts.action.ActionForm {
    
	private static final long serialVersionUID = 1L;
	private ArrayList<UserData> userList;
    
    public ExcelForm() {
        super();
    }

    /**
     * @return the userList
     */
    public ArrayList<UserData> getUserList() {
        return userList;
    }

    /**
     * @param userList the userList to set
     */
    public void setUserList(ArrayList<UserData> userList) {
        this.userList = userList;
    }

}
