package com.company;

public class SerieDos extends Series{

    public SerieDos(Number valor) {
        super(valor);
    }

    @Override
    public void reiniciarSerie() {
        this.valor = 0;
    }

    @Override
    public Number setValorInicial(Number valorInicial) {
        return this.valor = valorInicial;
    }

    @Override
    public int siguienteValor() {
        this.valor = (Integer) this.valor + (Integer) 2;
        return (int) this.valor;
    }
}
