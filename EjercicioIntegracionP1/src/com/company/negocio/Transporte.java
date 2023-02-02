package com.company.negocio;

import com.company.cliente.Cliente;

import java.time.LocalDateTime;

public class Transporte extends Reserva{
    private String destino;
    private String origen;
    private int horas;

    public Transporte(int idReserva, LocalDateTime fechaReserva, String destino, String origen, int horas, int precio) {
        super(idReserva, "Transporte", fechaReserva,precio);
        this.destino = destino;
        this.origen = origen;
        this.horas = horas;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Transporte{" +
                "idReserva=" + idReserva +
                ", tipoReserva='" + tipoReserva + '\'' +
                ", fechaReserva=" + fechaReserva +
                ", destino='" + destino + '\'' +
                ", origen='" + origen + '\'' +
                ", horas=" + horas +
                '}';
    }
}
