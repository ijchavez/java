package Clase3;
import java.util.Scanner;

public class EjercicioMetodo {
    public static void main(String args[]){

        System.out.println("este es el metodo main");
        mostrarBienvenida();
        Scanner teclado = new Scanner(System.in);
        int numeroDelUsuario = teclado.nextInt();

        float doble = calcularDoble(numeroDelUsuario);
        System.out.println("el doble es " + doble);
        System.out.println("Fin");


    }

    //retorno entero
    //calcularDoble >> Nombre del metodo
    //int num >> es el parametro
    public static int calcularDoble(int unNumero){
        return (int) unNumero * 2;
    }

    public static int sumar(int num1, int num2, int num3) {
        int suma = 0;
        return suma = num1 + num2 + num3;

    }

    public static void mostrarBienvenida(){
        System.out.println("bienvenidos al programa");
    }

}
