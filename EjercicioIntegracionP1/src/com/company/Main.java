package com.company;

import com.company.cliente.Cliente;
import com.company.cliente.Localizador;
import com.company.negocio.Boletos;
import com.company.negocio.Comida;
import com.company.negocio.Hotel;
import com.company.negocio.Transporte;

import java.time.LocalDateTime;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LocalDateTime fecha = LocalDateTime.of(2020,12,15,12,30);
        Cliente cliente = new Cliente("Juan","123456","jp@jp.com",21);
        Boletos boleto = new Boletos(1, fecha,1,"Cali","Medellin",50000);
        Comida comida = new Comida(1,fecha,2,4,50000);
        Hotel hotel = new Hotel(1,fecha,"Hilton",4,true,50000);
        Transporte transporte = new Transporte(1,fecha,"Cali","Medellin",8,50000);
        Localizador localizador = new Localizador(List.of(boleto,comida,hotel,transporte));
        System.out.println(localizador);
    }
}
