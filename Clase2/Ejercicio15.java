package Clase2;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String args[]){

        int nota = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una nota");
        nota = input.nextInt();

        if ((nota < 0) || (nota > 100)){
            System.out.print("la nota es invalida");
        }
        if ((nota >= 0) && (nota <= 59)){
            System.out.print("la nota es Eliminado");
        }
        if ((nota >= 60) && (nota <= 79)){
            System.out.print("la nota es Aprobado");
        }
        if ((nota >= 80) && (nota <= 100)){
            System.out.print("la nota es Aprobado con excelente");
        }


    }



}
