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
	<link rel="stylesheet" type="text/css" href="site/style.css" />
</head>
	<% Jogo jogo=(Jogo)session.getAttribute("jogo.atual");%>
	<body>	
		<table>
			<thead>
				<tr>
				    <td>
				    	<img src="site/meme.jpg" width="80" height="80" />
			    	</td>
				    <td>
				    	<img src="site/meme2.png" width="80" height="80" />
			    	</td>
				</tr>
			<thead>
			<tbody>
				<tr>
					<td colspan="2">
						<%=jogo.getNome()%>
					</td>
				</tr>
				<tr>
					<td colspan="2">
					    <% if(jogo.getSituacao().getId() == 3) {%>
				        	<p>Parabéns você ganhou jogo!</p>
				    	<%} else {%>
				        	<p>que pena, não foi dessa vez.</p>
				        	<img src="site/_perdeu.jpg" width="200" height="100"/>
				    	<%}%>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<hr>
					</td>
				</tr>
				<tr>
					<td>			
				    	<p>A PALAVRA ÉRA:</p>
					</td>
					<td>			
				    	<p><%=jogo.getPalavra()%></p>
					</td>
				</tr>			
				<tr>
					<td colspan="2">
						<hr>
					</td>
				</tr>
		    	<tr>				
		    	<tr>
					<td colspan="2">	
						<a href="index.jsp"><img src="site/home.png" width="80" height="80"/></a>	
						<p>&uarr;&uarr;&uarr;&uarr;&uarr;&uarr;&uarr;&uarr;&uarr;&uarr;</p>	
					</td>
				</tr>		
		    </tbody>
	   	</table>
	</body>
</html>
