package Clase4.Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio5 {
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
        if (listaVacia(enterosEnviados) == true){

            System.out.println("La lista está vacia");
        }else{

            System.out.println("La lista tiene valores");
        }
    }
    public static boolean listaVacia(ArrayList <Integer> enteros){
        if (enteros.isEmpty()){
            return true;
        }
        return false;
    }

}
