package Clase3;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int edad = 0;
        System.out.println("ingrese su edad");
        edad = teclado.nextInt();

        boolean res;
        res = esMaayorDeEdad(edad);
        if (res) {
            System.out.println("Es mayor de edad");
        }

    }

    public static boolean esMaayorDeEdad(int num){

        if (num > 18){
            return true;
        }else{
            return false;
        }

    }

}
