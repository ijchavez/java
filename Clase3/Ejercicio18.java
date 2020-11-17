package Clase3;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main (String args[]){

        Scanner teclado = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int num = 0;

        System.out.println("ingrese un mìnimo");
        min = teclado.nextInt();
        System.out.println("ingrese un maximo");
        max = teclado.nextInt();
        System.out.println("ingrese un numero");
        num = teclado.nextInt();

        int numeroval = 0;
        numeroval = validarNumero("numero valido","numero fuera de rango",min,max,num);


    }
    ////////////////////////////////////////////////////////////////
    // Paso los valores que me pide mas los que necesito
    // Establezco la condicion indicando que no salga hasta que me
    // de un numero dentro del rango y recien cuando ingreso uno
    // que si hago el return
    // Los mensajes de error estan afuera pasados por parametro.
    // Arriba en la funcion me indica que es cada mensaje
    ///////////////////////////////////////////////////////////////

    private static int validarNumero(String mensaje, String error, int minimo, int maximo, int numero){
        Scanner input = new Scanner(System.in);

        while ((numero < minimo) || (numero > maximo)){
            System.out.println(error);
            numero = input.nextInt();
        }
        System.out.println(mensaje);
        return numero;
    }

}
