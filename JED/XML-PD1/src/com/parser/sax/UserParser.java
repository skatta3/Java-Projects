package com.parser.sax;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;


public class UserParser {

  public ArrayList parseXml(InputStream in) throws ParserConfigurationException {
    //Create an empty link of users initially
    ArrayList<User> users = new ArrayList<>();
    try {
      //Create default handler instance
      UserParserHandler handler = new UserParserHandler();

      //Create parser from factory
//      XMLReader reader = XMLReaderFactory.createXMLReader();

      XMLReader reader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();

      //Register handler with parser
      reader.setContentHandler(handler);

      //Create an input source from the XML input stream
      InputSource source = new InputSource(in);

      //parse the document
      reader.parse(source);

      //populate the parsed users list in above created empty list; You can return from here also.
      users = handler.getUsers();

    } catch (SAXException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {

    }
    return users;
  }
}
