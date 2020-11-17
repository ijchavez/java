package Clase4.Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
       int num = -1;

       System.out.println("ingrese números hasta ingresar un cero");
       while (num != 0){

           System.out.println("Ingrese un número");
           num = input.nextInt();
           if (num != 0) {
               listaEnteros.add(num);
           }

       }
       imprimirListaEnteros(listaEnteros);

    }
    public static void imprimirListaEnteros(ArrayList<Integer> lista ){
        for (int i = 0; i < lista.size(); i++){

            System.out.println("la posicion " + i + " contiene el numero: " + lista.get(i));
        }
    }
}
