package Clase4.Listas;


import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> enterosEnviados = new ArrayList<Integer>();

        int num = -1;

        System.out.println("ingrese números hasta ingresar un cero");
        while (num != 0){

            System.out.println("Ingrese un número");
            num = input.nextInt();
            if (num != 0) {
                enterosEnviados.add(num);
            }

        }
        System.out.println("la cantidad de enteros de la lista es de " + cantEnterosRecibidos(enterosEnviados));

    }

    public static int cantEnterosRecibidos(ArrayList <Integer> enteros){

         return enteros.size();

    }
}
