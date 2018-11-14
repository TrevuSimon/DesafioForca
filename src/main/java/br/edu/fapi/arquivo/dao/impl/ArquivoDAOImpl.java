package br.edu.fapi.arquivo.dao.impl;

import br.edu.fapi.arquivo.dao.ArquivoDAO;
import br.edu.fapi.game.model.Jogo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ArquivoDAOImpl implements ArquivoDAO {
    @Override
    public boolean escreverJogo(List<Jogo> jogos, String nomeArvquivo) throws IOException {
        Path path = Paths.get(System.getProperty("user.home") + "/Desktop");
        if(!Files.exists(path, LinkOption.NOFOLLOW_LINKS)){
            Files.createDirectory(path);
        }

        path = path.resolve(nomeArvquivo+".txt");

        Files.deleteIfExists(path);
        Files.createFile(path);

        FileWriter fileWriter = new FileWriter(path.toFile());


        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.sss");
        bufferedWriter.write("Relatorio "+ nomeArvquivo+" gerado "+ simpleDateFormat.format(new Date())+"\n");

        for (Jogo jogo: jogos) {
            bufferedWriter.write("\nNome: "+jogo.getNome()+"\n");
            bufferedWriter.write("\nDificuldade: "+jogo.getDificuldade().getNome()+"\n");
            bufferedWriter.write("\nPalavra: "+jogo.getPalavra()+"\n");
            bufferedWriter.write("\nResultado: "+jogo.getSituacao().getNome()+"\n");
            bufferedWriter.write("\nTentativas: "+jogo.getVidas()+"\n");
            bufferedWriter.write("\nInterrupções: "+jogo.getInterrupcoes()+"\n");
            bufferedWriter.write("\nData e Hora de Início: "+simpleDateFormat.format(jogo.getDataInicio())+"\n");
            bufferedWriter.write("\nData e Hora de Fim: "+jogo.getDataFim()+"\n");
        }

        bufferedWriter.close();
        return true;
    }
}
