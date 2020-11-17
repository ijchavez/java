package Clase5;
import java.util.Scanner;

public class Automotora {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        Camion c1 = new Camion();
        Camion c2 = new Camion(5555, "Negro");
        Camion c3 = new Camion("Verde");
        Camion c4 = new Camion(5948);


        System.out.println(c1); // crea lo q le da el constructor si no se le pone parametros
        //System.out.println(c2); // va a poner lo que recibe por parametros
        //System.out.println(c3); //
        //System.out.println(c4); //

        System.out.println("Ingrese Color");
        String unColor = input.next();
        System.out.println("Ingrese Chapa");
        int unaChapa = input.nextInt();

        System.out.println("Datos actualizados");

        //Para modificar los datos uso SET y para obtenerlo GET
        c1.setColor(unColor);
        System.out.println("Color " + c1.getColor());
        c1.setChapa(unaChapa);
        System.out.println("Chapa " + c1.getChapa());

        System.out.println("Ingrese Año de compra");
        int unAño = input.nextInt();
        c1.setAñoCompra(unAño);

        //con la informacion evaluo el metodo booleano
        if (c1.leTocaRevision()== true){
            System.out.println("le toca revisión");
        }else{
            System.out.println("no le toca revisión");
        }

        System.out.println(c1);

        if (c1.tieneMismoColor(c2) == true){
            System.out.println("los camiones tienen el mismo color");
        }else{
            System.out.println("los camiones no tienen el mismo color");
        }
    }

}
