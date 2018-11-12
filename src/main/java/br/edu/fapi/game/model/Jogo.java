package br.edu.fapi.game.model;

import java.util.Date;

public class Jogo {

    private int id;
    private String nome;
    private Date dataInicio;
    private Dificuldade dificuldade;
    private Situacao situacao;
    private int vidas;

    public Jogo(String nome, String dificuldade) {
        this.nome = nome;
        this.dataInicio = new Date();
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

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
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
}
