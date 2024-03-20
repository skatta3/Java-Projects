<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Function </title>  
</head>  
<body>  
  <c:set var="site" value="javatraining.com"/>  
  <c:set var="author" value="Ken Caldwell"/>  
  Hi, This is ${fn:toUpperCase(site)} developed by ${fn:toUpperCase(author)}.  
</body>  
</html>  