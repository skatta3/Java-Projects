<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Functions</title>  
</head>  
<body>  
  
<c:set var="String" value="Welcome to Ignore case Function Tags"/>  
  
<c:if test="${fn:containsIgnoreCase(String, 'Ignore')}">  
   <p>Found Ignore string<p>  
</c:if>  
  
<c:if test="${fn:containsIgnoreCase(String, 'IGNORE')}">  
   <p>Found IGNORE string<p>  
</c:if>  
  
</body>  
</html>  