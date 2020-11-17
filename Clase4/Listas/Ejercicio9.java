package Clase4.Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();

        ingresoALista(listaDeNumeros);
        devuelveMayor(listaDeNumeros);

        System.out.println( "el mayor de los numeros ingresados es " + devuelveMayor(listaDeNumeros));


    }
    public static ArrayList<Integer> ingresoALista (ArrayList<Integer> Lista){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese numeros para saber el mayor finalice con 0");
        int num = -1;
        while (num != 0){
            System.out.println("Ingrese un número");
            num = input.nextInt();

            if (num != 0) {

                Lista.add(num);
            }

        }
        return Lista;
    }
    public static int devuelveMayor(ArrayList<Integer> arrNumeros){
        int nummay = 0;
        nummay = Integer.MIN_VALUE;

        for (int i = 0; i < arrNumeros.size(); i ++ ){
            if (arrNumeros.get(i) > nummay){
                nummay = arrNumeros.get(i);

            }

        }
        return nummay;
    }
}
