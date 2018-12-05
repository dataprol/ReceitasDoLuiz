package com.example.treinamento.receitasdoluiz;

public class Categorias {

    private String nome;
    private int imagemID;

    public Categorias( String nome, int imagemID ){

        this.nome = nome;
        this.imagemID = imagemID;
    }

    public String getNome() {
        return nome;
    }

    public int getImagemID() { return imagemID; }

}
