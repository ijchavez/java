package Clase6.HerenciaYPolimorfismo.EjercicioTesDesMan;

public class Tester extends Empleado {

    private boolean manual;
    private boolean automatizador;

    public Tester(String unNombre,int unTelefono, int unSueldo, boolean esManual, boolean esAutomatizador){

        super(unNombre,unTelefono,unSueldo);
        this.manual = esManual;
        this.automatizador = esAutomatizador;

    }

    public void setManual(boolean esManual){
        this.manual = esManual;
    }
    public boolean getManual(){
        return this.manual;
    }

    public void setAutomatizador(boolean esAutomatizador){
        this.manual = esAutomatizador;
        if (this.automatizador == true){
            this.manual = true;
        }
    }
    public boolean getAutomatizador(){
        return this.automatizador;
    }


    public String toString(){
        String retEmp = super.toString();
        String retMan = "Es tester manual";
        String retAut = "Es tester automatizador";

        String retorno = retEmp + "\n" + retMan + "\n" + retAut;
        return retorno;

    }
}
