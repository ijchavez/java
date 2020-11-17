package Clase6;

public class Persona {

    private String nombre;
    private int edad;
    private int dni;

    public Persona (String unNombre, int unDni){
        this.nombre = unNombre;
        this.edad = 0;
        this.dni = unDni;


    }
    public Persona (String unNombre, int unDni, int unaEdad){
        this.nombre = unNombre;
        this.edad = unaEdad;
        this.dni = unDni;


    }

    public void setNombre(String unNombre){
        this.nombre = unNombre;

    }
    public String getNombre(){
        return this.nombre;
    }

    public void setDni(int unDni){
        this.dni = unDni;
    }
    public int getDni(){
        return this.dni;
    }
    public void setEdad(int unaEdad){
        this.edad = unaEdad;
    }
    public int getEdad(){
        return this.edad;
    }


    public String toString(){
        String desuno = "El nombre de la persona es " + this.nombre + " DNI: " + this.dni;
        String desEdad = "";
        if (this.edad < 100 && this.edad > 0){
            desEdad = " la edad es " + this.edad;
        }
        String descripcion = desuno + desEdad;
        return descripcion;
    }
}

