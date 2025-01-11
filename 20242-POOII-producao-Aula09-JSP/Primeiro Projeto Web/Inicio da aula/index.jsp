
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <title>Página Inicial</title>
</head>
<body>
<h1>Bem-vindo ao Meu Projeto Web!</h1>
<p>Esta é a página inicial desenvolvida com JSP.</p>
será que deu certo ?
<jsp:include page="teste.jsp" />

<%-- Exemplo de tag JSP --%>
<p>Data e Hora Atual: <%= new java.util.Date() %></p>
</body>
</html>
