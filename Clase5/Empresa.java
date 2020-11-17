package Clase5;

import java.util.Scanner;

public class Empresa {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        Cliente cliente1 = new Cliente("Maria", 33);
        Cliente cliente2 = new Cliente("Juan", 22);
        Cliente cliente3 = new Cliente("Gato", 101);
        Cliente cliente4 = new Cliente("Pichila", 99);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

        System.out.println("Ingrese un nombre");
        String unNombre = input.next();
        cliente1.setNombre(unNombre);
        System.out.println("Ingrese su edad");
        int unaEdad = input.nextInt();
        cliente1.setEdad(unaEdad);

        System.out.println(cliente1);
    }

}



