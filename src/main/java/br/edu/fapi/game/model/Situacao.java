package br.edu.fapi.game.model;

public class Situacao {
    private int id;
    private String nome;

    public Situacao(){
        this.id = 1;
        this.nome = "iniciado";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        if (id == 1){
            this.nome = "iniciado";
        }else if(id == 2){
            this.nome = "pausado";
        }else {
            this.nome = "finalizado";
        }

    }

    public String getNome() {
        return nome;
    }

}
