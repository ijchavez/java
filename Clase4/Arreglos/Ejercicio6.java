package Clase4.Arreglos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        Integer [] arrAlea = new Integer[10];
        Random r = new Random();

        for (int i = 0; i < arrAlea.length; i++){
            // valores aleatorios entre 0 y 5
            arrAlea[i] = r.nextInt(6);

        }
        for (int i = 0; i < arrAlea.length; i++){
            System.out.println(arrAlea[i]);

        }

    }

}
