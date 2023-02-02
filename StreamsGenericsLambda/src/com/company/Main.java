package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("Ford","Fiesta",1000));
        vehiculos.add(new Vehiculo("Ford","Focus",1200));
        vehiculos.add(new Vehiculo("Ford","Explorer",2500));
        vehiculos.add(new Vehiculo("Fiat","Uno",500));
        vehiculos.add(new Vehiculo("Fiat","Cronos",1000));
        vehiculos.add(new Vehiculo("Fiat","Torino",1250));
        vehiculos.add(new Vehiculo("Chevrolet","Aveo",1250));
        vehiculos.add(new Vehiculo("Chevrolet","Spin",2500));
        vehiculos.add(new Vehiculo("Toyota","Corola",1200));
        vehiculos.add(new Vehiculo("Toyota","Fortuner",3000));
        vehiculos.add(new Vehiculo("Renault","Logan",950));

        Garaje garaje = new Garaje(1,vehiculos);

        System.out.println("Lista de Vehiculos ordenada por precio");
        garaje.getListaVehiculos().stream()
                .sorted(Comparator.comparing(Vehiculo::getCosto))
                .forEach(System.out::println);

        System.out.println("Lista de Vehiculos ordenada por marca y precio");
        garaje.getListaVehiculos().stream()
                .sorted(Comparator.comparing(Vehiculo::getMarca)
                .thenComparing(Vehiculo::getCosto))
                .forEach(System.out::println);

        System.out.println("Lista de Vehiculos que no valen mas de 1000");
        garaje.getListaVehiculos().stream()
                .filter(vehiculo -> vehiculo.getCosto() <= 1000)
                .sorted(Comparator.comparing(Vehiculo::getCosto))
                .forEach(System.out::println);

        System.out.println("Lista de Vehiculos que valen de 1000 en adelante");
        garaje.getListaVehiculos().stream()
                .filter(vehiculo -> vehiculo.getCosto() >= 1000)
                .sorted(Comparator.comparing(Vehiculo::getCosto))
                .forEach(System.out::println);

        System.out.println("Promedio de precios de todos los vehiculos:");
        double promedio = garaje.getListaVehiculos().stream()
                .mapToDouble(Vehiculo::getCosto).average().orElse(-1);
        System.out.println("\t" + promedio);
    }
}
