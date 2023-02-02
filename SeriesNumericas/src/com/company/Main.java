package com.company;

public class Main {

    public static void main(String[] args) {
	    SerieDos serie = new SerieDos(2);
        System.out.println(serie.siguienteValor());
        System.out.println(serie.siguienteValor());
        System.out.println(serie.siguienteValor());
        System.out.println(serie.siguienteValor());
        System.out.println(serie.siguienteValor());
        System.out.println(serie.siguienteValor());
        serie.reiniciarSerie();
        System.out.println(serie.siguienteValor());
        System.out.println(serie.siguienteValor());
        System.out.println(serie.siguienteValor());
        System.out.println(serie.siguienteValor());
        serie.setValorInicial(2);
        System.out.println(serie.siguienteValor());
        System.out.println(serie.siguienteValor());
        System.out.println(serie.siguienteValor());
        System.out.println(serie.siguienteValor());
    }
}
