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
	<div>
	<form action="prepararPalavra" method="post">
		<table class="table" style="text-align: center;">
			<tr>
				<td>DIGITE A PALAVRA</td>
				<td colspan="3">AÇÃO</td>
			</tr>
			<tr>
				<td>
					<input type="text" name="palavra" id="txtPalavra" required>				
				</td>
				<td>
					<a href="index.jsp"><img src="site/voltar.jpg" width="40" height="40"/></a>
					<input type="image" src="site/avancar.jpg" width="40" height="40">
				</td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>
