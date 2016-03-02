<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<security:authorize access="isAuthenticated()">
    authenticated as <security:authentication
			property="principal.username" />
	</security:authorize>
	<h2>Posts:</h2>
	<div>
		<c:forEach items="${posts}" var="post">
	${post.title}
	</c:forEach>
	</div>
	<hr>

	<form action="post" method="post">
		<fieldset>
			<legend>Add new post</legend>
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" /> <label for="title">Title:</label> <input
				type="text" id="title" name="title" placeholder="input title here..">
			<br> <label for="text">Text:</label>
			<textarea rows="10" cols="30" id="text" name="text"
				placeholder="input text here.."></textarea>
			<br>
			<button type="submit">Add</button>
		</fieldset>
	</form>

</body>
</html>