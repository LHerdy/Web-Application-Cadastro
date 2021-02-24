<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Professores</title>
<script>
	function remover(mensagem, url) {
		if (confirm(mensagem)) {
			window.location = url;
		}
	}
</script>
</head>
<body>
	<h2>
		<b>Lista de professores</b>
	</h2>
	<a href="/">Sair</a>
	<!-- <a href="/professor/professorInserir">Inserir novo professor</a> -->

	<table border>
		<tr>
			<th>Id</th>
			<th>Nome</th>
			<th>Disciplina</th>
		</tr>
		<c:forEach items="${professores}" var="professor">
			<tr>
				<td>${professor.getId()}</td>
				<td>${professor.getNome()}</td>
				<td>${professor.getDisciplina().getNome()}</td>
				<td>
					&nbsp; <a href="#"
					onclick="remover('Deseja Remover?', '${pageContext.request.contextPath}/professor/removerProfessor/${professor.getId()}')">Remover</a>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
