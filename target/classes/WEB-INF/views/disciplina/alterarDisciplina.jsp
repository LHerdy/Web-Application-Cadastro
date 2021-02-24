<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h1>Alterar informações da disciplina</h1>
<form:form action="/disciplina/alterarAction" method="post"
	modelAttribute="disciplina">
	<form:hidden path="id" />
	<fieldset>
		<legend>Informações da disciplina:</legend>
		<label>Nome:</label>
		<form:input path="nome" />
	</fieldset>
	<fieldset>
		<legend>Informações adicionais</legend>
		<label>Professor:</label>
		<form:input path="nome" />
	</fieldset>

	<form:button>Alterar</form:button>
</form:form>
