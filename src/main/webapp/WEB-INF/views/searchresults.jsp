<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/spacelab/bootstrap.min.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<table class="table">
			<thead>
				<tr>
					<th>${h1}</th>
					<th>${h2}</th>
					<th>${h3}</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="p" items="${search}">
					<tr>
						<td>${p.id}</td>
						<td>${p.name}</td>
						<td>${p.email}</td>
						<td><a href="/tasks/${p.id}" input type="btn"><button>Tasks</button></a>
					</tr>
				</c:forEach>
			</tbody>
		</table>
</body>
</html>