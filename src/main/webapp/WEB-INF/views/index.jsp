<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/spacelab/bootstrap.min.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H1>User Selection</H1>
	<div>
		<form action="/userselect">
			<select name="userselect">
				<c:forEach var="user" items="${users}">
					<option value="${user}">${user}</option>
					<br>
				</c:forEach>
			</select> <input type="submit" class="btn btn-dark btn-large">
		</form>
	</div>
</body>
</html>