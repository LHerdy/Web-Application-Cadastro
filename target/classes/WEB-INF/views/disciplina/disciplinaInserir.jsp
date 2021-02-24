<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h1>Cadastrar disciplina</h1>
<form:form action="/disciplina/inserirAction" method="post"
	modelAttribute="disciplina">
	<fieldset>
		<legend>Dados da disciplina:</legend>
		<label>Nome:</label>
		<form:input path="nome" />
	</fieldset>
	<fieldset>
		<legend>Dados do professor</legend>
		<label>Professor:</label>
		<form:input path="professor.nome" />
	</fieldset>

	<form:button>Cadastrar</form:button>
</form:form>
