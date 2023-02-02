package com.company.transactions;

import com.company.entities.Usuario;

public class RetiroEfectivo extends Transaccion{

    public RetiroEfectivo(Usuario usuario){
        super(usuario.getTipoUsuario());
    }

    @Override
    public void comprobarPermisos(){
        if(this.transaccionOk()){
            System.out.println("Realizando retiro en efectivo");
        }else{
            System.out.println("No tiene permisos para realizar retiro en efectivo");
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
