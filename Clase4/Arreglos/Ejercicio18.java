package Clase4.Arreglos;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        boolean [] bool = new boolean[10];

        bool = pidoIngreso();
        System.out.println(hayVacantes(bool));

    }

    public static boolean hayVacantes(boolean arrBool[]){
        for (int i = 0; i < arrBool.length; i++){
            if (arrBool[i] == true){
                return true;
            }

        }
        return false;
    }
    public static boolean[] pidoIngreso(){
        boolean [] arreglobool = new boolean[10];
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
