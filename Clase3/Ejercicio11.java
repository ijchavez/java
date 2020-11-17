package Clase3;
import java.util.Scanner;
/*doy un valor y devuelvo 2*/

public class Ejercicio11 {
    public static final float DOLAR = 42;
    public static final float EURO = 50;

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float pesos = 0;
        System.out.println("Ingrese el valor en pesos");
        pesos = teclado.nextFloat();
        convEuroDolar(pesos);
        /*
        float conversor = convEuroDolar(pesos);
        System.out.println(conversor);
        */

    }
    public static void convEuroDolar(float num){
        float dol = num / DOLAR;
        float eur = num / EURO;

        System.out.println(dol);
        System.out.println(eur);

    }
    /*public static float convEuroDolar(float num){
        float dol = 0;
        dol = (num / DOLAR);
        return dol;

        float eur = 0;
        eur = (num / EURO);
        return eur;

     }

     */
}
