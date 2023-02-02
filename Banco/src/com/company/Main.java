package com.company;

import com.company.entities.Usuario;
import com.company.transactions.*;

public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Carlos","Basic");
        Transaccion transaccion = new ConsultaSaldo(usuario);
        transaccion.comprobarPermisos();
        transaccion = new Deposito(usuario);
        transaccion.comprobarPermisos();
        transaccion = new PagoServicios(usuario);
        transaccion.comprobarPermisos();
        transaccion = new RetiroEfectivo(usuario);
        transaccion.comprobarPermisos();
        transaccion = new Transferencia(usuario);
        transaccion.comprobarPermisos();
    }
}
