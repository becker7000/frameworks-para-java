<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login user</title>
</head>
<body>

    <h2><s:property value="mensaje"/></h2>

	<form action="vistas/login-action">
		Username: <input type="text" name="username" /><br/>
		Password: <input type="password" name="password" /> <br/>
		<input type="submit" value="Login" />
	</form>

</body>
</html>