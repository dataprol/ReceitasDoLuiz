package com.example.treinamento.receitasdoluiz;

public class Receitas {

    private String nome;
    private String porcoes;
    private int tempo;
    private String url;
    private int imagemID;

    public Receitas(String nome, String porcoes, int tempo, String url, int imagemID ){

        this.nome = nome;
        this.porcoes = porcoes;
        this.tempo = tempo;
        this.url = url;
        this.imagemID = imagemID;
    }

    public String getNome() {
        return nome;
    }

    public String getPorcoes() { return porcoes; }

    public String getTempo() {
        return Integer.toString(tempo);
    }

    public String getUrl() {
        return url;
    }

    public int getImagemID() {
        return imagemID;
    }
}
