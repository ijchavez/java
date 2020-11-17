package Clase2;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String args[]) {

        int num = 0;
        int suma = 0;
        double pro = 0;
        int i = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("ingrese un numero");
        num = input.nextInt();

        while (num > 0){
            suma = num + suma;
            System.out.println("ingrese un numero");
            num = input.nextInt();
            i = i + 1;
        }
        if (i != 0) {

            pro = (double) suma / i;
            System.out.println("la suma es de " + suma);
            System.out.println("la el promedio es de " + pro);

        }else{
            System.out.println("el promedio es cero");

        }

    }

}
