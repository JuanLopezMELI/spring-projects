package com.company.transactions;


public abstract class Transaccion {

    protected String tipoUsuario;

    public Transaccion(String tipoUsuario){
        this.tipoUsuario = tipoUsuario;
    }

    public abstract void comprobarPermisos();
    public abstract boolean transaccionOk();
    public abstract boolean transaccionNoOk();
}
