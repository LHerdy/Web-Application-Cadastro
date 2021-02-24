<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h1>Cadastrar períodos de estudo</h1>
<form:form action="/turno/inserirAction" method="post"
	modelAttribute="turno">
	<fieldset>
		<legend>Dados dos turnos:</legend>
		<label>Período:</label>
		<form:input path="turno.periodo" />
	</fieldset>

	<form:button>Cadastrar</form:button>
</form:form>
