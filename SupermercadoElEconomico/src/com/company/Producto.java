package com.company;

public class Producto {
    private int codigo;
    private String nombre;
    private int cantidadComprada;
    private int costoUnitario;

    public Producto(int codigo, String nombre, int cantidadComprada, int costoUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidadComprada = cantidadComprada;
        this.costoUnitario = costoUnitario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    public int getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(int costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    @Override
    public String toString() {
        return "Producto: \n\t" +
                "Codigo: " + codigo + "\n\t"+
                "Nombre='" + nombre + "\n\t"+
                "Cantidad comprada=" + cantidadComprada + "\n\t"+
                "Costo unitario=" + costoUnitario;
    }
}

