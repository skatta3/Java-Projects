<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<html>  
<head>  
<title>fmt:setBundle Tag</title>  
</head>  
<body>  
<fmt:setBundle basename="com.jstl.Main" var="lang"/>  
<fmt:message key="vegetable.Potato" bundle="${lang}"/><br/>  
   <fmt:message key="vegetable.Tomato" bundle="${lang}"/><br/>  
  <fmt:message key="vegetable.Carrot" bundle="${lang}"/><br/>  
</body>  
</html>  