<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ingresando correo</title>
</head>
<body>

    <h2>Formulario del cliente</h2>
    <h4><s:property value="mensaje"/></h4>

	<s:form action="vistas/value-stack-action">
          <s:textfield name="correo" label="Correo" />
          <s:submit value="Enviar"/>
    </s:form>

</body>
</html>