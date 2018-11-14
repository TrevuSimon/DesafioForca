package br.edu.fapi.game.web;

import br.edu.fapi.game.model.Jogo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/desistir")
public class DesistirServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Jogo jogo = (Jogo)req.getSession().getAttribute("jogo.atual");

        jogo.desistir();

        resp.sendRedirect("index.jsp");
    }
}
