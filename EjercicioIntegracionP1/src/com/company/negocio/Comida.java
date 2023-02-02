package com.company.negocio;

import com.company.cliente.Cliente;

import java.time.LocalDateTime;

public class Comida extends Reserva{
    private int numeroMesa;
    private int cantidadPersonas;

    public Comida(int idReserva, LocalDateTime fechaReserva, int numeroMesa, int cantidadPersonas, int precio) {
        super(idReserva, "Comida", fechaReserva, precio);
        this.numeroMesa = numeroMesa;
        this.cantidadPersonas = cantidadPersonas;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    @Override
    public String toString() {
        return "Comida: " + "\n\t" +
                "Numero de Mesa: " + numeroMesa +"\n\t" +
                "Cantidad de Personas: " + cantidadPersonas +"\n\t" +
                "Id Reserva: " + idReserva +"\n\t" +
                "Tipo de Reserva: " + tipoReserva + "\n\t" +
                "Fecha de Reserva: " + fechaReserva +"\n";
    }
}
