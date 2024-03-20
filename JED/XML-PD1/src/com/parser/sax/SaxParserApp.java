package com.parser.sax;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

public class SaxParserApp {

  public static void main(String[] args) throws FileNotFoundException, ParserConfigurationException {
    //Locate the file
    File xmlFile = new File("C:\\tmp\\users.xml");

    //Create the parser instance
    UserParser parser = new UserParser();

    //Parse the file
    ArrayList<User> users = parser.parseXml(new FileInputStream(xmlFile));

    //Verify the result
    System.out.println(users);
    for(User user : users) {
    	System.out.println(user.getId() + ", " + user.getFirstName() + ", " + user.getLastName());
    }
  }
}
