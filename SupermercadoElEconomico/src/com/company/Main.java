package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

	    Cliente cliente1 = new Cliente("123","Juan","Lopez");
        Cliente cliente2 = new Cliente("456","Alberto","Casas");
        Cliente cliente3 = new Cliente("789","Manuel","Sanchez");

        List<Cliente> listaClientes = new ArrayList<Cliente>(List.of(cliente1,cliente2,cliente3));
        CRUDCliente crud = new CRUDCliente(listaClientes);

        for(Cliente cliente : listaClientes){
            System.out.println(cliente);
        }

        listaClientes.remove(1);

        for(Cliente cliente : listaClientes){
            System.out.println(cliente);
        }

        System.out.println("Por favor introduzca un dni");
        String dni = scan.nextLine();

        int indice = crud.buscarCliente(dni);

        if(indice != -1){
            System.out.println("Ingresa el producto");
            String nombre = scan.nextLine();
            System.out.println("Ingresa el codigo");
            int codigo = Integer.parseInt(scan.nextLine());
            System.out.println("Ingrese la cantidad comprada");
            int cantidad = Integer.parseInt(scan.nextLine());
            System.out.println("Ingrese el precio unitario");
            int precio = Integer.parseInt(scan.nextLine());
            Producto numero1 = new Producto(codigo,nombre,cantidad,precio);
            System.out.println(numero1);
        }else{

            System.out.println("Desea crear una nueva factura?");
            System.out.println("Yes or no (y o n)");
            String option = scan.next();

            if(option.equals("n")){
                System.out.println("Finalizado");
            }else{
                System.out.println("Ingresaras un nuevo cliente");
                System.out.println("Introduce el nombre");
                String nombre = scan.nextLine();
                System.out.println("Introduce el apellido");
                String apellido = scan.nextLine();
                System.out.println("Introduce el dni");
                String nuevoDni = scan.nextLine();
                System.out.println(crud.agregarCliente(new Cliente(nuevoDni,nombre,apellido)));
            }
        }


    }
}
