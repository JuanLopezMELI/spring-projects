package com.company.transactions;

import com.company.entities.Usuario;

public class Transferencia extends Transaccion{

    public Transferencia(Usuario usuario) {
        super(usuario.getTipoUsuario());
    }

    @Override
    public void comprobarPermisos(){
        if(this.transaccionOk()){
            System.out.println("Realizando transferencia");
        }else{
            System.out.println("No tiene permisos para realizar transferencia");
        }
    }

    @Override
    public boolean transaccionOk(){
        if(tipoUsuario.equals("Ejecutivo")){
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
