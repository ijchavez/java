package Clase4.Arreglos;

import java.util.Scanner;

public class Ejercicio4enclase {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        String [] producto = new String[3];
        boolean [] estaVendido = new boolean[3];
        int [] precioProducto = new int[3];

        precioProducto[0]= 14;
        precioProducto[1]= 12;
        precioProducto[2]= 31;

        producto[0] = "Azucar";
        producto[1] = "Harina";
        producto[2] = "Aceite";

        estaVendido[0] = true;
        estaVendido[1] = false;
        estaVendido[2] = false;

        for (int i = 0; i < producto.length; i = i + 1){
            if (estaVendido[i] == false){
                System.out.println("Producto " + producto[i] + " vale " +  precioProducto[i]);

            }else{
                System.out.println("Producto " + producto[i] + " sin stock");

            }

        }


    }

}
