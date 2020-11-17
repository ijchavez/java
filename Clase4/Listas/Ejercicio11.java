package Clase4.Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
        int num = -1;

        System.out.println("ingrese números hasta ingresar -99");
        while (num != -99){

            System.out.println("Ingrese un número");
            num = input.nextInt();
            if (num != -99) {
                listaDeNumeros.add(num);
            }

        }

        devuelveLista(listaDeNumeros);
        System.out.println(devuelveLista(listaDeNumeros));
    }
    public static ArrayList <Integer> devuelveLista(ArrayList<Integer> listEnteros){
        int num = 0;

        for (int i = 0; i < listEnteros.size(); i++){
            num = listEnteros.get(i);
        }
        return listEnteros;
    }


}
