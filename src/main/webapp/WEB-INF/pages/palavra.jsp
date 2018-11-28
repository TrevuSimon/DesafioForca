<%--
  Created by IntelliJ IDEA.
  User: Gui_S
  Date: 12/11/2018
  Time: 08:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>Palavra</title>
<link rel="stylesheet" type="text/css" href="site/style.css" />
</head>
<body>
	<form action="prepararPalavra" method="post">
		<table class="table">
			<tr>
				<td>DIGITE A PALAVRA</td>
				<td>AÇÃO</td>
			</tr>
			<tr>
				<td>
					<input type="text" name="palavra" id="txtPalavra" required>				
				</td>
				<td>
					<input type="submit" value="Pronto">
					<br><br>
					<input type="button" value="Voltar"><a href="webapp/index.jsp"></a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
