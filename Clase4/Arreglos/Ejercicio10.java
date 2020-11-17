package Clase4.Arreglos;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        Boolean[] boolArr = new Boolean[10];
        //como hago para mostrar la posicion?
        boolArr = arrBool(); // al array booleano le paso los valores asi
        recorroArreglo(boolArr); // con este metodo lo recorro
    }

    public static Boolean [] arrBool(){ //el arreglo boolean siempre ()
        Boolean [] Posicion = new Boolean[10];
        for (int i = 0; i < 10; i++){
            Posicion[i] = false;
        }
        return Posicion;

    }
    public static void recorroArreglo(Boolean [] arregloBooleano){
        for (int i = 0; i < arregloBooleano.length; i++){
            System.out.println("El contenido del arreglo es " + arregloBooleano[i]);
        }

    }
}
