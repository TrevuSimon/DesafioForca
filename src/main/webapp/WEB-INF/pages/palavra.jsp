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

</head>
<body>
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
					<input type="submit" value="Jogar">
				<td>
				<td>	
					<input type="button" value="Voltar"><a href="webapp/index.jsp"></a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
