package Clase6.HerenciaYPolimorfismo.EjercicioTesDesMan;

public class Developer extends Empleado {

    private String lenguaje;

    public Developer(String unNombre, int unTelefono, int unSueldo, String unLenguaje){
        super(unNombre,unTelefono,unSueldo);
        this.lenguaje = unLenguaje;

    }

    public void setLenguaje(String unLenguaje){
        this.lenguaje = unLenguaje;

    }
    public String getLenguaje(){
        return this.lenguaje;

    }

    public String toString(){
        String retEmp = super.toString();
        String retLen = "Programa en lenguaje: " + this.lenguaje;
        String retorno = retEmp + "\n" + retLen;

        return retorno;

    }

}
