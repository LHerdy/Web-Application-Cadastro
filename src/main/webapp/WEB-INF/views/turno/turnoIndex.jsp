<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Turnos escolares</title>
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
		<b>Turnos</b>
	</h2>
	<a href="/">Sair</a>

	<table border>
		<tr>
			<th>Id</th>
			<th>Período</th>
		</tr>
		<c:forEach items="${turnos}" var="turno">
			<tr>
				<td>${turno.id}</td>
				<td>${turno.periodo}</td>
				<td><a
					href="${pageContext.request.contextPath}/turno/alterarTurno/${turno.getId()}">Alterar</a>
					&nbsp; <a href="#"
					onclick="remover('Deseja Remover?', '${pageContext.request.contextPath}/turno/removerTurno/${turno.getId()}')">Remover</a>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
