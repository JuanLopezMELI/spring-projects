package com.company.entities;

public class Usuario {
    private String nombre;
    private String tipoUsuario;

    public Usuario(String nombre, String tipoUsuario){
        this.nombre = nombre;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "/n Cargo: " + tipoUsuario;
    }
}
