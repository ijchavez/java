package Clase5.Ejercicio2;
//Se debe crear una clase llamada GestionarProductos que permita crear 3
//productos

import java.util.Scanner;

public class GestionarProductos {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        Producto proda = new Producto("Fideos",501,true,"AHX0331");
        Producto prodb = new Producto("Arroz", 320);
        Producto prodc = new Producto("Chauchas",false,"BXF4301");
        Producto prodd = new Producto();
        Producto prode = new Producto();
        Producto prodf = new Producto();

        System.out.println("*****NUEVO PRODUCTO A INGRESAR*****");
        ingresoProductos(prodd);
        System.out.println("*****NUEVO PRODUCTO A INGRESAR*****");
        ingresoProductos(prode);
        System.out.println("*****NUEVO PRODUCTO A INGRESAR*****");
        ingresoProductos(prodf);


        imprimoProd(proda);
        System.out.println("***********");

        imprimoProd(prodb);
        System.out.println("***********");
        imprimoProd(prodc);
        System.out.println("***********");
        imprimoProd(prodd);
        System.out.println("***********");
        imprimoProd(prode);
        System.out.println("***********");
        imprimoProd(prodf);

    }
    public static Producto ingresoProductos(Producto unProd){
        Scanner input = new Scanner(System.in);
        System.out.println("Primero el nombre");
        String elNombre = input.next();
        unProd.setNombre(elNombre);

        System.out.println("Ahora el codigo");
        int elCod  = input.nextInt();
        unProd.setCodigo(elCod);

        System.out.println("si es importado I, si es nacional N");
        String EsIoN = input.next();
        boolean esImportado;
        if (EsIoN.equals("I") == true){
            esImportado = true;
            unProd.setImportado(esImportado);

        }else if (EsIoN.equals("N") == true){
            esImportado = false;
            unProd.setImportado(esImportado);
        }

        System.out.println("Ingrese un lote");
        String unNumeroDeLote = input.next();
        unProd.setNroLote(unNumeroDeLote);

        return unProd;
    }
    public static void imprimoProd(Producto unProd){
        System.out.println(unProd);
    }
}
