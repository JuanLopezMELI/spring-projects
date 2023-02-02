package com.company.interfaces;

public interface ICarnivoro {
    default void comerCarne(){
        System.out.println("Comiendo carne...");
    }
}
