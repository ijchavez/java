package Clase6;

import java.util.ArrayList;
import java.util.List;


public class Colegio {
    public static void main(String [] args){

        List<Persona> listaPersonas = new ArrayList<>();
        List<Estudiante> estudiantes = new ArrayList<>();

        //Tanto persona como alumno son personas por eso las declaro como Persona
        Persona profe1 = new Profesor("Juan", 123,"Quimica", 20000);
        Persona alumno1 = new Estudiante("Jose", 333, 7);
        Persona alumno2 = new Estudiante("Pedro", 3334, 8,401,true,"B2");

        /*
        System.out.println(profe1.getNombre());
        System.out.println(profe1.getDni());
        */
        listaPersonas.add(profe1);
        listaPersonas.add(alumno1);
        listaPersonas.add(alumno2);

        //Tengo que poner el tipo de persona que estoy agregando (Alumno) en este caso
        //la lista de alumnos acepta alumnos pero podria aceptar otro tipo y si lo hacemos podria dar error
        //ej listaPersonas.add((Alumno)profe1);

        //alumnos.add((Alumno) alumno1);

        for (Persona laLista: listaPersonas) {

            System.out.println(laLista);

        }

    }
}
