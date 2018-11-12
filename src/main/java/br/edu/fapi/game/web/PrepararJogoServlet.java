package br.edu.fapi.game.web;

import br.edu.fapi.game.dao.JogoDAO;
import br.edu.fapi.game.dao.impl.JogoDAOImpl;
import br.edu.fapi.game.model.Jogo;
import br.edu.fapi.game.service.VerificaJogoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/prepararJogo")
public class PrepararJogoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        VerificaJogoService verificaJogoService = new VerificaJogoService();
        Jogo jogo = new Jogo(req.getParameter("nome"),req.getParameter("dificuldade"));

        if(verificaJogoService.JogoEmAndamento(jogo)){

        }else{

            JogoDAO jogoDAO = new JogoDAOImpl();

            jogoDAO.cadastrarJogo(jogo);
        }


    }
}
