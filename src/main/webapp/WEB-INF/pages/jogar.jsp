<%--
  Created by IntelliJ IDEA.
  User: Gui_S
  Date: 11/11/2018
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jogar</title>

    <form action="prepararJogo" method="post">

        <label>Nome</label>
        <input type="text" name="nome" id="txtNome"><br>

        <label>Dificuldade</label><br>
        <input type="radio" name="dificuldade" value="facil"> Fácil<br>
        <input type="radio" name="dificuldade" value="medio"> Médio<br>
        <input type="radio" name="dificuldade" value="dificil"> Difícil<br>

        <input type="submit" value="Jogar">
    </form>

</head>
<body>

</body>
</html>
