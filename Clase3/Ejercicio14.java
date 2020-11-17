package Clase3;
import java.util.Scanner;

public class Ejercicio14 {
    private static final float MILLAS = (float) 1.60934;
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        float km = 0;

        System.out.println("Ingrese el valor en km");
        km = teclado.nextFloat();

        float resultado = 0;
        resultado = convertirAMillas(km);
        System.out.println(km + "km es igual a " + resultado + " millas");


    }

    public static float convertirAMillas(float num){
        float resultado = 0;
        resultado = num / MILLAS;
        return resultado;

    }
}
