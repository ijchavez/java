package Clase5;

public class Camion {
    /******AL GENERAR UNA CLASE*****
     * 1)Atributos // no debe coincidir el nombre el parametro con el de atributo
     * 2)Constructores
     * 3) SET Y GET uno por cada atributo
     * 4) Metodo toString
     *
     *******************************/

    //Atributos de los camiones privados
    private int chapa;
    private String color;
    private int añoCompra;

    //Sobrecarga de metodos en los constructores
    //Constructor sin parametros
    public Camion(){
        this.chapa = 1111;
        this.color = "Blanco";


    }
    //Constructor con 2 parametros
    public Camion(int unaChapa, String unColor){
        this.chapa = unaChapa;
        this.color = unColor;


    }
    //Constructor con un parametro de color
    public Camion(String unColor){
        this.chapa = 1100;
        this.color = unColor;


    }
    //Constructor con un parametro de chapa
    public Camion(int unaChapa) {
        this.chapa = unaChapa;
        this.color = "Azul";
    }

    // Java va a utilizar esto previo al toString de java, reescribo el metodo para mi conveniencia
    public String toString(){
        String retornoch = "El camion tiene chapa " + this.chapa + " ";
        String retornoco = "Su color es " + this.color + " y ";
        String retornoa = "";
        if (this.leTocaRevision() == true){
            retornoa = "le toca revisión";
        }else{
            retornoa = "no le toca revisión";
        }

        String retornot = retornoch + retornoco + retornoa;
        return retornot;

    }
    //UN SET Y UN GET POR CADA PARAMETRO
    public void setChapa(int unaChapa){

        this.chapa = unaChapa;
    }

    public int getChapa(){
        return this.chapa;

    }
    //UN SET Y UN GET POR CADA PARAMETRO
    public void setColor(String unColor){

        this.color = unColor;
    }

    public String getColor(){
        return this.color;

    }
    public void setAñoCompra(int unAño) {
        this.añoCompra = unAño;
    }

    public int getAñoCompra(){
        return this.añoCompra;

    }
    public boolean leTocaRevision() {
        if (this.añoCompra < 2015) {
            return true;

        }else{
        return false;
        }
    }
    public boolean tieneMismoColor(Camion unCamion) {
       return this.getColor().equals(unCamion.getColor());

    }


}

