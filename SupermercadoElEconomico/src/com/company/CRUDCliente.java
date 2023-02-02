package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class CRUDCliente {
    private List<Cliente> clientes;

    public CRUDCliente(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public String eliminarCliente(Cliente cliente){
        this.clientes.remove(cliente);
        return "Usuario eliminado correctamente";
    }

    public String agregarCliente(Cliente cliente){
        this.clientes.add(cliente);
        return "Cliente agregado correctamente";
    }

    public String actualizarCliente(Cliente clienteNuevo){
        String dni = clienteNuevo.getDni();
        int indice = this.buscarCliente(dni);
        if(indice != -1) {
            clientes.set(indice, new Cliente(clienteNuevo.getDni(), clienteNuevo.getNombre(), clienteNuevo.getApellido()));
            return "El cliente ha sido actualizado";
        }
        return "El cliente no existe, no se ha podido actualizar";
    }

    public int buscarCliente(String dni){
        Cliente encontrado = clientes.stream()
                .filter(cliente -> cliente.getDni().equals(dni))
                .collect(Collectors.toList()).get(0);
        if(encontrado.getClass().equals("Cliente")){
            System.out.println("Se ha encontrado el cliente" + encontrado);
            return clientes.indexOf(encontrado);
        }
        return -1;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "CRUDCliente{" +
                "clientes=" + clientes +
                '}';
    }
}
