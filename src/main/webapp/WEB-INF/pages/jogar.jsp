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
				<th>NOME DO JOGADOR</th>
				<th>DIFICULDADE</th>
				<th>AÇÃO</th>
			</tr>
			<tr>
				<td>
					<input type="text" name="nome" id="txtNome" required><br>
				</td>
				<td>
					<input type="radio" name="dificuldade" value="facil"> Fácil<br> 
					<input type="radio" name="dificuldade" value="medio"> Médio<br> 
					<input type="radio" name="dificuldade" value="dificil"> Difícil<br>
				</td>
				<td>
					<input type="submit" value="Jogar">
					<br><br>
					<input type="button" value="Voltar"><a href="webapp/index.jsp"></a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
