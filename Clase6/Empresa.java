package Clase6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
    public static void main(String[] args){

        List<Persona> listaPersonas = new ArrayList<>();
        /*
        Persona persona1 = new Persona("Jorge", 234511);
        Persona persona2 = new Persona("Andres", 444444);

        Persona persona3 = new Persona("Fabian", 4465744, 18);

        persona1.setEdad(33);

        listaPersonas.add(persona1);
        listaPersonas.add(persona2);

        System.out.println(listaPersonas);

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        */
        int opc = 0;
        Scanner input = new Scanner(System.in);

        while (opc != 3){

            System.out.println("Ingrese una opcion" + "\n" + "1- Agregar Persona" + "\n" + "2- Listar Personas " + "\n" + "3- Salir"   );
            opc = input.nextInt();

            if (opc == 1){

                Persona persona = agregarPersona();
                listaPersonas.add(persona);

                System.out.println("***** Se ha agregado una persona *****");

            }else if(opc == 2){

                imprimeListaPersonas(listaPersonas);

            }else if(opc == 3){
                System.out.println("***** Saliendo del programa... *****");
            }


        }

    }
    public static Persona agregarPersona(){
        Scanner input = new Scanner(System.in);

        System.out.println("***** Agregar Persona *****");

        System.out.println("***** Ingrese el nombre de la persona *****");
        String nombre = input.next();

        System.out.println("***** Ingrese el DNI de la persona *****");
        int dni = input.nextInt();

        System.out.println("***** Ingrese la edad de la persona *****");
        int edad = input.nextInt();

        //nombre y dni son obligatorios en base a los constructores armados por lo que pide el ejercicio
        Persona persona = new Persona(nombre, dni);
        persona.setEdad(edad);

        return persona;

    }
    public static void imprimeListaPersonas(List<Persona> unaLista){
        System.out.println("***** Lista de Persona *****");
        if (unaLista.isEmpty() == true){
            System.out.println("No hay personas ingresadas");

        }else{
            for (Persona pers : unaLista){
                System.out.println(pers);
            }
        }



    }
}
