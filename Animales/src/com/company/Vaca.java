package com.company;

import com.company.interfaces.IHerbivoro;

public class Vaca extends Animal implements IHerbivoro {
    public Vaca(String color, String nombre, double peso) {
        super(color, nombre, peso);
    }

    @Override
    public void emitirSonido(){
        System.out.println("Muuuuuuuuuuuuuuuu");
    }

    @Override
    public String toString() {
        return "Vaca{" +
                "color='" + color + '\'' +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }
}
