package Clase4.Arreglos;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int num = 0;

        System.out.println("Ingrese el tamaño del array");
        num = input.nextInt();

        Integer [] enterosArr = new Integer[num];

        System.out.println("el tamaño del array es de " + devuelveElementos(enterosArr));
    }
    public static int devuelveElementos(Integer CantElementos[]){

        return CantElementos.length;

    }




}

