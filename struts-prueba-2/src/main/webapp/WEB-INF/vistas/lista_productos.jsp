<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listando productos</title>
</head>
<body>
    <h1>Lista de Productos</h1>
    <s:if test="empty(productos)">
        <p>No hay productos disponibles.</p>
    </s:if>
    <s:else>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Precio</th>
                    <th>Existencias</th>
                    <th>Categoría</th>
                </tr>
            </thead>
            <tbody>
                <s:iterator value="productos" var="producto">
                    <tr>
                        <td><s:property value="#producto.id"/></td>
                        <td><s:property value="#producto.nombre"/></td>
                        <td><s:property value="#producto.precio"/></td>
                        <td><s:property value="#producto.existencias"/></td>
                        <td><s:property value="#producto.categoria"/></td>
                    </tr>
                </s:iterator>
            </tbody>
        </table>
    </s:else>
</body>
</html>
