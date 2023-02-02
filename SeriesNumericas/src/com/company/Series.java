package com.company;

public abstract class Series<T extends Number> {
    protected T valor;

    public Series(T valor) {
        this.valor = valor;
    }

    public abstract int siguienteValor();
    public abstract T setValorInicial(T valorInicial);
    public abstract void reiniciarSerie();

    public T getValor() {
        return valor;
    }
}
