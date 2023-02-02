package com.company.clases;

import com.company.interfaces.Imprimible;

public class LibrosPDF implements Imprimible {
    private int cantidadPaginas;
    private String nombreAutor;
    private String titulo;
    private String genero;

    public LibrosPDF(int cantidadPaginas, String nombreAutor, String titulo, String genero) {
        this.cantidadPaginas = cantidadPaginas;
        this.nombreAutor = nombreAutor;
        this.titulo = titulo;
        this.genero = genero;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

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

    @Override
    public String toString() {
        return "LibroPDF: " +
                "Cantidad de Paginas: " + cantidadPaginas +"\n\t"+
                "Nombre del Autor: " + nombreAutor + "\n\t"+
                "Titulo: " + titulo + "\n\t"+
                "Genero: " + genero + "\n";
    }
}
