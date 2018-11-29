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
    <link rel="stylesheet" type="text/css" href="site/style.css" />
</head>
<body>
	<table class="tablejogo" style="text-align: center;">
		<tr>
			<td>PALAVRA</td>
			<td>VIDAS</td>
			<td>DIGITOS</td>
			<td>CHUTE</td>
			<td>&darr; Desistir? &darr;</td>
		</tr>
		<tr>
			<td>
		    	<% Jogo jogo=(Jogo)session.getAttribute("jogo.atual");%>
		    	<%=jogo.getPalavraComChutes() %>
			</td>
			<td>
				<%=jogo.getVidas()%>
			</td>
			<td>
				<%=jogo.getChute()%>
			</td>
			<td>
				<form action="fazerChute" method="post">
        			<input type="text" id="txtChute" name="chute" maxlength="1">
        			<input type="submit" value="&Phi; chutar &Phi;">
    			</form>
			</td>
			<td>
				<form action="desistir" method="post">
        			<input type="image" src="site/desistir.jpg" width="80" height="80">
    			</form>
			</td>
    </table>
</body>
</html>
