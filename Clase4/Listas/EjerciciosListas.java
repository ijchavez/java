package Clase4.Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class EjerciciosListas {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        ArrayList<String> listaNombres = new ArrayList<>();

        if (listaNombres.isEmpty() == true) {
            System.out.println("La lista esta vacia");

        }else{
            System.out.println("La lista tiene elementos");
        }

        listaNombres.add("Juan");
        listaNombres.add("Ana");
        listaNombres.add("Andres");

        ImprimirListaString(listaNombres);

        System.out.println("ingrese una posibion a eliminar");
        int posicionAEliminar = input.nextInt();

        System.out.println("elminado elemento...");
        listaNombres.remove(posicionAEliminar);
        System.out.println("elminado");

        ImprimirListaString(listaNombres);

        //listaNombres.clear();
        //ImprimirListaString(listaNombres);

        System.out.println("ingrese nombre a buscar");
        String nombreABuscar = input.next();

        int posicion = listaNombres.indexOf(nombreABuscar);

        if (posicion == -1){
            System.out.println("no existe");
        }else{
            System.out.println(nombreABuscar + " se encuentra en la posicion " + posicion);
        }


    }

    public static void ImprimirListaString(ArrayList<String> lista){
        for (int pos = 0; pos < lista.size(); pos++){
            System.out.println(pos + " - " +  lista.get(pos));
        }
    }

    public static int sumarEnteros(ArrayList<Integer> listaNumeros){
        int suma = 0;
        for (int i = 0; i < listaNumeros.size(); i++){
            suma = suma + listaNumeros.get(i);

        }
        return suma;

    }

}
