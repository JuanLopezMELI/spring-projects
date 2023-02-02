package com.company;

public class Main {

    public static void main(String[] args) {
        Perro perro = new Perro("Cafe","Lucas",40);
        Gato gato = new Gato("Amarillo","Michi",5);
        Vaca vaca = new Vaca("Cafe","Lola",90);

        vaca.emitirSonido();
        vaca.comerHierba();
        gato.emitirSonido();
        gato.comerCarne();
        perro.emitirSonido();
        perro.comerCarne();
    }
}
