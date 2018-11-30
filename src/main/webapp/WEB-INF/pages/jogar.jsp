<%--
  Created by IntelliJ IDEA.
  User: Gui_S
  Date: 11/11/2018
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
	<title>Jogar</title>
	<link rel="stylesheet" type="text/css" href="site/style.css" />
</head>
<body>
	<form action="prepararJogo" method="post">
		<table class="table">
			<tr>
				<td>
					<p>NOME DO JOGADOR</p>
				</td>
				<td class="tdLeft">
					<input type="text" name="nome" id="txtNome" required><br>
				</td>				
			</tr>
			<tr>
				<td>
					<p>DIFICULDADE</p>
				</td>
				<td class="tdLeft">
					<input type="radio" name="dificuldade" value="facil" required> Fácil<br> 
					<input type="radio" name="dificuldade" value="medio"> Médio<br> 
					<input type="radio" name="dificuldade" value="dificil"> Difícil<br>
				</td>
			</tr>
			<tr>
				<td>
					<p>AÇÃO</p>
				</td>
				<td class="tdLeft">
					<a href="index.jsp"><img src="site/voltar.jpg" width="50" height="50"/></a>
					<input type="image" src="site/avancar.jpg" width="50" height="50">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
