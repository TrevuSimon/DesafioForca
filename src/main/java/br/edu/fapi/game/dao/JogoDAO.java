package br.edu.fapi.game.dao;

import br.edu.fapi.game.model.Jogo;

import java.util.List;

public interface JogoDAO {
    int cadastrarJogo(Jogo jogo);
    boolean cadastrarPalavra(Jogo jogo);
    Jogo pesquisarJogoEmAndamento(Jogo jogo);
    boolean AtualizarJogo(Jogo jogo);
    boolean FinalizarJogo(Jogo jogo);
    boolean PerderJogo(Jogo jogo);
    boolean DesistirJogo(Jogo jogo);
    List<Jogo> listarJogos();
}
