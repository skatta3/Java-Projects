<%@ taglib prefix="s" uri="/struts-tags" %>
 <html>
<head>
</head>
 
<body>
<h1>Struts 2 Bean tag example</h1>

<s:bean name="com.mkyong.common.action.HelloBean" var="hello">
  <s:param name="msg">Hello Bean Tag</s:param>
</s:bean>

The HelloBean's msg property value : <s:property value="#hello.msg"/>

</body>
</html>