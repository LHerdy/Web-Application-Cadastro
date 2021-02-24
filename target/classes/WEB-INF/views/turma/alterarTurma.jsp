<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h1>Alterar informações da turma</h1>
<form:form action="/turma/alterarAction" method="post"
	modelAttribute="turma">
	<form:hidden path="id" />
	<fieldset>
		<legend>Informações da turma:</legend>
		<label>Nome:</label>
		<form:input path="nome" />
	</fieldset>

	<form:button>Alterar</form:button>
</form:form>
