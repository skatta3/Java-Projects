<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Functions</title>  
</head>  
<body>  
  
<c:set var="String" value="Welcome to Function Tags"/>  


<c:if test="${fn:contains(String, 'Tags')}">  
   <p>Found Tags string<p>  
</c:if>  
  
<c:if test="${fn:contains(String, 'TAGS')}">  
   <p>Found TAGS string<p>  
</c:if>  
  
</body>  
</html>  