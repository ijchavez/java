package Clase2;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String args[]) {
        int num1 = 0;
        int num2 = 0;
        int numm = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un numero");
        num1 = input.nextInt();
        System.out.println("ingrese un numero");
        num2 = input.nextInt();

        if (num1 < num2) {

            for (numm = num1; numm <= num2; numm = numm + 1) {

                System.out.println(numm);

            }

        }else{

            for (numm = num2; numm <= num1; numm = numm + 1){

                System.out.println(numm);

            }
        }

    }
}