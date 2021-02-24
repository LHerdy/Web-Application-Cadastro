<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Colégio</title>
</head>

<body>
<h1> Colégio </h1>

	<br>
	
	<h1>Bem-vindo, ${sessionScope.nome} !</h1>
	
	<a href="/">Sair</a>
	
	<br>
	
	<nav>
		<a href="aluno">Aluno</a> 
		  
		<a href="disciplina">Disciplina</a> 
		  
		<a href="professor">Professor</a> 
		  
		<a href="turma">Turma</a>
		
		<a href="turno">Turno</a>
		  
	</nav>
	
	<hr />
</body>

</html>