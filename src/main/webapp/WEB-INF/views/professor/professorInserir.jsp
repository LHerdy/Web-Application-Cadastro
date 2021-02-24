<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h1>Cadastrar professores</h1>
<form:form action="/professor/inserirAction" method="post"
	modelAttribute="professor">
	<fieldset>
		<legend>Dados do professor:</legend>
		<label>Nome:</label>
		<form:input path="nome" />
	</fieldset>
	<form:button>Cadastrar</form:button>
</form:form>
