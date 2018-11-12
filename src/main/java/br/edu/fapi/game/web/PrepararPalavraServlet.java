package br.edu.fapi.game.web;

import br.edu.fapi.game.dao.JogoDAO;
import br.edu.fapi.game.dao.impl.JogoDAOImpl;
import br.edu.fapi.game.model.Jogo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/prepararPalavra")
public class PrepararPalavraServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Jogo jogo = (Jogo) req.getSession().getAttribute("jogo.atual");
        jogo.setPalavra(req.getParameter("palavra"));

        JogoDAO jogoDAO = new JogoDAOImpl();
        //TODO fluxo altenativo, cadastrar palavra
        jogoDAO.cadastrarPalavra(jogo);
        req.getSession().setAttribute("jogo.atual",jogo);

        req.getSession().setAttribute("jogo.atual", jogo);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/pages/palavra.jsp");
        requestDispatcher.forward(req, resp);
    }
}
