package com.company.negocio;

import com.company.cliente.Cliente;

import java.time.LocalDateTime;

public class Hotel extends Reserva{
    private String nombreHotel;
    private int numeroHabitacion;
    private boolean incluyeComida;

    public Hotel(int idReserva, LocalDateTime fechaReserva, String nombreHotel, int numeroHabitacion, boolean incluyeComida, int precio) {
        super(idReserva, "Hotel", fechaReserva,precio);
        this.nombreHotel = nombreHotel;
        this.numeroHabitacion = numeroHabitacion;
        this.incluyeComida = incluyeComida;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public boolean isIncluyeComida() {
        return incluyeComida;
    }

    public void setIncluyeComida(boolean incluyeComida) {
        this.incluyeComida = incluyeComida;
    }

    @Override
    public String toString() {
        return "Hotel: \n\t" +
                "Nombre Hotel: " + nombreHotel + "\n\t" +
                "Numero Habitacion: " + numeroHabitacion + "\n\t" +
                "Incluye Comida: " + incluyeComida + "\n\t" +
                "Id Reserva: " + idReserva + "\n\t" +
                "Tipo Reserva: " + tipoReserva + "\n\t" +
                "Fecha Reserva: " + fechaReserva + "\n\t";
    }
}
