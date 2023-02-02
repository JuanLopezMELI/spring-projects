package com.company.cliente;

import com.company.negocio.Reserva;

import java.util.List;

public class Localizador {
    private List<Reserva> reservas;
    private int total;

    public Localizador(List<Reserva> reservas) {
        this.reservas = reservas;
        this.total = 0;
    }

    public String agregarReserva(Reserva reserva){
        reservas.add(reserva);
        return "Reserva agregada correctamente";
    }

    public String eliminarReserva(Reserva reserva){
        reservas.remove(reserva);
        return "Reserva eliminada correctamente";
    }

    public int calcularSubtotal(){
        return reservas.stream()
                .map(reserva -> reserva.getPrecio())
                .reduce(0,Integer::sum);
    }

    public double calcularTotalConDescuento(){
        return this.calcularSubtotal() * 105/100;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public int getTotal(){return total;}

    public void setTotal(int total){this.total = total;}

    @Override
    public String toString() {
        return "Localizador: \n" +
                "Reservas: " + reservas;
    }
}
