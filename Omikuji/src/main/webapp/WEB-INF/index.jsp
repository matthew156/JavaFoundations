<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Send and Omnikuji!</h1>
<div>
<form action="/result" method="post">
<p>Pick any number from 5 to 25</p>
<input type="number" value="number" min="5" max="25" name="number">
<p>Enter the name of any city</p>
<input type ="text" name="city">
<p>Enter the name of any person</p>
<input type="text" name="person">
<p>Enter a hobby</p>
<input type="text" name="hobby">
<p>Enter a living thing </p>
<input type="text" name="living">
<p>Say something nice </p>
<textarea name="nice"></textarea>
<input type="submit" value="Submit">
</form>
</div>
</body>
</html>