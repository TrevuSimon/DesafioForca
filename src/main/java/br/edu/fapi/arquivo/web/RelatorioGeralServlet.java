package br.edu.fapi.arquivo.web;

import br.edu.fapi.arquivo.dao.ArquivoDAO;
import br.edu.fapi.arquivo.dao.impl.ArquivoDAOImpl;
import br.edu.fapi.game.model.Jogo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/relatorioGeral")
public class RelatorioGeralServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArquivoDAO arquivoDAO = new ArquivoDAOImpl();
        List<Jogo> jogos = new ArrayList<Jogo>();


    }
}
