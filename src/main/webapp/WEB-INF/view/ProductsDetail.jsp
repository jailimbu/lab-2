<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Product Details</h3>
	
	<p>ProductId: ${product.productId}</p>
	<p>Name: ${product.name}</p>
	<p>UnitPrice: ${product.unitPrice}</p>
	<p>Description: ${product.description}</p>
	<p>Manufacture: ${product.manufacture}</p>
	<p>Category: ${product.category}</p>
	<p>UnitsInStock: ${product.unitsInStock}</p>
	<p>Discontinued: ${product.discontinued}</p>
	<p>Condition: ${product.condition}</p>
	
	<div>
		<form method ="post" action ="${pageContext.request.contextPath}/orderProcess">
			Quantity: <input type="text" name="count"/> <br/><br/>
			<input type= "hidden" name="productId" value="${product.productId}"/><br/> <br/>
			<input type="submit" value="Order"/>
		</form>
	</div>
</body>
</html>






