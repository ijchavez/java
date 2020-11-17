package Clase4.Arreglos;


import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int horas[] = new int[6];

        for (int i = 0; i < horas.length; i++) {
            System.out.println("ingrese un numero");
            int num = input.nextInt();
            horas[i] = num;

        }

        imprimeHs(horas);

    }

    public static void imprimeHs(int arrHs[]){
        for (int i = 0; i < arrHs.length; i++) {
            System.out.println(arrHs[i]);

        }

    }
}
