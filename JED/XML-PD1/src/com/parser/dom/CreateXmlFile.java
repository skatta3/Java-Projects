package com.parser.dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXmlFile {

   public static void main(String argv[]) {

      try {
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.newDocument();
         
         // root element
         Element rootElement = doc.createElement("customers");
         doc.appendChild(rootElement);

         // postpaid element
         Element postpaid = doc.createElement("postpaid");
         rootElement.appendChild(postpaid);

         // setting attribute to element
         Attr attr = doc.createAttribute("company");
         attr.setValue("Airtel");
         postpaid.setAttributeNode(attr);

         // Plan name element
         Element plan = doc.createElement("Plan");
         Attr attrType = doc.createAttribute("type");
         attrType.setValue("Voice");
         plan.setAttributeNode(attrType);
         plan.appendChild(doc.createTextNode("198 - Full Talk Time"));
         postpaid.appendChild(plan);

         Element plan1 = doc.createElement("Plan");
         Attr attrType1 = doc.createAttribute("type");
         attrType1.setValue("Data");
         plan1.setAttributeNode(attrType1);
         plan1.appendChild(doc.createTextNode("399 - 1.5GB - Daily"));
         postpaid.appendChild(plan1);

         // write the content into xml file
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
         DOMSource source = new DOMSource(doc);
         StreamResult result = new StreamResult(new File("C:\\Users\\skatt\\eclipse-workspace\\Training\\DOM-Parser\\customers.xml"));
         transformer.transform(source, result);
         
         // Output to console for testing
         StreamResult consoleResult = new StreamResult(System.out);
         transformer.transform(source, consoleResult);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
