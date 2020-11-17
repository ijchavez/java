package Clase4.Arreglos;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        float [] sueldosTotales = new float[5];

        ingresoValores(sueldosTotales);

        muestroArregloFloat(sueldosTotales);


    }

    private static void muestroArregloFloat(float [] arrFloat ){
        float suma = 0;
        float pro = 0;
        for (int i = 0; i < arrFloat.length; i++){
            System.out.println("la posicion " + i + " contiene este valor: $" + arrFloat[i]);
            suma = suma + arrFloat[i];


        }
        pro = suma / arrFloat.length; //El promedio siempre afuera
        System.out.println("La  suma es $" + suma);
        //System.out.println("El  promedio es es $" + pro);

    }
    public static float [] ingresoValores(float [] arreglo){
        System.out.println("ingrese los valores");
        for (int i = 0; i < arreglo.length; i++) {
            Scanner input = new Scanner(System.in);
            int ingreso = 0;
            System.out.println("Ingrese Sueldo ");

            ingreso = input.nextInt();
            arreglo[i] = ingreso;
        }
        return arreglo;

    }
}
