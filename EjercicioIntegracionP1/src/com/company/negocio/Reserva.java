package com.company.negocio;

import com.company.cliente.Cliente;

import java.time.LocalDateTime;

public class  Reserva {
    protected int idReserva;
    protected String tipoReserva;
    protected LocalDateTime fechaReserva;
    protected int precio;

    public Reserva(int idReserva, String tipoReserva, LocalDateTime fechaReserva,int precio) {
        this.idReserva = idReserva;
        this.tipoReserva = tipoReserva;
        this.fechaReserva = fechaReserva;
        this.precio = precio;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getTipoReserva() {
        return tipoReserva;
    }

    public void setTipoReserva(String tipoReserva) {
        this.tipoReserva = tipoReserva;
    }

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDateTime fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public int getPrecio(){ return precio; }

    public void setPrecio(int precio) { this.precio = precio; }

    @Override
    public String toString() {
        return "Reserva: " + "\n" +
                "Id Reserva: " + idReserva + "\n" +
                "Tipo de Reserva: " + tipoReserva + "\n" +
                "Fecha de Reserva: " + fechaReserva + "\n";
    }
}
