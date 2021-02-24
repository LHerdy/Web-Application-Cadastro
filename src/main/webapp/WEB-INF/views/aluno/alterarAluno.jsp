<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h1>Alterar informações do aluno</h1>
<form:form action="/aluno/alterarAction" method="post"
	modelAttribute="aluno">
	<form:hidden path="id" />
	<fieldset>
		<legend>Informações do aluno:</legend>
		<label>Nome:</label>
		<form:input path="nome" />
		<label>Série:</label>
		<form:input path="serie" />
		<label>Faltas:</label>
		<form:input path="faltas" />
	</fieldset>
	<fieldset>
		<legend>Informações adicionais</legend>
		<label>Turma:</label>
		<form:input path="turma.nome" />
		<label>Turno:</label>
		<form:input path="turno.periodo" />
	</fieldset>

	<form:button>Alterar</form:button>
</form:form>
