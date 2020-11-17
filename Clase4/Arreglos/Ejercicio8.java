package Clase4.Arreglos;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];

        ingresoValores(numeros);
        clasificarNumeros(numeros);
        numerosPorPosicion(numeros);
    }
    public static void clasificarNumeros(int [] numeros){
        int qneg = 0;
        int qpos = 0;
        int qcero = 0;

        for (int i = 0; i < numeros.length ; i++){

            if (numeros[i] > 0){
                qpos = qpos + 1;

            }else if (numeros[i] < 0){
                qneg = qneg + 1;

            }else{
                qcero = qcero + 1;

            }


        }

        System.out.println("la cantidad de positivos es " +  qpos);
        System.out.println("la cantidad de negativos es " + qneg);
        System.out.println("la cantidad de ceros es " + qcero);
    }
    public static void numerosPorPosicion(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++){
            System.out.println("la posición " + i + " tiene el número " + arreglo[i]);
        }

    }
    public static int [] ingresoValores(int[] arreglo){
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
