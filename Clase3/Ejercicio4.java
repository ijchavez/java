package Clase3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("Ingrese un numero");
        num1 = teclado.nextInt();
        System.out.println("Ingrese otro numero");
        num2 = teclado.nextInt();

        float producto = sumar(num1,num2);
        System.out.println("El prodducto es " + producto );
    }
    public static float sumar (int numu1, int numu2){
        int prod = 0;
        return prod = numu1 + numu2;


    }

}
