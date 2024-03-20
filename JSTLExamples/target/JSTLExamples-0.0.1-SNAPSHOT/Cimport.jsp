<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Tag Example</title>  
</head>  
<body>  
	<c:import var="data" url="http://localhost:8080/JSTLExamples/Cchoose.jsp"/>  
	<c:out value="${data}"/>  
</body>  
</html>  