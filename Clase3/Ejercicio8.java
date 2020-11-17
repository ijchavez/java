package Clase3;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int num1 = 0;
        System.out.println("Ingrese un numero");
        num1 = teclado.nextInt();

        if (esPar(num1) == true) {
            System.out.println("el numero " + num1 + " es par");
        }else {
            System.out.println("el numero " + num1 + " es impar");
        }
    }
    public static boolean esPar(int nump) {
        if (nump % 2 == 0) {
            return true;

        } else {
            return false;

        }

    }
}
