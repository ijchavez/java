package Clase5.Ejercicio3;
//Realizar una clase llamada CalcularImpuestos. Crear un método llamado
//calcularIva y calcular IRPF. Ambos deben retornar un valor. El IVA es el 22% IRPF 19%


public class CalcularImpuestos {
    public static float calcularIVA(float unSueldo){
        float ivaCalculado = 0;
        unSueldo = Constantes.IVA * unSueldo / 100;
        return ivaCalculado;
    }
    public static float calcularIRPF(float unSueldo){
        float calculadoIRPF = 0;
        calculadoIRPF = Constantes.IRFP * unSueldo / 100;
        return calculadoIRPF;
    }
}
