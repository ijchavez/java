package Clase4.Arreglos;

import java.util.Scanner;
//Ejercicio1
public class EjerciciosDeLaClase {
    public static void main(String args[]){

        int [] horas = new int [10];

        horas[2] = 5;
        horas[3] = 7;

        System.out.println(horas.length);
        System.out.println(horas[3]);

        for (int pos = 0; pos < horas.length; pos = pos + 1){

            System.out.println("la posicion " + pos + " vale " + (horas[pos]) ); //pos + " vale " horas[pos]
        }

    }

}
