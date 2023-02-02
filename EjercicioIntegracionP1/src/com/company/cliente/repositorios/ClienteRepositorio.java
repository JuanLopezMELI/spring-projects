package com.company.cliente.repositorios;

import com.company.cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepositorio {
    private List<Cliente> clientes;

    public ClienteRepositorio() {
        this.clientes = new ArrayList<>();
    }

    public String agregarCliente(Cliente cliente){
        clientes.add(cliente);
        return "Se agrego el cliente correctamente";
    }

    public String elminarCliente(Cliente cliente){
        clientes.remove(cliente);
        return "Se elimino el cliente correctamente";
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "ClienteRepositorio: " +
                "Clientes: " + clientes;
    }
}
