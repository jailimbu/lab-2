<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel='stylesheet' href='webjars/bootstrap/3.3.6/css/bootstrap.min.css'>
<title>Insert title here</title>
</head>
<body>
	<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
	
	
	<div class="container">
		<div class="card">
		
			<c:forEach var="product" items="${products}">
				  
				 <div class="card-block" style="width: 300px;float: left;">
				 		<h4 class="card-title">${product.value.name}</h4>
					
						<p>${product.value.description}</p>
						<p>${product.value.unitPrice}</p>
						
						<h4><a href="${pageContext.request.contextPath}/disPrdDetail/${product.value.productId}" class="btn btn-primary">View Details</a></h4>
				</div>
				  
			</c:forEach>
			
		</div>
	</div>




<script type="text/javascript" src="webjars/jquery/2.0.3/jquery.min.js"></script>
<script type="text/javascript" src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>