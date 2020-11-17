package Clase4.Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
        int num = -1;

        System.out.println("Ingrese numeros para saber el menor finalice con 0");

        while (num != 0){
            System.out.println("Ingrese un número");
            num = input.nextInt();

            if (num != 0) {

                listaDeNumeros.add(num);
            }
        }


        devuelveMenor(listaDeNumeros);
        System.out.println( "el menor de los numeros ingresados es " + devuelveMenor(listaDeNumeros));


    }
    public static int devuelveMenor(ArrayList<Integer> arrNumeros){
        int nummen = 0;
        nummen = Integer.MAX_VALUE;

        for (int i = 0; i < arrNumeros.size(); i ++ ){
            if (arrNumeros.get(i) <  nummen){
                nummen = arrNumeros.get(i);

            }

        }
        return nummen;
    }
}
