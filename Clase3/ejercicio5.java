package Clase3;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0;
        double num2 = 0;
        System.out.println("Ingrese un numero");
        num1 = teclado.nextInt();
        System.out.println("Ingrese otro numero");
        num2 = teclado.nextDouble();

        double producto = multiplicar(num1,num2);
        System.out.println("El prodducto es " + producto );
    }
    public static double multiplicar (int numu1, double numu2){
        double prod = 0;
        return prod = numu1 * numu2;

    }
}
