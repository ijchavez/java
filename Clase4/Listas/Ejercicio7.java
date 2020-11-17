package Clase4.Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
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

        float promedio = promedioEnteros(listaDeNumeros);
        System.out.println("el promedio es de " + promedio);
        System.out.println("los numeros ingresados fueron: ");
        imprimirListaEnteros(listaDeNumeros);
    }

    public static void imprimirListaEnteros(ArrayList<Integer> listaNumeros){
        for (int i = 0; i < listaNumeros.size(); i++){
            System.out.println(listaNumeros.get(i));

        }

    }
    public static float promedioEnteros(ArrayList<Integer> listaNumeros){
        int suma = 0;
        float promedio = 0;
        for (int i = 0; i < listaNumeros.size(); i++){
            suma = suma + listaNumeros.get(i);
            promedio = suma/ listaNumeros.size();
        }
        return promedio;

    }
}
