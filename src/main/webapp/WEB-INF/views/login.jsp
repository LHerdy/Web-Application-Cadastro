<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Login</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
        <h1>Login</h1>
        <h2>${mensagem}</h2>
        <form method="post" action="${pageContext.request.contextPath}/usuario/login">
        	<label>Nome:</label>
            <input name="nome"/>
            <label>Email:</label>
            <input name="email"/>
            <label>Senha:</label>
            <input type="password" name="senha" />
            <input type="submit" value="login" />
        </form>
    </body>
</html>
