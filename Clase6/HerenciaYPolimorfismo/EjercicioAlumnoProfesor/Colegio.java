package Clase6.HerenciaYPolimorfismo.EjercicioAlumnoProfesor;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Colegio {
    public static void main(String[] args){

        List<Persona> listaPersonas = new ArrayList<>();

        /*
        Persona profe1 =  new Profesor("Juan", 123, "Quimica", 24000);
        Persona alumno1 = new Alumno ("Jose", 333, 7,665,"A2",true);
        Persona alumno2 = new Alumno ("Pedro", 3334, 8,401,"B2",true);


        listaPersonas.add(profe1);
        listaPersonas.add(alumno1);
        listaPersonas.add(alumno2);
        */

        int opc = 0;
        ingresoOpcion(opc);

    }
    public static int ingresoOpcion(int unaOpc){

        Scanner input = new Scanner(System.in);
        //TENGO QUE CREAR UNA LISTA DONDE SE INGRESEN LOS VALORES PARA LOS METODOS INGRESO Y IMPRIMO

        List<Persona> unaListaPersona = new ArrayList<>();
        unaOpc = 0;

        while (unaOpc != 4){

            System.out.println("Ingrese una opcion" + "\n" + "1- Agregar Alumno" + "\n" + "2- Agregar Profesor " + "\n" + "3- Listar" + "\n" + "4- Salir");
            unaOpc = input.nextInt();

            if (unaOpc == 1) {

                ingresoAlumno(unaListaPersona);

            }else if(unaOpc == 2){

                ingresoProfesor(unaListaPersona);


            }else if (unaOpc == 3){

                imprimoPersona(unaListaPersona);

            }else if (unaOpc == 4) {

                System.out.println("SALIENDO DEL PROGRAMA");

            }

        }

        return unaOpc;

    }

    public static void imprimoPersona(List<Persona> laLista){
        for (Persona unaLista: laLista) {

            System.out.println(laLista);
            System.out.println("**********");

        }
    }
    public static List<Persona> ingresoAlumno(List<Persona> unaListaPersona) {

        Scanner input = new Scanner(System.in);
        System.out.println("***** AGREGAR ALUMNOS *****");

        System.out.println("***** Ingrese el nombre de la persona *****");
        String nombre = input.next();

        System.out.println("***** Ingrese el DNI de la persona *****");
        int dni = input.nextInt();

        System.out.println("***** Ingrese la edad de la persona *****");
        int edad = input.nextInt();

        System.out.println("***** Ingrese el promedio de la persona *****");
        float promedio = input.nextFloat();

        System.out.println("***** Ingrese el numero de estudiante de la persona *****");
        int nroEstudiante = input.nextInt();

        System.out.println("***** Ingrese el grupo de la persona *****");
        String unGrupo = input.next();


        System.out.println("***** Ingrese S si tiene previas N si no tiene previas");
        String esSoN = "";
        boolean conPrevias = true;
        esSoN = input.next();
        if (esSoN.equals("S") == true){
            conPrevias = true;

        }else {

            conPrevias = false;

        }


        Persona alumno = new Alumno(nombre, dni,promedio,nroEstudiante,unGrupo,conPrevias);
        unaListaPersona.add(alumno);

        return unaListaPersona;
    }
    public static List<Persona> ingresoProfesor(List<Persona> unaListaPersona){
        Scanner input = new Scanner(System.in);
        System.out.println("***** AGREGAR PROFESOR *****");

        System.out.println("***** Ingrese el nombre de la persona *****");
        String nombre = input.next();

        System.out.println("***** Ingrese el DNI de la persona *****");
        int dni = input.nextInt();

        System.out.println("***** Ingrese la edad de la persona *****");
        int edad = input.nextInt();

        System.out.println("***** Ingrese materia de la persona *****");
        String materia = input.next();

        System.out.println("***** Ingrese el salario de la persona *****");
        float salario = input.nextFloat();

        Persona profesor = new Profesor(nombre,dni,materia,salario);
        unaListaPersona.add(profesor);

        return unaListaPersona;

    }

}
