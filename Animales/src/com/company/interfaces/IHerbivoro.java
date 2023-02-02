package com.company.interfaces;

public interface IHerbivoro {
    default void comerHierba(){
        System.out.println("Que rica está esta hierba...");
    }
}
