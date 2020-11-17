package Clase5.Ejercicio4;

public class Libro {
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
    //Crear una clase Libro que contenga los siguientes atributos:
    //
    //● ISBN: int
    //● Titulo: String
    //● Autor: String
    //● Número de páginas: int
    private int isbn;
    private String titulo;
    private String autor;
    private int nroDePagina;

    //b) Crear un constructor sin parámetros, y un constructor que contenga todos los
    //parámetros del libro. El constructor sin parámetros, debe setear el título del libro como
    //“Sin título”.

    public Libro(){
        this.isbn = 0;
        this.titulo = "Sin Titulo";
        this.autor = "Desconocido";
        this.nroDePagina = 0;
    }
    public Libro(int unIsbn, String unTitulo, String unAutor, int unNroDePagina){
        this.isbn = unIsbn;
        this.titulo = unTitulo;
        this.autor = unAutor;
        this.nroDePagina = unNroDePagina;
    }
    //Crear sus respectivos métodos get y set para cada atributo. Crear el método toString()
    //para mostrar la información relativa al libro con el siguiente formato:
    //“El libro con ISBN xxxx creado por el autor yyyy tiene zz páginas”
    public void setIsbn(int unIsbn){
        this.isbn = unIsbn;

    }
    public int getIsbn(){
        return this.isbn;
    }

    public void setTitulo(String unTitulo){
        this.titulo = unTitulo;

    }
    public String getTitulo(){
        return this.titulo;

    }

    public void setAutor(String unAutor){
        this.autor = unAutor;

    }
    public String getAutor(){
        return this.autor;

    }

    public void setNroDePagina(int unNroDePagina){
        this.nroDePagina = unNroDePagina;

    }
    public int getNroDePagina(){
        return this.nroDePagina;
    }

    //toString

    public String toString(){
        String retISBN = "ISBN: " + this.isbn;
        String retTitu = "Titulo: " + this.titulo;
        String retAuto = "Autor: " + this.autor;
        String retNroP = "Numero de Pagina: " + this.nroDePagina;

        String retTot = retISBN + "\n" + retTitu + "\n" + retAuto + "\n" + retNroP;
        return retTot;

    }


}
