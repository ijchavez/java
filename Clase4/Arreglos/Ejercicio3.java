package Clase4.Arreglos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        //Double [] arrDou = new Double[16];

        double [] arrDou = new double[16];
        double num = 0;
        System.out.println("ingrese numeros");

        //aca tambien lo hice en minusculas

        for (int i = 0; i < arrDou.length; i++){

            num = input.nextDouble();
            arrDou[i] = num;

        }

        imprimeNumeros(arrDou);

    }
    public static void imprimeNumeros(double numeros[]){
        for (int i = 0; i < numeros.length; i++){
            System.out.println("la posicion " + i + " tiene el numero " + numeros[i]);

        }

    }


}
