package Clase6.HerenciaYPolimorfismo.EjercicioTesDesMan;

public class Empleado {

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
    private int telefono;
    private int sueldo;

    public Empleado(){

        this.nombre = "";
        this.telefono = 0;
        this.sueldo = 0;

    }

    public Empleado(String unNombre, int unTelefono, int unSueldo){

        this.nombre = unNombre;
        this.telefono = unTelefono;
        this.sueldo = unSueldo;

    }

    public void setNombre(String unNombre){
        this.nombre = unNombre;

    }
    public String getNombre() {
        return this.nombre;

    }

    public void setTelefono(int unTelefono){
        this.telefono = unTelefono;

    }
    public int getTelefono(){
        return this.telefono;

    }
    public void setSueldo(int unSueldo){
        this.telefono = unSueldo;

    }
    public int getSueldo(){
        return this.sueldo;

    }

    public String toString(){

        String retNo = "Nombre: " + this.nombre;
        String retTel = "Telefono: " + this.telefono;
        String retSue = "Sueldo: $" + this.sueldo;

        String retorno = retNo + "\n" + retTel + "\n" + retSue;
        return retorno;

    }

}
