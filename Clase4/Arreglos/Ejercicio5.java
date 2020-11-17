package Clase4.Arreglos;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        Integer [] arreNum = new Integer[100];
        int num = 1; //porque me pide del 1 al 100 pero el arreglo es de 0 a 99
        int suma = 0;
        float pro = 0;

        for (int i = 0; i < arreNum.length;i++){
            arreNum[i] = num;
            num = num + 1;

        }

        for (int i = 0; i < arreNum.length; i++){
            suma = suma + arreNum[i];

        }
        pro = suma / arreNum.length;

        System.out.println(suma);
        System.out.println(pro);

    }
}
