package com.biblioteca.biblioteca.model;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;

    // getters e setters
    // serão adicionados
    // a seguir

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
