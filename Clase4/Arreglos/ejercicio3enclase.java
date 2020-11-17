package Clase4.Arreglos;

import java.util.Scanner;

public class ejercicio3enclase {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        String [] producto = new String[3];
        boolean[] estaVendido = new boolean[3];
        int [] precioProducto = new int[3];
        // azucar harina aceite
        // true   false  true
        // 40     35     80
        producto [0] = "Azucar";
        producto [1] = "Harina";
        producto [2] = "Aceite";

        estaVendido[0]  = false;
        estaVendido[1]  = true;
        estaVendido[2]  = false;

        precioProducto[0] = 40;
        precioProducto[1] = 35;
        precioProducto[2] = 80;

        for (int i = 0; i < producto.length; i++) {
            if (estaVendido[i] == false){
                System.out.println("Producto " + producto[i] + " vale $" + precioProducto[i]);
            } else {
                System.out.println(producto[i] + " Sin stock");

            }
        }
        //almacenar lo vendido desde las 0 a las 8hs)

        int [] ventas = new int[4];

        System.out.println("Ingrese la cantidad de articulos que posee ");

        int cantidadArticulos = input.nextInt(); //le indico al usuario que indique el tamaño del array
        int [] stockDiario = new int[cantidadArticulos];
        stockDiario[0] = 1000;
        stockDiario[1] = 960;
        stockDiario[2] = 800;

        int ventaPorHora = 0;

        for (int i = 0; i < ventas.length; i++ ){

            System.out.println("ingrese lo vendido a la hora " + i);

            ventaPorHora = input.nextInt();
            ventas[i] = ventaPorHora;

        }
        int ventaTotal = 0;


        System.out.println("***** VENTAS *****");
        imprimirArregloEnteros(ventas, "Las ventas fueron $");

        System.out.println("***** STOCK *****");
        imprimirArregloEnteros(stockDiario, "el stock es de ");

        /*for (int i = 0; i < ventas.length; i++){

            System.out.println("Se vendio a la hora " + i + ": $" + ventas[i]);
            ventaTotal = ventaTotal + ventas[i];

        }*/

        //System.out.println("El total vendido fue: $" + ventaTotal);

    }

    public static void imprimirArregloEnteros(int arr[]){

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
    public static void imprimirArregloEnteros(int arr[], String mensaje){

        for (int i = 0; i < arr.length; i++){
            System.out.println(mensaje + arr[i]);


        }

    }

}




