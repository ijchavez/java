package Clase6.HerenciaYPolimorfismo.EjercicioAlumnoProfesor;

public class Persona {

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


    private String nombre;
    private int dni;
    private int edad;

    public Persona(String unNombre, int unDni){
        this.nombre = unNombre;
        this.dni = unDni;
        this.edad = 0;


    }

    public void setNombre(String unNombre){
        this.nombre = unNombre;

    }
    public String getNombre(){
        return this.nombre;

    }

    public void setDni(int unDni){
        this.dni = unDni;

    }
    public int getDni(){
        return this.dni;
    }


    public void setEdad(int unaEdad){
        this.dni = unaEdad;

    }
    public int getEdad(){
        return this.edad;
    }

    public String toString(){
        String retNom = "Nombre: " + this.nombre;
        String retDni = "DNI: " + this.dni;
        String retEdad = "";

        if (this.edad < 100 && this.edad > 0){
            retEdad = "Edad: " + this.edad;
        }

        String retorno = retNom + "\n" + retDni + "\n" + retEdad;
        return retorno;
    }




}
