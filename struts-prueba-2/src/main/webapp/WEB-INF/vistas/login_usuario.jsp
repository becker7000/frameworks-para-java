<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Iniciar sesion</title>
</head>
<body>

	<h2>Iniciar Sesion</h2><br/>
    <s:form action="vistas/autenticar-usuario" method="post">
        <s:textfield name="nombre" label="Nombre" required="true"/>
        <s:password name="contrasena" label="Contrasena" required="true"/>
        <s:submit value="Iniciar Sesion"/>
    </s:form>

</body>
</html>