package com.company.transactions;

import com.company.entities.Usuario;

public class PagoServicios extends Transaccion{

    public PagoServicios(Usuario usuario){
        super(usuario.getTipoUsuario());
    }

    @Override
    public void comprobarPermisos(){
        if(this.transaccionOk()){
            System.out.println("Realizando pago de servicios");
        }else{
            System.out.println("No tiene permisos para realizar pago de servicios");
        }
    }

    @Override
    public boolean transaccionOk(){
        if(tipoUsuario.equals("Basic")){
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
