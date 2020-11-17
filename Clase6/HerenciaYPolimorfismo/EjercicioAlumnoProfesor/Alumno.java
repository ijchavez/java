package Clase6.HerenciaYPolimorfismo.EjercicioAlumnoProfesor;

public class Alumno extends Persona{

    private int nroEstudiante;
    private String grupo;
    private boolean tienePrevia;
    private float promedio;

    public Alumno(String unNombre, int unDni, float unPromedio,int unNroEstudiante, String unGrupo, boolean conPrevias){

        //USO super(parametros obligatorios) para la herencia de la persona
        super(unNombre,unDni);
        this.promedio = unPromedio;
        this.nroEstudiante = unNroEstudiante;
        this.grupo = unGrupo;
        this.tienePrevia = conPrevias;


    }
    public Alumno(String unNombre, int unDni, float unPromedio,int unNroEstudiante){

        //USO super(parametros obligatorios) para la herencia de la persona
        super(unNombre,unDni);
        this.promedio = unPromedio;
        this.nroEstudiante = unNroEstudiante;
        this.grupo = "1A";
        this.tienePrevia = false;


    }

    private float getPromedio(){
        return this.promedio;
    }
    private void setPromedio(float unPromedio){
        this.promedio = unPromedio;
    }

    private int getNroEstudiante(){
        return this.nroEstudiante;

    }
    private void setNroEstudiante(int unNroEstudiante){

        this.nroEstudiante = unNroEstudiante;
    }
    private String getGrupo(){
        return this.grupo;

    }
    private void setGrupo(String unGrupo){
        this.grupo = unGrupo;
    }

    private boolean getTienePrevias(){
        return this.tienePrevia;
    }
    private void setTienePrevia(boolean conPrevias){
        this.tienePrevia = conPrevias;
    }


    public String toString() {
        String retPers = super.toString();
        String retPro = "Promedio de: " + this.promedio;
        String retNroEst = "Numero de estudiante: " + this.nroEstudiante;
        String retGrp = "Grupo:" + this.grupo;
        String retConPre = "";
        if (this.tienePrevia == false) {
            retConPre = "El alumno no tiene previas";

        } else {
            retConPre = "El alumno  tiene previas";

        }

        String retTot= retPers + "\n" + retPro + "\n" +  retNroEst + "\n" + retGrp + "\n" + retConPre;
        return retTot;


    }

}