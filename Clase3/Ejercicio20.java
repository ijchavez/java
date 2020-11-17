package Clase3;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int oper = 0;
        System.out.println("ingrese operacion (1)suma, (2) resta, (3) multiplicacion, 4(division)");
        oper = teclado.nextInt();


        int num1 = 0;
        int num2 = 0;

        System.out.println("ingrese un numero");
        num1 = teclado.nextInt();
        System.out.println("ingrese otro numero");
        num2 = teclado.nextInt();

        if (oper == 1){
            int suma = 0;
            suma = calcularSuma(num1,num2);
            System.out.println("El resultado es " + suma);

        }else if (oper == 2) {
            int res = 0;
            res = calcularResta(num1, num2);
            System.out.println("El resultado es " + res);

        }else if (oper == 3){
            int mul = 0;
            mul = calcularMultiplicacion(num1,num2);
            System.out.println("El resultado es " + mul);
        }else{
            int divi = 0;
            divi = calculardivision(num1,num2);
            System.out.println("El resultado es " + divi);
        }

    }

    private static int calcularSuma(int numero1, int numero2) {
        int suma = 0;
        suma = numero1 + numero2;
        return suma;
    }

    private static int calcularResta(int numero1, int numero2) {
        int resta = 0;
        resta = numero1 - numero2;
        return resta;
    }

    private static int calcularMultiplicacion(int numero1, int numero2) {
        int multi = 0;
        multi = numero1 * numero2;
        return multi;
    }

    private static int calculardivision(int numero1, int numero2) {
        int div = 0;
        // si pongo afuera div = numero1/numero2 me tira error porque no entra a la evaluacion ejecuta la cuenta

        if (numero2 != 0) {
            return div = numero1/numero2;
        } else {
            return div = 0;
        }
    }
}
