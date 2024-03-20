<%@ taglib uri= "/struts-tags"  prefix= "s"%>
<html>
<head>
<meta http-equiv= "Content-Type"  content= "text/html;charset=ISO-8859-1" >
<title>Struts2 Dependency Demo</title>
</head>
<body>
 
<s:form action="add"  method="post" >
	<s:textfield name= "product.name" label= "Name of product" />
	<s:textfield name= "product.description" label= "Description"/>
	<s:textfield name= "product.price" label= "Product Price"  />
	<s:submit value= "Save"  />
</s:form>
 
	<h2>Available Products</h2>
	
	<table>
		<tr>
			<td>Product Name</td>
			<td>Description</td>
			<td>Price</td>
		</tr>
		<s:iterator value= "productList"  var= "p" >
		<tr>
			<td>${p.name }</td>
			<td>${p.description }</td>
			<td>${p.price }</td>
		</tr>
	</s:iterator>
	</table>
</body>
</html>