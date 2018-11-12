package br.edu.fapi.game.service;

import br.edu.fapi.game.dao.JogoDAO;
import br.edu.fapi.game.dao.impl.JogoDAOImpl;
import br.edu.fapi.game.model.Jogo;

public class VerificaJogoService {

    public boolean JogoEmAndamento(Jogo jogo) {
        JogoDAO jogoDAO = new JogoDAOImpl();

        if(jogoDAO.pesquisarJogoEmAndamento(jogo) == null){
            return true;
        }
        return false;
    }


    public boolean VerificarChuteJaFeito(Jogo jogo){
        return true;
    }

    public boolean VerificarChute(Jogo jogo){
        return true;
    }
}
