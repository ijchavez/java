package Clase4.Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList listaNombres = new ArrayList <String>();

        listaNombres.add("Juan");
        listaNombres.add("Pedro");
        listaNombres.add("Maria");
        listaNombres.add("Jose");


        String nombres = "";

        System.out.println("Ingrese nombres hasta ingresar salir");
        /*
        for (int i = 0; i < listaNombres.size(); i++){
            if (nombres != "salir"){
                nombres = input.next();
                listaNombres.add(nombres);

            }

        }
        */
        imprimirListaStrings(listaNombres);

    }
    public static void imprimirListaStrings(ArrayList<String> listaStr){

        for (int i = 0; i < listaStr.size(); i++){
            System.out.println("la posicion " + i + " contiene la palabra " + listaStr.get(i));
        }

    }

}
