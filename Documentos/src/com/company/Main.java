package com.company;

import com.company.clases.*;
import com.company.clases.Curriculum;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Informes informe = new Informes(2,100,"Johny","Carlos");
        informe.imprimir();
        LibrosPDF libro = new LibrosPDF(100,"Juan","Despues de ti","Romance");
        libro.imprimir();
        Persona persona = new Persona("Carlos",20,"12345","carlos@carlos.com");
        ArrayList<String> habilidades = new ArrayList<>(Arrays.asList("Comer","Dormir"));
        Curriculum curriculum = new Curriculum(persona,habilidades);
        curriculum.imprimir();
    }
}
