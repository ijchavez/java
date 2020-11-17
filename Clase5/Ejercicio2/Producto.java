package Clase5.Ejercicio2;
//Crear clase llamada Producto.
public class Producto {
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
    //Cada vez que se ingrese un producto, el Nro de producto se debe incrementar
    //automáticamente. No puede modificarse este número bajo ninguna
    //circunstancia. (Sugerencia: definir una variable estática privada de tipo int e
    //incrementarla en cada constructor)
    private static int NRODEPRODUCTO = 0000;

    //Agregar los siguientes atributos: Nombre (String), Codigo (int), Importado
    //(boolean), NroLote (String), NroProducto (int)
    //ATRIBUTOS
    private String Nombre;
    private int Codigo;
    private boolean Importado;
    private String NroLote;
    private int NroProducto;
    //Crear los constructores con parámetros y sin parámetros. El sin parámetros
    //deberá asignar un valor a cada atributo:
    //■ Nombre: Desconocido
    //■ Codigo: 0
    //■ Importado = false
    //■ NroLote = Desconocido
    //Constructores
    public Producto(){
        this.Nombre = "Desconocido";
        this.Codigo = 0;
        this.Importado = false;
        this.NroLote = "Desconocido";
        //Cada vez que se ingrese un producto, el Nro de producto se debe incrementar
        //automáticamente. No puede modificarse este número bajo ninguna
        //circunstancia.
        NRODEPRODUCTO++;
        this.NroProducto = NRODEPRODUCTO;
    }
    public Producto(String unNombre, int unCodigo, boolean esImportado, String unNroLote){
        this.Nombre = unNombre;
        this.Codigo = unCodigo;
        this.Importado = esImportado;
        this.NroLote = unNroLote;
        //Cada vez que se ingrese un producto, el Nro de producto se debe incrementar
        //automáticamente. No puede modificarse este número bajo ninguna
        //circunstancia.
        NRODEPRODUCTO++;
        this.NroProducto = NRODEPRODUCTO;
    }
    public Producto(String unNombre, int unCodigo, boolean esImportado){
        this.Nombre = unNombre;
        this.Codigo = unCodigo;
        this.Importado = esImportado;
        this.NroLote = "Desconocido";
        //Cada vez que se ingrese un producto, el Nro de producto se debe incrementar
        //automáticamente. No puede modificarse este número bajo ninguna
        //circunstancia.
        NRODEPRODUCTO++;
        this.NroProducto = NRODEPRODUCTO;
    }
    public Producto(String unNombre, int unCodigo){
        this.Nombre = unNombre;
        this.Codigo = unCodigo;
        this.Importado = false;
        this.NroLote = "Desconocido";
        //Cada vez que se ingrese un producto, el Nro de producto se debe incrementar
        //automáticamente. No puede modificarse este número bajo ninguna
        //circunstancia.
        NRODEPRODUCTO++;
        this.NroProducto = NRODEPRODUCTO;
    }
    public Producto(boolean esImportado, String unNroLote) {
        this.Nombre = "Desconocido";
        this.Codigo = 0;
        this.Importado = esImportado;
        this.NroLote = unNroLote;
        //Cada vez que se ingrese un producto, el Nro de producto se debe incrementar
        //automáticamente. No puede modificarse este número bajo ninguna
        //circunstancia.
        NRODEPRODUCTO++;
        this.NroProducto = NRODEPRODUCTO;
    }
    public Producto(String unNombre, boolean esImportado, String unNroLote) {
        this.Nombre = unNombre;
        this.Codigo = 0;
        this.Importado = esImportado;
        this.NroLote = unNroLote;
        //Cada vez que se ingrese un producto, el Nro de producto se debe incrementar
        //automáticamente. No puede modificarse este número bajo ninguna
        //circunstancia.
        NRODEPRODUCTO++;
        this.NroProducto = NRODEPRODUCTO;
    }
    //SETTER y GETTER
    //Crear los métodos setter y getter para cada uno de los atributos

    public void setNombre(String unNombre){
        this.Nombre = unNombre;
    }
    public String getNombre(){
        return this.Nombre;
    }

    public void setCodigo(int unCodigo){
        this.Codigo = unCodigo;
    }

    public int getCodigo(){
        return this.Codigo;
    }

    public void setImportado(boolean esImportado){
        this.Importado = esImportado;
    }

    public boolean getImportado(){
        return this.Importado;
    }


    public void setNroLote(String unNroLote){
        this.NroLote = unNroLote;
    }
    public String getNroLote(){
        return this.NroLote;
    }

    //toString
    //Mostrar todos los atributos en el método toString. Si el producto es importado, se
    //debe mostrar. “Este producto es importado”, sino, “Producto nacional”

    public String toString(){
        String retNombre = "Nombre: " + this.Nombre;
        String retCodigo = "Codigo: " + this.Codigo;
        String retImportado;
        String retNroLote = "Número de lote: " + this.NroLote;
        String retNroProd = "Número de producto: " + this.NroProducto;
        String retornoTo;
        if (esImportado()== true){
            retImportado = "Este producto es importado";
        }else{
            retImportado = "Producto nacional";
        }

        return retornoTo = retNombre + "\n" + retCodigo + "\n" + retImportado  + "\n" + retNroLote  + "\n" + retNroProd;


    }
    public boolean esImportado(){
        if(this.Importado == true){
            return true;
        }else{
            return false;
        }
    }

}
