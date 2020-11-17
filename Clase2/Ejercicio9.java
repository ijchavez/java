package Clase2;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String args[]) {
        int num = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un numero");
        num = input.nextInt();

        for (int i = 1 ; i <= num; i = i + 1) {

            System.out.println(i);

        }

    }
}
