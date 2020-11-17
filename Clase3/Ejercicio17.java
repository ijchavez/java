package Clase3;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main (String args[]){

        Scanner teclado = new Scanner(System.in);
        int num = 0;

        System.out.println("ingrese un numero para obtener su factorial");
        num = teclado.nextInt();

        int facto = 0;
        facto = factorial(num);
        System.out.println("el resultado del factorial del numero " + num + " es de " + facto);


    }
    private static int factorial(int numero){
        int acumula = 1; //en multiplicacion siempre tiene que ser 1 porque si la inicio en 0, 0 * X = 0
        int i = 0;

        for (i = 1; i <= numero;i = i + 1){
            acumula = acumula * i;
        }
        return acumula;

    }
}
