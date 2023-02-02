package com.company;


import java.util.ArrayList;

public class Distribuidora {

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Perecedero("Leche",2300,3));
        productos.add(new Perecedero("Queso",5300,2));
        productos.add(new Perecedero("Jamon",6800,1));
        productos.add(new Perecedero("Carne",10900,1));
        productos.add(new Perecedero("Yogurt",1000,3));
        productos.add(new NoPerecedero("Arroz",2000,"Grano"));
        productos.add(new NoPerecedero("Frijol",3500,"Grano"));
        productos.add(new NoPerecedero("Harina",1500,"Harina"));
        productos.add(new NoPerecedero("Detergente",3000,"Limpieza"));
        productos.add(new NoPerecedero("Shampoo",2000,"Aseo"));

        double total = 0.0;
        for(Producto producto : productos){
            total += producto.calcular(5);
        }
        System.out.println("El precio total de los productos es: " + total);
    }
}
