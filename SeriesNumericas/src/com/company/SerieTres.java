package com.company;

public class SerieTres extends Series{

    public SerieTres(Number valor) {
        super(valor);
    }

    @Override
    public void reiniciarSerie() {
        this.valor = valor;
    }

    @Override
    public Number setValorInicial(Number valorInicial) {
        return this.valor = valorInicial;
    }

    @Override
    public int siguienteValor() {
        this.valor = (Integer) this.valor + (Integer) 3;
        return (int) this.valor;
    }
}
