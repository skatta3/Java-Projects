package com.form;

import java.util.ArrayList;

/**
 *
 * @author info@tutorials4u.net
 */
public class UserData {

    private String userName;
    private String emailId;
    private String location;

    public UserData()
    {

    }

    public UserData(String userName, String emailId, String location)
    {
        this.userName = userName;
        this.emailId = emailId;
        this.location = location;
    }

    public ArrayList<UserData> loadData()
    {
        ArrayList<UserData> userList = new ArrayList<UserData>();
        userList.add(new UserData("Dave Stewart","info@tutorials4u.net","Aurora Colorado"));
        userList.add(new UserData("Aaron","info@tutorials4u.net","Seattle Washington"));
        userList.add(new UserData("Danny Vally","info@tutorials4u.net","Seattle Washington"));
        userList.add(new UserData("Charlie","info@tutorials4u.net","Seattle Washington"));
        userList.add(new UserData("Raghu","info@tutorials4u.net","Sanjose California"));
        userList.add(new UserData("Yashwanth","info@tutorials4u.net","Dallas Texas"));
        return userList;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @return the emailId
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * @return the locaiton
     */
    public String getLocation() {
        return location;
    }

}
