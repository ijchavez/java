package Clase3;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Ingrese un numero");
        num1 = teclado.nextInt();
        System.out.println("Ingrese otro numero");
        num2 = teclado.nextInt();

        if(esMayor(num1,num2) ==true ){
            System.out.println(num1 + " es mayor a " + num2);
        }else{
            System.out.println(num2 + " es mayor a " + num1);
        }

    }

    public static boolean esMayor(int nump1, int nump2) {
        if (nump1 > nump2){
            return true;
        }else {
            return false;
        }

    }

}
