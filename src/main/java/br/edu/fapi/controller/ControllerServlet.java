package br.edu.fapi.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/controller")
public class ControllerServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String acao = req.getParameter("acao");

        if ("jogar".equalsIgnoreCase(acao)) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/pages/jogar.jsp");
            requestDispatcher.forward(req, resp);
        }else if("voltarIndex".equalsIgnoreCase(acao)){
            resp.sendRedirect("index.jsp");
        }else if("gerarRelatorios".equalsIgnoreCase(acao)) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/pages/relatorios.jsp");
            requestDispatcher.forward(req, resp);
        }
    }

}
