package Clase5.Ejercicio4;

import java.util.Scanner;

public class Libreria {
    public static void main(String []args){

        Libro libro1 = new Libro();
        Libro libro2 = new Libro();

        System.out.println("*****NUEVO LIBRO A INGRESAR*****");
        ingresoLibro(libro1);
        System.out.println("*****NUEVO LIBRO A INGRESAR*****");
        ingresoLibro(libro2);

        System.out.println("**********");
        imprimoLibro(libro1);
        System.out.println("**********");
        imprimoLibro(libro2);

    }
    public static Libro ingresoLibro(Libro unLibro){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese ISBN");
        int unIsbn = input.nextInt();
        unLibro.setIsbn(unIsbn);

        System.out.println("Ingrese Titulo");
        String elTitulo = input.next();
        unLibro.setTitulo(elTitulo);

        System.out.println("Ingrese Autor");
        String elAutor = input.next();
        String elAutorD = "Desconocido";

        if (elAutor.equals(null) == true){
            unLibro.setAutor(elAutorD);
        }else{
            unLibro.setAutor(elAutor);
        }

        System.out.println("Ingrese Numero de Pagina");
        int unNroDePagina = input.nextInt();
        unLibro.setNroDePagina(unNroDePagina);

        return unLibro;

    }
    public static void imprimoLibro(Libro unLibro){
        System.out.println(unLibro);
    }

}
