package Clase4.Arreglos;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int [] ingresoNumeros = new int[5];
        int num = 0;

        ingresoValores(ingresoNumeros);
        devuelveMayor(ingresoNumeros);

    }
    public static void devuelveMayor(int arreglo[]) {
        int nummay = 0;
        nummay = arreglo[0];

        for (int i = 0; i < arreglo.length; i ++ ){
            if (arreglo[i] >  nummay){
                nummay = arreglo[i];

            }

        }
        System.out.println("el numero mayor es " + nummay);
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



