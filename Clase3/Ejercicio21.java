package Clase3;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String args[]) {
        float calculapr = 0;
        calculapr = calcularPromedio();
        System.out.println("El calculo del promedio es " + calculapr);


    }
    // pide el ingreso de numeros desde un metodo a otro metodo

    public static int ingresarNumero(String mensaje){
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        System.out.println("ingrese numeros para calcular promedio");
        num = teclado.nextInt();
        return num;

    }
    public static float calcularPromedio(){

        int i = 0;
        int num = 0;
        int suma = 0;

        float pro = 0;
        num = ingresarNumero("ingrese un numero");

        while (num != 0){
            i = i + 1; //se cuentan los acumuladores
            suma = suma + num; //se suman los numeros
            num = ingresarNumero("ingrese otro numero");

        }
        if (i > 0) {
            return pro =  suma / i;

        }else{
            return pro = 0;
        }
    }

}
