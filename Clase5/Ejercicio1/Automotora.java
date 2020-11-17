package Clase5.Ejercicio1;

import java.util.Scanner;


public class Automotora {
    //Crear una clase Automotora que contenga el main.
    public static void main(String [] args) {


        Scanner input = new Scanner(System.in);
        //Crear un camión utilizando cada uno de los constructores.
        Camion camion1 = new Camion();
        Camion camion2 = new Camion(2345);
        Camion camion3 = new Camion(3456, "Azul");
        Camion camion4 = new Camion();
        Camion camion5 = new Camion(9955, "Violeta", 2010);


        //Mostrar los datos en pantalla de cada camión
        System.out.println(camion1);
        System.out.println(camion2);
        System.out.println(camion3);

        //Pedir los datos de un camión al usuario
        System.out.println("ingrese los datos de un camion");

        System.out.println("Primero la chapa");
        int laChapa = input.nextInt();

        System.out.println("Ahora el color");
        String elColor = input.next();
        camion4.setChapa(laChapa);
        camion4.setColor(elColor);

        System.out.println("Se actualizaron los datos del camion");
        System.out.println(camion4);

        System.out.println("Ingrese año de compra");
        int elañoDeCompra = input.nextInt();
        camion1.setAñoCompra(elañoDeCompra);
        //Agregar un método a la clase Camión, llamado leTocaRevision que retorne true
        //si el año de compra es menor a 2015
        //Aca lo vuelvo a escribir para evaluar un camion en particular
        if (camion1.leTocaRevision() == true){
            System.out.println("Le toca revisión");

        }else{
            System.out.println("No le toca revisión");
        }
        if (camion5.leTocaRevision() == true){
            System.out.println("Le toca revisión");

        }else{
            System.out.println("No le toca revisión");
        }
        //Llamo al metodo para comparar, como hago para que lo haga sobre dos camiones que
        //yo le diga, es decir poder poner una variable q reemplace X.tieneMismoColor(y)
        if(camion4.tieneMismoColor(camion5) == true){
            System.out.println("Los camiones tienen el mismo color");

        }else{
            System.out.println("Los camiones tienen distinto color");
        }
    }



}
