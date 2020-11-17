package Clase2;

import java.util.Scanner;

public class Ejercicio5 {

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

        if (num1 == num2){
            System.out.println("Hay numeros repetidos");
        }
        if(num2 == num3){
            System.out.println("Hay numeros repetidos");
        }
        if (num1 == num3){
            System.out.println("Hay numeros repetidos");
        }

    }



}
