<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
  
<html>  
<head>  
<title>fmt:formatNumber Tag</title>  
</head>  
<body>  
  
<h3>Formatting of Number:</h3>  
<c:set var="Amount" value="9850.14115" /> 
 <c:out value="${Amount}"/>
 
<p> Formatted Number Type Currency :  
<fmt:formatNumber value="${Amount}" type="currency" /></p>  

<p>Formatted Number-2 groupingUsed:  
<fmt:formatNumber type="number" groupingUsed="true" value="${Amount}" /></p> 
 
<p>Formatted Number-3  maxIntegerDigits 3:  
<fmt:formatNumber type="number" maxIntegerDigits="3" value="${Amount}" /></p>  

<p>Formatted Number-4 maxFractionDigits:  
<fmt:formatNumber type="number" maxFractionDigits="6" value="${Amount}" /></p> 
 
<p>Formatted Number-5 maxIntegerDigits 4:  
<fmt:formatNumber type="percent" maxIntegerDigits="4" value="${Amount}" /></p> 
 
<p>Formatted Number-6 ###.###$:  
<fmt:formatNumber type="number" pattern="#,###.###$" value="${Amount}" /></p>  
</body>  
</html>  