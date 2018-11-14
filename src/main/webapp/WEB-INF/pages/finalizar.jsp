<%@ page import="br.edu.fapi.game.model.Jogo" %><%--
  Created by IntelliJ IDEA.
  User: Gui_S
  Date: 14/11/2018
  Time: 02:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Fim do jogo!</h1>
</body>
<% Jogo jogo=(Jogo)session.getAttribute("jogo.atual");%>

    <% if(jogo.getSituacao().getId() == 3) {%>
        <p>Parabéns <%=jogo.getNome()%> você ganhou jogo!</p>
    <%} else {%>
        <p>que pena, não foi dessa vez.</p>
    <%}%>

    <p>A palavra era: <%=jogo.getPalavra()%></p>
<div id="voltarMain">
        <a href="controller?acao=voltarIndex">Voltar</a>
    </div>
</html>
