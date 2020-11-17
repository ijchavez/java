package Clase3;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int ladoa = 0;
        int ladob = 0;
        int ladoc = 0;

        System.out.println("ingrese el primer lado del triangulo");
        ladoa = teclado.nextInt();
        System.out.println("ingrese el segundo lado del triangulo");
        ladob = teclado.nextInt();
        System.out.println("ingrese el teercer lado del triangulo");
        ladoc = teclado.nextInt();


        tipoTriangulo(ladoa,ladob,ladoc);


    }
        private static void tipoTriangulo(int num1, int num2, int num3){
            if (num1 == num2 && num2 == num3) {
                System.out.println("el triangulo es Equilatero");

            }else if (num1 != num2 && num2 != num3 && num1 != num3) {
                System.out.println("El triangulo es Escaleno");

            }else{
                System.out.println("el triangulo es Isoceles");

            }

        }
}
