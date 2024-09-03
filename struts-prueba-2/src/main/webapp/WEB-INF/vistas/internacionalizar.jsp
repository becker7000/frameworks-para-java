<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Internacionalización con i18n</title>
</head>
<body>

    <h1><s:text name="global.heading"/></h1>

    <s:url action="locale" var="pageEN">
        <s:param name="request_locale">en</s:param>
    </s:url>

    <s:url action="locale" var="pageES">
        <s:param name="request_locale">es</s:param>
    </s:url>

    <s:url action="locale" var="pageFR">
        <s:param name="request_locale">fr</s:param>
    </s:url>

    <a href="<s:property value='#pageEN'/>">English</a>
    <a href="<s:property value='#pageES'/>">Spanish</a>
    <a href="<s:property value='#pageFR'/>">French</a>

    <s:form action="internacionalizar-form">
        <s:textfield name="nombre" size="20" key="global.name"/>
        <s:textfield name="edad" size="20" key="global.age"/>
        <s:submit name="enviar" align="center" key="global.submit"/>
    </s:form>

</body>
</html>
