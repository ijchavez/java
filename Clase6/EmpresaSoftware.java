package Clase6;

public class EmpresaSoftware {
    public static void main(String [] args){

        Tester t1 = new Tester();
        //La restriccion en la clase Tester hace que por mas que ponga esManual = false me devuelva true

        t1.setEsManual(false);
        t1.setEsAutomatizador(true);


        System.out.println(t1);

    }


}
