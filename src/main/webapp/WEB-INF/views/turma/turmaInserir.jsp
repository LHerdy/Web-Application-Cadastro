<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h1>Cadastrar turmas</h1>
<form:form action="/turma/inserirAction" method="post"
	modelAttribute="turma">
	<fieldset>
		<legend>Dados da turma:</legend>
		<label>Nome:</label>
		<form:input path="turma.nome" />
	</fieldset>

	<form:button>Cadastrar</form:button>
</form:form>
