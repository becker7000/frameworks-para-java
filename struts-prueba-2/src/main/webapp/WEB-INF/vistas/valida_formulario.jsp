<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Formulario del cliente</title>
</head>
<body>

    <h1>Validando formulario...</h1>
    <h3>Informacion del cliente</h3>
    <s:form action="vistas/validar-formulario">
        <s:textfield name="nombre" label="nombre" size="20"></s:textfield>
        <s:textfield name="edad" label="edad" size="20"></s:textfield>
        <s:submit name="enviar" label="Enviar" align="centre"></s:submit>
    </s:form>

</body>
</html>
