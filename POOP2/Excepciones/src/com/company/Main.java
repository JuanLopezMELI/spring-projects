package com.company;

public class Main {

    public static void main(String[] args) {

        PracticaExcepciones practica = new PracticaExcepciones();
        try {
            if(practica.a == 0){
                throw new IllegalArgumentException("No se puede dividir por cero");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Programa finalizado");
        }
    }
}
