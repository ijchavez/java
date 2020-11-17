package Clase3;
import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String args[]) {

    Scanner teclado = new Scanner(System.in);

    int num1 = 0;
    int num2 = 0;

    System.out.println("ingrese un numero");
    num1 = teclado.nextInt();
    System.out.println("ingrese otro numero");
    num2 = teclado.nextInt();

    boolean res;
    res = unoMayorADos(num1, num2);
    if (res){
        System.out.println("el numero " + num1 + " es mayor al numero " + num2);
    }else{
        System.out.println("el numero " + num2 + " es mayor al numero " + num1);
    }


    }
    public static boolean unoMayorADos(int nu1, int nu2){

        if (nu1>nu2){
            return true;
        }else{
            return false;

        }

    }

}


