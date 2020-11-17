package Clase2;

import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String args[]){
        int i = 0;
        int mul3 = 0;
        for (i = 10 ; i <= 70; i = i + 1) {
            if (i % 3 == 0) {
                mul3 = mul3 + 1;
            }

        }
        System.out.println(mul3);
    }


}
