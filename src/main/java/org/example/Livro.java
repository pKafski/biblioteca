package org.example;

public class Livro {
    private String titulo;
    private String genero;
    private String autor;
    protected boolean status;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String mostrarStatus() {
        if (this.status) {
            return "Locado";
        }
        return "Disponível";
    }

    @Override
    public String toString() {
        return "\n"
                + "titulo: " + titulo + "\n"
                + "genero: " + genero + "\n"
                + "autor: " + autor + "\n"
                + "Situação do livro: " + this.mostrarStatus() + "\n";
    }
}

