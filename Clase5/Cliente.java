package Clase5;

public class Cliente {
    /*****METODOLOGIA A CARGAR*****
     * ATRIBUTOS
     * CONSTRUCTORES
     * SETTER Y GETTER
     * toString
     */
    //ATRIBUTO DE LA CLASE (POR SER ESTATICO)
    private static int IDENTIFICADOR = 1000;


    //ATRIBUTOS de cada objeto

    private String nombre;
    private int edad;
    private int nroCliente;


    //CONSTRUCTORES

    public Cliente(){
        this.nombre = "Sin asignar";
        this.edad = 0;
        IDENTIFICADOR++;
        this.nroCliente = IDENTIFICADOR;

    }
    public Cliente(String unNombre, int unaEdad){
        this.nombre = unNombre;
        this.edad = unaEdad;
        IDENTIFICADOR++;
        this.nroCliente = IDENTIFICADOR;
    }

    //SETTERS Y GETTERS
    //el set es void
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }
    //el get es lo que es la variable y retorna algo
    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int unaEdad) {
        this.edad = unaEdad;
    }
    public int getEdad(){
        return this.edad;
    }
    //toString

    public String toString(){
        return "Nombre: " + this.nombre + " Edad: " + this.edad + " #" + this.nroCliente;

    }
}
