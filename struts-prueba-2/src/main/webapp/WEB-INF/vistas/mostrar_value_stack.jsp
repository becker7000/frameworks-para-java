<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Accediendo al Stack Value</title>
</head>
<body>

    <h1>Usando OGNL para acceder al Stack Value</h1>

    <h4>Correo: <s:property value="correo"/></h4>
    <h4>Mensaje 1: <s:property value="mensaje1"/></h4>
    <h4>Mensaje 2: <s:property value="mensaje2"/></h4>
    <h4>Longitud del Stack: <s:property value="longitudStack"/></h4>

</body>
</html>
