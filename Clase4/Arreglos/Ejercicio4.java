package Clase4.Arreglos;



import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        // yo lo hice con minusculas boolean como es?
        // como hago para pedirle al usuario que cargue los true false en el booleano?
        //Boolean [] arrBool = new Boolean[9];
        Boolean [] arrBool = new Boolean[9];
        /*
        for (int i = 0; i < arrBool.length; i++){
            String ingreso;
            System.out.println("ingrese true or false");
            ingreso = input.next();
            if (ingreso.equals("t") == true){
                arrBool[i] = true;

            }else if (ingreso == "f"){
                arrBool[i] = false;
            }
        }
        */
        arrBool = pidoIngreso();
        imprimeBool(arrBool);
        recorroArreglo(arrBool);
    }

    public static void imprimeBool(Boolean arBo[]){
        for (int i = 0; i < arBo.length; i++){
            System.out.println(arBo[i]);
        }

    }
    public static void recorroArreglo(Boolean [] arregloBooleano){
        for (int i = 0; i < arregloBooleano.length; i++){
            System.out.println("El contenido del arreglo es " + arregloBooleano[i]);
        }

    }
    public static Boolean[] pidoIngreso(){
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
