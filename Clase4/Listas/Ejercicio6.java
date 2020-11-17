package Clase4.Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
        int num = -1;

        System.out.println("ingrese números hasta ingresar un cero");
        while (num != 0){

            System.out.println("Ingrese un número");
            num = input.nextInt();
            if (num != 0) {
                listaDeNumeros.add(num);
            }

        }

        int sumaTotal = sumarEnteros(listaDeNumeros);
        System.out.println("la suma total es de" + sumaTotal);
        System.out.println("los numeros ingresados fueron: ");
        imprimirListaEnteros(listaDeNumeros);
    }

    public static void imprimirListaEnteros(ArrayList<Integer> listaNumeros){
        for (int i = 0; i < listaNumeros.size(); i++){
            System.out.println(listaNumeros.get(i));

        }

    }
    public static int sumarEnteros(ArrayList<Integer> listaNumeros){
        int suma = 0;
        for (int i = 0; i < listaNumeros.size(); i++){
            suma = suma + listaNumeros.get(i);

        }
        return suma;

    }
}
