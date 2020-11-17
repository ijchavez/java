package Clase3;

import java.util.Scanner;

public class Ejercicio12 {
    public static final int IVA = 22;
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        float basico = 0;

        System.out.println("Ingrese el valor en pesos");
        basico = teclado.nextFloat();

        float iva = 0;
        iva = calcularIva(basico);

        System.out.println("el IVA segun un sueldo de " + basico + " es de " + iva );

    }

    public static float calcularIva(float num){
        float sueldo = 0;
        sueldo = num * ((float)IVA / 100); //solucion a la que llegue formatear xq IVA es int
        //sueldo = (num * IVA) / 100; solucion propuesta
        return sueldo;
    }
}
