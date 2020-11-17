package Clase6.ListasDeObjetos;

import Clase6.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[]args){

        List<Persona> listaPersonas = new ArrayList<>();


        int opc = 0;
        ingresoOpcion(opc);


        }

        public static int ingresoOpcion(int unaOpc){

            Scanner input = new Scanner(System.in);
            //TENGO QUE CREAR UNA LISTA DONDE SE INGRESEN LOS VALORES PARA LOS METODOS INGRESO Y IMPRIMO

            List<Persona> unaListaPersona = new ArrayList<>();
            unaOpc = 0;

            while (unaOpc != 3){

                System.out.println("Ingrese una opcion" + "\n" + "1- Agregar Persona" + "\n" + "2- Listar Personas " + "\n" + "3- Salir"   );
                unaOpc = input.nextInt();

                if (unaOpc == 1) {

                    ingresoPersona(unaListaPersona);

                }else if(unaOpc == 2){

                    imprimoPersona(unaListaPersona);

                }else if (unaOpc == 3){
                    System.out.println("SALIENDO DEL PROGRAMA");

                }


            }

            return unaOpc;

        }
        //SI LO HAGO DE ESTA MANERA NO DEFINO UNA VARIABLE EN LA OPCION 2 SINO QUE LE MANDO LA LISTA ORIGINAL
        //LUEGO CUANDO HAGO UN METODO PARA IMPRIMIR (OPCION 2) HAGO UN VOID Y LE PASO POR PARAMETRO UNA LISTA, LUEGO HAGO
        // EN EL MAIN elMetodo(laListaOriginal) ejemplo practico imprimoPersona(listaPersonas);

        public static List<Persona> ingresoPersona(List<Persona> unaListaPersona){

            Scanner input = new Scanner(System.in);
            System.out.println("***** AGREGAR PERSONAS *****");

            System.out.println("***** Ingrese el nombre de la persona *****");
            String nombre = input.next();

            System.out.println("***** Ingrese el DNI de la persona *****");
            int dni = input.nextInt();

            System.out.println("***** Ingrese la edad de la persona *****");
            int edad = input.nextInt();

            Persona persona = new Persona(nombre, dni);
            persona.setEdad(edad);

            unaListaPersona.add(persona);

            return unaListaPersona;

        }

        public static void imprimoPersona(List<Persona> unaLista) {
            System.out.println("***** LISTAR PERSONAS *****");


            if (unaLista.isEmpty() == true) {
                System.out.println("No hay personas ingresadas");

            } else {
                for (Persona pers : unaLista) {
                    System.out.println(pers);
                }

            }

        }

}



