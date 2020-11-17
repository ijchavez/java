package Clase3;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int num = 0;

        System.out.println("Ingrese un número");
        num = teclado.nextInt();

        int sumatoria = 0;
        sumatoria = sumatoriaPares(num);
        System.out.println("la sumatoria de numeros pares dado el nùmero " + num + " es de " + sumatoria);

    }
    public static int sumatoriaPares(int num){
        int i = 0;
        int sumar = 0;

        for (i = 1;i <= num;i = i + 1){
           if (i % 2 == 0){
               sumar = sumar + i;
           }

        }
        return sumar;
    }

}
