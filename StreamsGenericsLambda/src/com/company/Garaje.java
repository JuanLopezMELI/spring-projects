package com.company;

import java.util.List;

public class Garaje {

    private int id;
    private List<Vehiculo> listaVehiculos;

    public Garaje(int id, List<Vehiculo> listaVehiculos) {
        this.id = id;
        this.listaVehiculos = listaVehiculos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    @Override
    public String toString() {
        return "Garaje: \n\t" +
                "Id: " + id + "\n\t" +
                "Lista de Vehiculos: " + listaVehiculos;
    }
}
