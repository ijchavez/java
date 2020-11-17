package Clase3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");

        int num = teclado.nextInt();
        mayorAVeinte((int) num);

    }
    public static void mayorAVeinte(int unNumero){

        if (unNumero>20){
            System.out.println("mayor a 20");

        } else{
            System.out.println("menor a 20");
        }
    }

}
