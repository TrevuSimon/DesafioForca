package br.edu.fapi.game.dao;

import br.edu.fapi.game.model.Jogo;

public interface JogoDAO {
    int cadastrarJogo(Jogo jogo);
    boolean cadastrarPalavra(Jogo jogo);
    Jogo pesquisarJogoEmAndamento(Jogo jogo);
    boolean AtualizarJogo(Jogo jogo);
}
