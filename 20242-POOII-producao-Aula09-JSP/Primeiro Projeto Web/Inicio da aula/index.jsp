
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <title>P�gina Inicial</title>
</head>
<body>
<h1>Bem-vindo ao Meu Projeto Web!</h1>
<p>Esta � a p�gina inicial desenvolvida com JSP.</p>
ser� que deu certo ?
<jsp:include page="teste.jsp" />

<%-- Exemplo de tag JSP --%>
<p>Data e Hora Atual: <%= new java.util.Date() %></p>
</body>
</html>
