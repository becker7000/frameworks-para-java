<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Cargando archivo</title>
</head>
<body>

    <h1><s:property value="mensaje"/></h1>
    <h2>Cargando un archivo con Struts 2</h2>
    <s:form action="vistas/cargarArchivo" method="post" enctype="multipart/form-data">
        <label for="archivo">Selecciona un archivo para subir (JPG, PNG, PDF, TXT):</label>
        <s:file name="archivo" id="archivo"/>
        <s:submit value="Cargar archivo"/>
    </s:form>

</body>
</html>
