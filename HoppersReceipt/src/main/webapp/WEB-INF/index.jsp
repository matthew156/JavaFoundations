<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hopper's Receipt</title>
</head>
<body>
<h2>Name: <c:out value="${name}"/></h2>
<h2>Item Name: <c:out value="${itemName}"/></h2>
<h2>Price: <c:out value="${price}"/></h2>
<h2>Description: <c:out value="${description}"/></h2>
<h2>Vendor: <c:out value="${vendor}" /></h2>
</body>
</html>