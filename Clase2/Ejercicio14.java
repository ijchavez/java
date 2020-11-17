package Clase2;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String args[]){

        int num = 0;
        int suma = 0;
        int i = 0;
        float pro = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("ingrese un numero");
        num = input.nextInt();

        while (num != 0){
            suma = suma + num;
            i= i + 1;
            System.out.println("ingrese un numero");
            num = input.nextInt();

        }

        System.out.println("La suma es de " + suma);
        pro = suma/i;
        if (i > 0) {
            System.out.println("El promedio de " + pro);
        }else{
            System.out.println("El promedio es cero");
        }


    }

}