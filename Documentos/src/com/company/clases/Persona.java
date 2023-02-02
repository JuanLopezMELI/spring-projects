package com.company.clases;

import com.company.interfaces.Imprimible;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private String email;

    public Persona(String nombre, int edad, String dni, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n\t"+
                "Edad: " + edad + "\n\t"+
                "Dni: " + dni + "\n\t"+
                "Email: " + email ;
    }
}
