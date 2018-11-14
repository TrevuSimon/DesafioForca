package br.edu.fapi.game.model;

import br.edu.fapi.game.dao.JogoDAO;
import br.edu.fapi.game.dao.impl.JogoDAOImpl;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;

public class Jogo {

    private int id;
    private String nome;
    private Timestamp dataInicio;
    private Timestamp dataFim;
    private Dificuldade dificuldade;
    private Situacao situacao;
    private int vidas;

    private String palavra;
    private String chute;

    public Jogo(String nome, String dificuldade) {
        this.nome = nome;
        this.dataInicio = new Timestamp(System.currentTimeMillis());
        this.dificuldade = new Dificuldade(dificuldade);
        this.vidas = this.dificuldade.getVidas();
        this.situacao = new Situacao();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Timestamp getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Timestamp dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Timestamp getDataFim() {
        return dataFim;
    }

    public void setDataFim(Timestamp dataFim) {
        this.dataFim = dataFim;
    }

    public Dificuldade getDificuldade() {
        return dificuldade;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public String getPalavra() {
        return palavra;
    }

    public String getPalavraComChutes() {

        char[] palavraChuteChars = new char[palavra.length()];

        if(chute == null){
            chute = "";
        }

        for (int j=0;j<palavra.length();j++){
            palavraChuteChars[j] = '_';
        }

        for (int i=0;i<chute.length();i++){
            for (int j=0;j<palavra.length();j++){
                if(chute.charAt(i) == palavra.charAt(j)){
                    palavraChuteChars[j] = chute.charAt(i);
                }
            }
        }

        String palavraChute = String.valueOf(palavraChuteChars);
        return palavraChute;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getChute() {
        return chute;
    }

    public void setChute(String chute) {
        this.chute = chute;
    }

    public void atualizar() {
        JogoDAO jogoDAO =  new JogoDAOImpl();
        jogoDAO.AtualizarJogo(this);
    }

    public void finalizar() {
        JogoDAO jogoDAO =  new JogoDAOImpl();
        this.situacao.setId(3);
        jogoDAO.FinalizarJogo(this);
    }

    public void perder() {
        JogoDAO jogoDAO =  new JogoDAOImpl();
        this.situacao.setId(2);
        jogoDAO.PerderJogo(this);
    }

    public void desistir() {
        JogoDAO jogoDAO =  new JogoDAOImpl();
        this.situacao.setId(4);
        jogoDAO.DesistirJogo(this);
    }
}
