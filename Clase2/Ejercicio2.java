package Clase2;

import java.util.Scanner;

public class Ejercicio2 {

        public static void main (String args[]){

              int anio = 0;

              Scanner input = new Scanner(System.in);

              System.out.println("ingrese Su año de nacimiento");
              anio = input.nextInt();

              int edad = 2020 - anio;
              System.out.println("Su edad es " + edad);
        }
}
