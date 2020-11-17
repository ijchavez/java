package Clase2;

import java.util.Scanner;

public class ejercicio13 {

    public static void main(String args[]){

        int num = 0;
        int suma = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("ingrese un numero");
        num = input.nextInt();

        while (num != 0){
            System.out.println("ingrese un numero");
            num = input.nextInt();
            suma = suma + num;

        }

        System.out.println("La suma es de " + suma);




    }

}
