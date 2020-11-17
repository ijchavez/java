package Clase6.HerenciaYPolimorfismo.EjercicioAlumnoProfesor;

public class Profesor extends Persona {

    /******AL GENERAR UNA CLASE*****
     * 1)Atributos // no debe coincidir el nombre el parametro con el de atributo
     * 2)Constructores
     * 3) SET Y GET uno por cada atributo
     *    SET
     *      void y le paso parametro igualo el this al parametro >>>  public void setNombre(<tipo variable> unaVariable)
     *    GET
     *      del tipo de variable y hace el return del atributo  >>> public String getNombre()
     * 4) Metodo toString
     *      Sin parametros, retorna lo q le pedimos
     *
     *******************************/


    private String materia;
    private float salario;

    public Profesor(String unNombre,int unDni, String unaMateria, float unSalario){

        //USO super(parametros obligatorios) para la herencia de la persona
        super(unNombre,unDni);

        this.materia = unaMateria;
        this.salario = unSalario;

    }

    public void setMateria(String unaMateria){
        this.materia = unaMateria;

    }
    public String getMateria(){
        return this.materia;

    }
    public void setSalario(float unSalario){
        this.salario = unSalario;

    }
    public float getSalario(){
        return this.salario;

    }
    public String toString(){

        //USO super(parametros obligatorios) para la herencia de la persona
        String retPers = super.toString();

        String retMat = "Profesor de la materia: " + this.materia;
        String retSal = "Salario: $" + this.salario;
        String retTot = retPers + "\n" + retMat  + "\n" + retSal;

        return retTot;

    }


}
