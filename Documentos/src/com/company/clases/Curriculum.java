package com.company.clases;

import com.company.interfaces.Imprimible;

import java.util.ArrayList;

public class Curriculum implements Imprimible{
    private Persona persona;
    private ArrayList<String> habilidades;

    public Curriculum(Persona persona, ArrayList<String> habilidades) {
        this.persona = persona;
        this.habilidades = habilidades;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }S

    public void setHabilidadeSs(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Curriculum: " + persona + "\n\t"+
                "Habilidades: " + habilidades + "\n";
    }
}
