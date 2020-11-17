package Clase3;
import java.util.Scanner;

public class Ejercicio9 {
    public static final double PI = 3.14;
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);
    double radio = 0;
    System.out.println("Ingrese el radio");
    radio = teclado.nextDouble();

    double area = (areaCirc(radio));
    System.out.println("el area con un radio de " + radio + " es de " + area);

    }
    public static double areaCirc(double num){
        double area = 0;
        area = (num * num) * PI;
        return area;

    }
}
