package Clase4.Arreglos;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] valores = new int[5];

        ingresoValores(valores);


        //seEncuentra(valores); //pide un valor y no me retorna
        System.out.println(seEncuentra(valores)); //pide valores y me dice true/false

    }

    public static boolean seEncuentra(int[] arrEnteros) {
        Scanner input = new Scanner(System.in);
        int valor = 0;
        System.out.println("Ingrese un valor");
        valor = input.nextInt();
        for (int i = 0; i < arrEnteros.length; i++) {
            if (valor == arrEnteros[i]) {
                return true;

            }

        }
        return false; //me obliga a hacer el return de false
    }
    //VERIFICAR EN TODOS LOS LUGARES DONDE PUEDA APLICAR ESTOCl
    public static int [] ingresoValores(int [] arreglo){

        System.out.println("ingrese los valores");
        for (int i = 0; i < arreglo.length; i++) {
            Scanner input = new Scanner(System.in);
            int ingreso = 0;
            System.out.println("Ingrese numero ");

            ingreso = input.nextInt();
            arreglo[i] = ingreso;
        }
        return arreglo;

    }
}

