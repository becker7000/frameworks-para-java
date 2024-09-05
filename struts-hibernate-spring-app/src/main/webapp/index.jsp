<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Bienvenid@</title>
</head>
<body>
<h1>Bienvenido a Struts 2 con Spring Framework</h1>

<h2>Ejemplos</h2>
<ul>
    <li>
        <a href='<s:url action="editar" />' >Edita tu información</a>
    </li>
    <li>
        <a href='<s:url action="listar-productos" />' >Listar productos (HB)</a>
    </li>
</ul>

</body>
</html>