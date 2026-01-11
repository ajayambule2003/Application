<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Application</title>
</head>
<body>

	<h1>Student Form</h1>
	
	<form:form action="save" method="post" modelAttribute="stud">
		<label> ID</label>
		<form:input path="id" />
		<br>
		<label>Name</label>
		<form:input path="name" />
		<br>
		<label>Marks</label>
		<form:input path="marks" />
		<br>
		<input type="submit" value="SAVE">
	</form:form>
</body>
</html>