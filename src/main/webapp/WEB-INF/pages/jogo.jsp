<%@ page import="br.edu.fapi.game.model.Jogo" %><%--
  Created by IntelliJ IDEA.
  User: Gui_S
  Date: 12/11/2018
  Time: 09:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Jogo</title>
    <label>Palavra: </label>
    <% Jogo jogo=(Jogo)session.getAttribute("jogo.atual");%>
    <%=jogo.getPalavraComChutes() %>

    <br>
    <br>

    <label>Chutes: </label>
    <%=jogo.getChute()%>

    <hr>
    <form action="fazerChute" method="post">
        <label>Chutes</label>
        <input type="text" id="txtChute" name="chute">

        <input type="submit" value="chutar">
    </form>

</head>
<body>

</body>
</html>
