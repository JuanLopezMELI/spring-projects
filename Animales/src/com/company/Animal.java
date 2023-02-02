package com.company;

public abstract class Animal {
    protected String color;
    protected String nombre;
    protected double peso;

    public Animal(String color, String nombre, double peso) {
        this.color = color;
        this.nombre = nombre;
        this.peso = peso;
    }

    public abstract void emitirSonido();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }
}
