package Clase6;

import java.awt.event.PaintEvent;

public class Profesor extends Persona {
    private String materia;
    private float salario;

    public Profesor(String unNombre, int unDni, String unaMateria, float unSalario){
        //llamo al constructor de la clase padre haciendo super(parametros necesarios)

        super(unNombre,unDni);
        this.materia = unaMateria;
        this.salario = unSalario;

    }

    public String toString(){
        return super.toString() + "\n " + "Profesor de " + this.materia + "\n " + "de salario $" + this.salario;
    }
}
