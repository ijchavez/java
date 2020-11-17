package Clase3;
import java.util.Scanner;

class ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0;
        System.out.println("Ingrese un numero");
        num1 = teclado.nextInt();

        int dunoan =(deUnoaN(num1));
        System.out.println("El resultado de sumar de 1 a " + num1 + " es " + dunoan);

    }
    public static int deUnoaN(int num){
        int sumatoria = 0;
        for (int i = 1; i <= num; i = i + 1){
            sumatoria = i + sumatoria;
        }
        return sumatoria;
    }

}
