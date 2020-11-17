package Clase2;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main (String args[]){

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un numero");
        num1 = input.nextInt();

        System.out.println("ingrese un segundo numero");
        num2 = input.nextInt();

        System.out.println("ingrese un tercer numero");
        num3 = input.nextInt();

        if (num1 == num2 || num2 == num3 || num1 == num3) { /*el || funciona como or*/
            System.out.println("Hay numeros repetidos");

        } else {
            System.out.println(" No Hay numeros repetidos");
        }

    }

}
