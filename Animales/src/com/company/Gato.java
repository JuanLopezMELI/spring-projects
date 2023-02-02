package com.company;

import com.company.interfaces.ICarnivoro;

public class Gato extends Animal implements ICarnivoro {
    public Gato(String color, String nombre, double peso) {
        super(color, nombre, peso);
    }

    @Override
    public void emitirSonido(){
        System.out.println("Miaauuuuuu, miaauuuuu");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "color='" + color + '\'' +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }
}
