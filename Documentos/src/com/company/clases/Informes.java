package com.company.clases;

import com.company.interfaces.Imprimible;

public class Informes implements Imprimible {
    private int longitud;
    private int numeroPaginas;
    private String autor;
    private String revisor;

    public Informes(int longitud, int numeroPaginas, String autor, String revisor) {
        this.longitud = longitud;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    @Override
    public String toString() {
        return "Informe:" +
                "Longitud: " + longitud + " palabras \n\t"+
                "Numero de Paginas: " + numeroPaginas + "\n\t"+
                "Autor: " + autor + "\n\t"+
                "Revisor: " + revisor + "\n";
    }
}
