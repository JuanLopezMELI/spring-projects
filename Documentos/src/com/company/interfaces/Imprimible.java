package com.company.interfaces;

public interface Imprimible {
    default void imprimir(){
        System.out.println(this.toString());
    }
}
