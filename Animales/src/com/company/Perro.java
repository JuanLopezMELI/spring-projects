package com.company;

import com.company.interfaces.ICarnivoro;

public class Perro extends Animal implements ICarnivoro {
    public Perro(String color, String nombre, double peso) {
        super(color, nombre, peso);
    }

    @Override
    public void emitirSonido(){
        System.out.println("Guau guau. Guau, guau");
    }

    @Override
    public String toString() {
        return "Perro{" +
                "color='" + color + '\'' +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }
}
