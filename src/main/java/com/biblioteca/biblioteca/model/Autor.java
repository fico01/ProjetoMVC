package com.biblioteca.biblioteca.model;

public class Autor {
    private String nomeAutor;
    private int idade;

    public String getNomeAutor(){
        return nomeAutor;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNomeAutor(String nomeAutor){
        this.nomeAutor = nomeAutor;
    }
}
