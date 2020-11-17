package Clase3;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String args[]) {

    Scanner teclado = new Scanner(System.in);

    int num = 0;

    System.out.println("ingrese un numero para obtener su absoluto");
    num = teclado.nextInt();

    int abs = 0;
    abs = valorAbsoluto(num);
    System.out.println("el valor absoulto de " + num + " es: " +  abs);


    }
    public static int valorAbsoluto(int numero){
        if (numero < 0){
            numero = numero *(-1);

        }else{
            numero = numero;
        }
        return numero;
    }


}
