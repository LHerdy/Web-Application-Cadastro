<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h1>Alterar informações do período de estudo do aluno</h1>
<form:form action="/turno/alterarAction" method="post"
	modelAttribute="turno">
	<form:hidden path="id" />
	<fieldset>
		<legend>Informações dos turnos:</legend>
		<label>Nome:</label>
		<form:input path="periodo" />
	</fieldset>
	<fieldset>
		<legend>Informações adicionais</legend>
	</fieldset>

	<form:button>Alterar</form:button>
</form:form>
