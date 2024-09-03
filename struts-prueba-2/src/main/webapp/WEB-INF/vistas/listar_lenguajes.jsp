<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title><s:property value="titulo" /></title>
</head>
<body>

    <h2>
        <s:property value="titulo" /><br/>
        <s:property value="fecha" /><br/>
        <s:date name="fecha" format="dd/MM/yyyy" /><br/>
    </h2>
    <table>
        <thead>
            <tr>
                <th>Nombre</th>
            </tr>
        </thead>
        <tbody>
            <s:iterator value="lenguajes">
                <tr>
                    <td><s:property /></td>
                </tr>
            </s:iterator>
        </tbody>
    </table>
</body>
</html>
