package Clase5.Ejercicio1;
//Crear una clase Camión.
import java.util.Scanner;
public class Camion {
    /******AL GENERAR UNA CLASE*****
     * 1)Atributos // no debe coincidir el nombre el parametro con el de atributo
     * 2)Constructores
     * 3) SET Y GET uno por cada atributo
     *    SET
     *      void y le paso parametro igualo el this al parametro
     *    GET
     *      del tipo de variable y hace el return del atributo
     * 4) Metodo toString
     *      Sin parametros, retorna lo q le pedimos
     *
     *******************************/
    //Definir la variable chapa y color de tipo int y String respectivamente
    private int chapa;
    private String color;
    //Agregar un atributo llamado añoCompra de tipo int.
    private int añoCompra;
    //Realizar un constructor sin parámetros

    public Camion(){
      this.chapa = 1234;
      this.color = "Negro";
    }

    //Realizar un constructor con únicamente la chapa como parámetro
    public Camion(int unaChapa){
        this.chapa = unaChapa;
        this.color = "Rojo";
    }

    //Realizar un constructor con la chapa y el color

    public Camion(int unaChapa, String unColor){
        this.chapa = unaChapa;
        this.color = unColor;
    }
    //Agregarlo al constructor
    public Camion(int unaChapa, String unColor, int unAñoCompra){
        this.chapa = unaChapa;
        this.color = unColor;
        this.añoCompra = unAñoCompra;

    }


    //Realizar los metodos set y get para cada atributo

    public void setChapa(int unaChapa){
        this.chapa = unaChapa;
    }

    public int getChapa(){
        return this.chapa;
    }

    public void setColor(String unColor){
        this.color = unColor;
    }

    public String getColor(){
        return this.color;
    }

    //Agregar su setter, getter y agregarlo al constructor de año de compra
    public int getAñoCompra(){
        return this.añoCompra;
    }

    public void setAñoCompra(int unAñoDeCompra){
        this.añoCompra = unAñoDeCompra;
    }


    //Realizar el método toString() que imprima todos los datos en pantalla del camión
    public String toString(){
        String retornoChapa = "La chapa es " + this.chapa;
        String retornoColor = "El color es " + this.color;
        //Agregar en el toString, si el vehículo tiene que realizar una revisión o no.
        //Aca para todos los vehiculos.
        String retornorevision = "";
        if (leTocaRevision() == true){
            retornorevision = "Le toca revisión";
        }else{
            retornorevision = "No le toca revisión";
        }

        String retornoTotal = retornoChapa + "," + retornoColor + ". " + retornorevision;



        return retornoTotal;

    }
    //Agregar un método a la clase Camión, llamado leTocaRevision que retorne true
    //si el año de compra es menor a 2015
    public boolean leTocaRevision(){
        if(this.añoCompra < 2015){
            return true;
        }else{
            return false;
        }
    }
    //Crear un método llamado tieneMismoColor, que reciba un Camión como
    //parámetro, y retorne verdadero si dos camiones tienen el mismo color
    public boolean tieneMismoColor(Camion unCamion){
        return this.getColor().equals((unCamion.getColor()));
    }

}
