package Clase6;

public class Estudiante extends Persona {

    private float promedio;
    private int nroEstudiante;
    private boolean tienePrevias;
    private String grupo;

    public Estudiante(String unNombre, int unDni, float unPromedio){
        //llamo al constructor de la clase padre haciendo super(parametros necesarios)

        super(unNombre, unDni);
        this.promedio = unPromedio;
        this.nroEstudiante = 0;
        this.tienePrevias = false;
        this.grupo = "1A";


    }
    public Estudiante(String unNombre, int unDni, float unPromedio, int unNroDeEstudiante,boolean conPrevias, String unGrupo){
        //llamo al constructor de la clase padre haciendo super(parametros necesarios)

        super(unNombre, unDni);
        this.promedio = unPromedio;
        this.nroEstudiante = 0;
        this.tienePrevias = conPrevias;
        this.grupo = unGrupo;

    }


    public String toString(){
        String retNom = super.toString();
        String retPro = " Su promedio es de :" + this.promedio;
        String retNroEst = "Nro. de estudiante: " + this.nroEstudiante;
        String retPrevias = "";
        if (this.tienePrevias == true){
            retPrevias = "el alumno tiene previas";
        }else{
            retPrevias = "el alumno no tiene previas";

        }
        String retGrupo = "Su grupo es :" + this.grupo;
        String retorno = retNom + "\n" + retPro  + "\n" + retNroEst  + "\n" + retPrevias  + "\n" + retGrupo;
        return retorno;
    }
}
