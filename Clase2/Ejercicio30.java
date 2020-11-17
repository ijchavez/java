package Clase2;

import java.util.Scanner;

public class Ejercicio30 {

    public static void main(String args[]){

        int i = 10;
        while (i<= 100) {

            if (i % 9 == 0 && i % 2 == 1) {
                System.out.println(i);

            }
            i = i + 1;
        }
    }

}
