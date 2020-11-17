package Clase4.Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Boolean> listaDeBool = new ArrayList<Boolean>();

        todosVerdaderos(listaDeBool);
        System.out.println(todosVerdaderos(listaDeBool));


    }
    public static boolean todosVerdaderos(ArrayList<Boolean> listBool ){

        for (int i = 0; i < listBool.size(); i++){
            if (listBool.get(i) == false){
                return false;
            }
        }
        return true;

    }
}
