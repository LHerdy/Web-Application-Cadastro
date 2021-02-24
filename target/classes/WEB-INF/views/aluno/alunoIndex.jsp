<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alunos</title>
<script>
	function remover(mensagem, url) {
		if (confirm(mensagem)) {
			window.location = url;
		}
	}
</script>
</head>
<body>
	<h2><b>Lista de alunos</b></h2>
	<a href="/">Sair</a>
	<a href="/aluno/alunoInserir">Inserir novo aluno</a>

	<table border>
		<tr>
			<th>Id</th>
			<th>Nome</th>
			<th>Série</th>
			<th>Faltas</th>
			<th>Turma</th>
			<th>Período</th>
		</tr>
		<c:forEach items="${alunos}" var="aluno">
			<tr>
				<td>${aluno.getId()}</td>
				<td>${aluno.getNome()}</td>
				<td>${aluno.getSerie()}</td>
				<td>${aluno.getFaltas()}</td>
				<td>${aluno.getTurma().getNome()}</td>
				<td>${aluno.getTurno().getPeriodo()}</td>
				<td><a
					href="${pageContext.request.contextPath}/aluno/alterarAluno/${aluno.getId()}">Alterar</a>
					&nbsp; <a href="#"
					onclick="remover('Deseja Remover?', '${pageContext.request.contextPath}/aluno/removerAluno/${aluno.getId()}')">Remover</a>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
