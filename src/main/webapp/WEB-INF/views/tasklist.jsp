<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
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
	<form name="/userlist" method="post">
		<table class="table">
			<thead>
				<tr>
					<th>${h1}</th>
					<th>${h2}</th>
					<th>${h3}</th>
					<th>${h4}</th>
					<th>${h5}</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="task" items="${search2}">
					<tr>
						<td>${task.taskid}</td>
						<td>${task.description}</td>
						<td>${task.duedate}</td>
						<td>${task.completed}</td>
						<td>${task.user.id}</td>
						<td><a href="/edit/task/${task.taskid}" input type="btn"><button>Edit</button></a>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>
</body>
</html>