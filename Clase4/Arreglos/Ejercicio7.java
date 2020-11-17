package Clase4.Arreglos;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        boolean [] asientosLibres = new boolean[10];
        // no puedo poner asientosLibres[] = true tengo que hacer un for
        asientos(asientosLibres);

    }

    private static void asientos(boolean[] asiento){
        for (int i = 0; i < asiento.length;i++){
            asiento[i] = true;
            System.out.println(asiento[i]);

        }

    }
}
