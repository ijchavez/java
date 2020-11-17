package Clase6;

public class Tester {

    private boolean esManual;
    private boolean esAutomatizador;

    public Tester(){
        this.esAutomatizador = false;
        this.esManual = true;

    }
    public void setEsManual(boolean esTesterManual){
        this.esManual = esTesterManual;

    }

    public void setEsAutomatizador(boolean esTesterAutomatizador){
        this.esAutomatizador = esTesterAutomatizador;
        if (esTesterAutomatizador == true){
            this.esManual = true;
        }

    }

    public String toString(){
        String info = "";
        if (this.esManual == true){
            info += "Es tester manual";
        }else{
            info += "No es tester manual";
        }
        if (this.esAutomatizador == true){
            info += "Es tester automatizador";
        }else {
            info += "No es tester automatizador";

        }

        return info;
    }

}
