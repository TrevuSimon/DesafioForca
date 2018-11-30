<%@ page import="br.edu.fapi.game.model.Jogo" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Jogo</title>
    <link rel="stylesheet" type="text/css" href="site/style.css" />
</head>
<body>
	<% Jogo jogo=(Jogo)session.getAttribute("jogo.atual");%>
	<table class="table" style="text-align: center;">
		<tr>
			<td width="150px" height="50px" colspan="2">
				<p>PALAVRA</p>
			</td>
			<td width="150px" height="50px" colspan="2">
		   		<%=jogo.getPalavraComChutes() %>
			</td>
		</tr>
		<tr style="background-color: #f2f2f2; border-color: #f2f2f2;">
			<td width="150px" height="50px" colspan="2">
				<p>VIDAS</p>
			</td>
			<td width="150px" height="50px" colspan="2">
				<%=jogo.getVidas()%>
			</td>
		</tr>
		<tr >
			<td width="150px" height="50px" colspan="2">
				<p>DIGITOS</p>
			</td>
			<td width="150px" height="50px" colspan="2">
				<%=jogo.getChute()%>
			</td>
		</tr>
		<tr style="background-color: #f2f2f2; border-color: #f2f2f2;" align=center>
			<td>
				<p>CHUTE</p>
			</td>
			<td colspan="2">
				<form action="fazerChute" method="post">
        			<input type="text" id="txtChute" name="chute" maxlength="1">
        			<input type="submit" value="&Phi; chutar &Phi;">
       			</form>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<p>DESISTIR</p>
			</td>
			<td colspan="2">
				<form action="desistir" method="post">
        			<input type="image" src="site/desistir.jpg" width="150" height="150">
    			</form>
			</td>
		</tr>
    </table>
</body>
</html>
