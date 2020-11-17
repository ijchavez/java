package Clase2;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String args[]){
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int suma = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("ingrese un numero");
        num1 = input.nextInt();
        System.out.println("ingrese un segundo numero");
        num2 = input.nextInt();
        System.out.println("ingrese un tercer numero");
        num3 = input.nextInt();
        System.out.println("ingrese un cuarto numero");
        num4 = input.nextInt();

        suma = (num1 + num2 + num3 + num4);
        if (suma < 0) {
            suma = suma * (-1);
        }

        System.out.println("la suma en valores absolutos es de " + suma);
    }
}


