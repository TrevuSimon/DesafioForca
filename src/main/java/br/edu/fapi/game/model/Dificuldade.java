package br.edu.fapi.game.model;

public class Dificuldade {
    private int id;
    private String nome;
    private int vidas;

    public Dificuldade(String dificuldade) {
        if("facil".equals(dificuldade)){
            this.setNome(dificuldade);
            this.setId(1);
            this.vidas = 7;
        }else if("medio".equals(dificuldade)){
            this.setNome(dificuldade);
            this.setId(2);
            this.vidas = 5;
        }else{
            this.setNome(dificuldade);
            this.setId(3);
            this.vidas = 3;
        }
    }

    public Dificuldade(int id) {
        if(id == 1){
            this.setNome("facil");
            this.setId(1);
            this.vidas = 7;
        }else if(id == 2){
            this.setNome("medio");
            this.setId(2);
            this.vidas = 5;
        }else{
            this.setNome("dificil");
            this.setId(3);
            this.vidas = 3;
        }
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

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}
