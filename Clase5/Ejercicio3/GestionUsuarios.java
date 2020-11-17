package Clase5.Ejercicio3;

import Clase5.Ejercicio2.Producto;

import java.util.Scanner;

//Crear una clase llamada GestionUsuarios que contenga el método main.
public class GestionUsuarios {
    public static void main(String[] args) {

        Persona pers1 = new Persona();
        Persona pers2 = new Persona();

        ingresoPersona(pers1);
        System.out.println("********");

        ingresoPersona(pers2);
        System.out.println("********");

        Persona.imprimirPersona(pers1);
        System.out.println("********");
        Persona.imprimirPersona(pers2);

    }

    public static Persona ingresoPersona(Persona unaPersona) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los datos");

        System.out.println("Primero el Nombre");
        String elNombre = input.next();
        unaPersona.setNombre(elNombre);

        System.out.println("ahora el Apellido");
        String elApellido = input.next();
        unaPersona.setApellido(elApellido);

        return unaPersona;
    }

}
