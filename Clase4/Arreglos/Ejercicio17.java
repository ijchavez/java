package Clase4.Arreglos;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [] ingresoNumeros = new int[5];
        int num = 0;

        ingresoValores(ingresoNumeros);
        devuelveMenor(ingresoNumeros);

    }
    public static void devuelveMenor(int arrglo[]) {
        int nummen = 0;
        nummen = arrglo[0];

        for (int i = 0; i < arrglo.length; i ++ ){
            if (arrglo[i] <  nummen ){
                nummen = arrglo[i];

            }

        }
        System.out.println("el numero menor es " + nummen);

    }
    public static int [] ingresoValores(int [] arreglo) {
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


