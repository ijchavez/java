package Clase5.Ejercicio3;

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
    //Crear una clase llamada Persona que contenga el nombre y apellido de una
    //persona.
    //ATRIBUTOS
    private String nombre;
    private String apellido;

    //CONSTRUCTORES
    public Persona(){
        this.nombre = "Vacio";
        this.apellido = "Vacio";

    }
    public Persona(String unNombre, String unApellido){
        this.nombre = unNombre;
        this.apellido = unApellido;
    }
    //SETTER Y GETTER

    public void setNombre(String elNombre){
        this.nombre = elNombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setApellido(String elApellido){
        this.apellido = elApellido;
    }
    public String getApellido(){
        return this.apellido;
    }

    public String toString(){
        String retornoNombre = "Nombre: " + this.nombre;
        String retornoApellido = "Apellido: " + this.apellido;
        String retorno = retornoNombre + ", " + retornoApellido;
        return retorno;
    }
    public static void imprimirPersona(Persona unaPersona){
        System.out.println(unaPersona);

    }
}
