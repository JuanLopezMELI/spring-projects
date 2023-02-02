package com.company.cliente.repositorios;

import com.company.cliente.Localizador;
import com.company.cliente.Cliente;
import java.util.List;

public class LocalizadorRepositorio {
    private List<Localizador> localizadores;
    private String dniCliente;
    private double total;

    public LocalizadorRepositorio(List<Localizador> localizadores, String dni) {
        this.localizadores = localizadores;
        this.dniCliente = dni;
        this.total = 90000;
    }

    public String agregarLocalizador(Localizador localizador){
        localizadores.add(localizador);
        return "Se agrego el nuevo localizador";
    }

    public String eliminarLocalizador(Localizador localizador){
        localizadores.remove(localizador);
        return "Localizador eliminado correctamente";
    }

    public List<Localizador> getLocalizadores() {
        return localizadores;
    }

    public void setLocalizadores(List<Localizador> localizadores) {
        this.localizadores = localizadores;
    }

    public String getCliente() {
        return dniCliente;
    }

    public void setCliente(Cliente cliente) {
        this.dniCliente = dniCliente;
    }
}
