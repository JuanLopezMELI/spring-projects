package com.company;

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Lucas",12,"1234");
        Persona persona3 = new Persona("Lucas",12,"12345",72.0,1.79);

        int imc = persona3.calcularIMC();
        if (imc == -1){
            System.out.println("Estas bajo de peso");
        }else if(imc == 0){
            System.out.println("Tienes un peso normal");
        }else{
            System.out.println("Tienes sobre peso");
        }

        if(persona3.esMayorDeEdad()){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("No eres mayor de edad");
        }
        System.out.println(persona3.toString());
    }
}
