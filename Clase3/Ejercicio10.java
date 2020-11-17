package Clase3;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float alto = 0;
        float ancho = 0;

        System.out.println("Ingrese el alto");
        alto = teclado.nextFloat();
        System.out.println("Ingrese el ancho");
        ancho = teclado.nextFloat();

        float areap = (areaParalelogramo(alto, ancho));
        System.out.println("El area del paralelogramo es " + areap);


    }
    public static float areaParalelogramo(float num1, float num2){
        float area = 0;
        area = (num1 * num2);
        return area;

    }

}
