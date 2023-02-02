package com.company.negocio;

import com.company.cliente.Cliente;

import java.time.LocalDateTime;

public class Boletos extends Reserva{
    private int numeroBoleto;
    private String origen;
    private String destino;

    public Boletos(int idReserva, LocalDateTime fechaReserva, int numeroBoleto, String origen, String destino, int precio) {
        super(idReserva, "Boleto",fechaReserva,precio);
        this.numeroBoleto = numeroBoleto;
        this.origen = origen;
        this.destino = destino;
    }

    public int getNumeroBoleto() {
        return numeroBoleto;
    }

    public void setNumeroBoleto(int numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }


    @Override
    public String toString() {
        return super.toString() + "Boletos: " + "\n\t" +
                "Numero de Boleto: " + numeroBoleto + "\n\t" +
                "Origen: " + origen + "\n\t" +
                "Destino: " + destino ;
    }
}
