package com.company.transactions;

import com.company.entities.Usuario;

public class ConsultaSaldo extends Transaccion{

    public ConsultaSaldo(Usuario usuario){
        super(usuario.getTipoUsuario());
    }

    @Override
    public void comprobarPermisos(){
        if(this.transaccionOk()){
            System.out.println("Realizando consulta de saldo");
        }else{
            System.out.println("No tiene permisos para realizar consultar saldo");
        }
    }

    @Override
    public boolean transaccionOk(){
        if(tipoUsuario.equals("Basic") || tipoUsuario.equals("Cobrador")){
            return true;
        }else{
            return this.transaccionNoOk();
        }
    }

    @Override
    public boolean transaccionNoOk(){
        return false;
    }
}
