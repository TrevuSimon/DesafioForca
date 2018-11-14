package br.edu.fapi.arquivo.dao;

import br.edu.fapi.game.model.Jogo;

import java.io.IOException;
import java.util.List;

public interface ArquivoDAO {
    boolean escreverJogo(List<Jogo> jogos, String nomeArvquivo) throws IOException;
}
