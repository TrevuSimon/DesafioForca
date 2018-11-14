package br.edu.fapi.game.web;

import br.edu.fapi.game.model.Jogo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/fazerChute")
public class FazerChuteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Jogo jogo = (Jogo)req.getSession().getAttribute("jogo.atual");



        if(jogo.getChute() == null){
            jogo.setChute("");
        }
        String chute = jogo.getChute();

        if(chute.indexOf(req.getParameter("chute"))==-1) {
            chute += req.getParameter("chute");

            jogo.setChute(chute);

            if (jogo.getPalavra().indexOf(req.getParameter("chute")) == -1) {
                jogo.setVidas(jogo.getVidas() - 1);
            }
        }
        jogo.atualizar();
        req.getSession().setAttribute("jogo.atual",jogo);

        if(jogo.getVidas() > 0) {
            if (jogo.getPalavra().equals(jogo.getPalavraComChutes())) {
                jogo.finalizar();
                req.getSession().setAttribute("jogo.atual",jogo);

                RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/pages/finalizar.jsp");
                requestDispatcher.forward(req, resp);
            } else {
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/pages/jogo.jsp");
                requestDispatcher.forward(req, resp);
            }
        }else{
            jogo.perder();
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/pages/finalizar.jsp");
            requestDispatcher.forward(req, resp);
        }

    }
}
