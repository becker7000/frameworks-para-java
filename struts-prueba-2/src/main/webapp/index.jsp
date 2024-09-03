<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Bienvenidos a Struts 2</title>
</head>

<body>

<h1>Hola a todos desde Struts 2</h1>

<h3>Ejemplos</h3>
<ul>
    <li>
        <s:a href="/struts-prueba-2/vistas/hola">Hola Action</s:a>
    </li>
    <li>
        <s:a href="/struts-prueba-2/vistas/listar-lenguajes">Lista de lenguajes</s:a>
    </li>
    <li>
        <a href="/struts-prueba-2/vistas/login-form">Iniciar sesion *</a>
    </li>
    <li>
        <s:a href="/struts-prueba-2/vistas/hola-interceptor">Ejecutar interceptor</s:a>
    </li>
    <li>
        <s:a href="/struts-prueba-2/vistas/ingresar-correo">Value Stack Test</s:a>
    </li>
    <li>
        <s:a href="/struts-prueba-2/vistas/cargador-archivo">Cargar un archivo</s:a>
    </li>
    <li>
        <s:a href="/struts-prueba-2/vistas/login-usuario">Login de usuario (BD)</s:a>
    </li>
    <li>
        <s:a href="/struts-prueba-2/vistas/mostrar-formulario-validar">Validar formulario cliente</s:a>
    </li>
    <li>
        <s:a href="/struts-prueba-2/vistas/locale">Internacionalizacion</s:a>
    </li>
</ul>

</body>
</html>
