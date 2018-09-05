<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/spacelab/bootstrap.min.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
		<h1>Edit</h1>
		
		<!-- A form without an action submits back to the same URL, which is what we want here. -->
		<form method="post">		     
			</div>
			<div class="form-group">
			    <label for="type">Task Description</label>
			     <input class="form-control" id="type" name="membersRole"  required minLength="2" autocomplete="off">
			</div>
			<div class="form-group">
			    <label for="type">Completed</label>
			     <input class="form-control" id="teamid" name="teamId" required minLength="1" autocomplete="off">
			</div>
			
			
			<button type="submit" class="btn btn-primary">Submit</button>
			<a href="/cancel" class="btn btn-link">Cancel</a>
		</form>
	</div>
</body>
</html>