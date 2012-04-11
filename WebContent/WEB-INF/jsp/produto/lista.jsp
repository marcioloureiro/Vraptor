<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Produtos</title>
</head>
	<body>
		<table>
			<c:forEach var="produto" items="${produtoList}">
				<tr>
					<td>${produto.nome}</td>
					<td>${produto.descricao}</td>
					<td>${produto.preco}</td>
					<td>${produto.cor}</td>
					<td><a href="edita?id=${produto.id }">Editar</a></td>
					<td><a href="remove?id=${produto.id}">Remover</a></td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>