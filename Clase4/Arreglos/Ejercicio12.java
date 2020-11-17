package Clase4.Arreglos;



import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Boolean [] arrBooleano = new Boolean[10];

        arrBooleano= pidoIngreso();
        imprimirArreglo(arrBooleano);

    }
    private static void imprimirArreglo(Boolean[] arrBoo){
        for (int i = 0; i < arrBoo.length; i++){
            System.out.println("la posicion " + i + " es " + arrBoo[i]);

        }

    }
    public static Boolean [] pidoIngreso(){
        Boolean [] arreglobool = new Boolean[10];
        for (int i = 0; i <  10; i++){
            Scanner input = new Scanner(System.in);
            String ingreso;
            System.out.println("ingrese True(t) or False (f)");
            ingreso = input.next();
            if (ingreso.equals("t") == true){
                arreglobool[i] = true;

            }else if (ingreso.equals("f")== true){
                arreglobool[i] = false;
            }

        }
        return arreglobool;
    }
}
