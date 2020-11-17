package Clase3;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int num = 0;

        System.out.println("Ingrese el valor el mínimo");
        min = teclado.nextInt();
        System.out.println("Ingrese el valor el máximo");
        max = teclado.nextInt();
        System.out.println("Ingrese el valor un número");
        num = teclado.nextInt();

        boolean rangook = estaEnRango(min,max,num);
        if (rangook == true) {
            System.out.println("esta en rango");
        }else{
            System.out.println("esta fuera de rango");
        }
    }

    public static boolean estaEnRango(int num1 , int num2, int num3){
        if (num3 >= num1 && num3 <= num2){
            return true;
        }else{
            return false;
        }
    }
}
