<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Function </title>  
</head>  
<body>  
<c:set var="string" value="Hi, This is JAVATRAINING.COM developed by CLAYTON JOBES."/>  
${fn:substringBefore(string, "developed")}  
</body>  
</html>  