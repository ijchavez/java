package Clase6.HerenciaYPolimorfismo.EjercicioTesDesMan;

public class Manager extends Empleado {

    private String area;

    public Manager(String unNombre, int unTelefono, int unSueldo, String unArea){
        super(unNombre,unTelefono,unSueldo);
        this.area = unArea;


    }

    public void setArea(String unArea){
        this.area = unArea;

    }
    public String getArea(){
        return this.area;

    }

    public String toString(){
        String retEmp = super.toString();
        String retAre = "Area: " + this.area;
        String retorno = retEmp + "\n" + retAre;

        return retorno;

    }

}
