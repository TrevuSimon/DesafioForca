<%--
  Created by IntelliJ IDEA.
  User: Gui_S
  Date: 14/11/2018
  Time: 09:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Relatórios</title>
	<link rel="stylesheet" type="text/css" href="site/style.css" />
</head>
<body>
    <table class="table" width="100" style="text-align: center;">
    	<tbody>
    		<tr>
		       	<td width="150" colspan="3">
		    		<img src="site/report.png" width="150" height="150">
	    		</td>
    		</tr>
    		<tr>
		       	<td width="150">
		    		<label>GERAL</label>
		    	</td>
	    	   	<td width="150">
		    		<label>VITÓRIAS</label>
		    	</td>
		    	<td width="150">
		    		<label>DERROTAS</label>
		    	</td>
	    	</tr>
	    	<tr>
	    		<td>
	    		 	<form action="relatorioGeral" method="post">
		        		<input type="image" src="site/download.png" width="80" height="80">
	   			 	</form>
	    		</td>
	    		<td>
	    			<form action="relatorioVitoria" method="post">
		        		<input type="image" src="site/download.png" width="80" height="80">
		    		</form>
	    		</td>
	    		<td>
	    			<form action="/relatorioDerrota" method="post">
		        		<input type="image" src="site/download.png" width="80" height="80">
		    		</form>
	    		</td>	
    		<tr>
				<td colspan="3">	
					<a href="index.jsp"><img src="site/home.png" width="50" height="50"/></a>
				</td>
			</tr>	    
	    </tbody>
	</table>
</body>
</html>
