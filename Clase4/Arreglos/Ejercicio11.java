package Clase4.Arreglos;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int [] numEnteros = new int[5];

        ingresoValores(numEnteros);

        imprimirArregloEnteros(numEnteros);
    }

    public static void imprimirArregloEnteros(int arrEnt[]) {

        for (int i = 0; i < arrEnt.length; i++) {
            System.out.println("la posicion " + i + " tiene el número " + arrEnt[i]);
        }

    }
    public static int [] ingresoValores(int [] arreglo){
        System.out.println("ingrese los valores");
        for (int i = 0; i < arreglo.length; i++) {
            Scanner input = new Scanner(System.in);
            int ingreso = 0;
            System.out.println("Ingrese numero ");

            ingreso = input.nextInt();
            arreglo[i] = ingreso;
        }
        return arreglo;

    }
}