<%@page import="java.text.SimpleDateFormat"%>

   
   <%@ page contentType="text/html;charset=UTF-8" %>
   
   <!-- ContentType is very important for Unicode -->
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Employee Form with Multilingual Support</title>
</head>
<%@ taglib prefix="s" uri="/struts-tags"%>
<body>
   <h1><s:text name="global.heading"/></h1>

   <s:url id="indexEN" namespace="/" action="locale">
      <s:param name="request_locale" >en</s:param>
   </s:url>
   <s:url id="indexES" namespace="/" action="locale" >
      <s:param name="request_locale" >es</s:param>
   </s:url>
   <s:url id="indexFR" namespace="/" action="locale" >
      <s:param name="request_locale" >fr</s:param>
   </s:url>
 
 <s:url id="localezhCN" namespace="/" action="locale" >
      <s:param name="request_locale" >zh_CN</s:param>
   </s:url>
 
 <s:url id="localeTA" namespace="/" action="locale" >
      <s:param name="request_locale" >ta</s:param>
   </s:url> 
 
 <s:url id="localeTG" namespace="/" action="locale" >
      <s:param name="request_locale" >tg</s:param>
   </s:url>
   
   <s:url id="localeHN" namespace="/" action="locale" >
      <s:param name="request_locale" >hn</s:param>
   </s:url>
   
   <s:a href="%{indexEN}" >English</s:a> 
   <s:a href="%{indexES}" >Spanish</s:a>
   <s:a href="%{indexFR}" >French</s:a> 

   <s:a href="%{localezhCN}" >Chinese</s:a>
   <s:a href="%{localeTA}" >Tamil</s:a>
   <s:a href="%{localeTG}" >Telugu</s:a>   
   <s:a href="%{localeHN}" >Hindi</s:a> 

   <s:form action="empinfo" method="post" namespace="/">
      <s:textfield name="name" key="global.name" size="20" />
      <s:textfield name="age" key="global.age" size="20" />
      <s:submit name="submit" key="global.submit" />
   </s:form>

</body>
</html>
