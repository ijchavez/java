package Clase6.HerenciaYPolimorfismo.EjercicioTesDesMan;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiEmpresa {
    public static void main(String [] args){
        List<Empleado> listaPersonal = new ArrayList<>();
        /*
        Empleado tester = new Tester("Fabian",34127981,90000,true,false);

        Empleado developerA = new Developer("Estefania",94831738,120000,"Python");
        Empleado developerB = new Developer("Carlos",50296857,124000,"Java");

        Empleado manager = new Manager("Gabriela",50498403,155000,"Clientes");

        listaPersonal.add(tester);
        listaPersonal.add(developerA);
        listaPersonal.add(developerB);
        listaPersonal.add(manager);

        */
        int opc = 0;
        ingresoOpcion(opc);


    }
    public static int ingresoOpcion(int unaOpc){
        Scanner input = new Scanner(System.in);
        List<Empleado> unaListaEmpleado = new ArrayList<>();

        while (unaOpc != 5){
            System.out.println("Ingrese una Opción" + "\n" + "1- Agregar Tester" + "\n" + "2- Agregar Developer"+ "\n" + "3- Agregar Manager"+ "\n" + "4- Listar Empleados" + "\n" + "5- Salir");
            unaOpc = input.nextInt();

            if (unaOpc == 1){
                ingresoTester(unaListaEmpleado);

            }else if(unaOpc == 2){
                ingresoDeveloper(unaListaEmpleado);

            }else if(unaOpc == 3){
                ingresoManager(unaListaEmpleado);

            }else if(unaOpc == 4){
                imprimoPersonal(unaListaEmpleado);

            }else if(unaOpc == 5){
                System.out.println("SALIENDO DEL PROGRAMA");

            }


        }
        return unaOpc;

    }

    public static List<Empleado> ingresoTester(List<Empleado> unaListaEmpleado) {
        Scanner input = new Scanner(System.in);

        System.out.println("***** AGREGAR TESTER *****");

        System.out.println("***** Ingrese el nombre de la persona *****");
        String nombre = input.next();

        System.out.println("***** Ingrese el telefono de la persona *****");
        int telefono = input.nextInt();

        System.out.println("***** Ingrese el sueldo*****");
        int sueldo = input.nextInt();

        System.out.println("Marque S/N si es Tester Manual");
        String testerMan = input.next();
        boolean testMan;
        if (testerMan.equals("S") == true) {
            testMan = true;

        } else {
            testMan = false;

        }

        System.out.println("Marque S/N si es Tester Automatizador");
        String testerAuto = input.next();
        boolean testAuto;

        if (testerAuto.equals("S") == true) {
            System.out.println("Marco que es tester automatizador, se va a actualizar tester manual a S independientemente de su eleccion previa");
            testAuto = true;
            testMan = true;

        }else{
            testAuto = false;
        }

        Empleado tester = new Tester(nombre,telefono,sueldo,testMan,testAuto);
        unaListaEmpleado.add(tester);

        return unaListaEmpleado;

    }

    public static List<Empleado> ingresoDeveloper(List<Empleado> unaListaEmpleado) {
        Scanner input = new Scanner(System.in);

        System.out.println("***** AGREGAR DEVELOPER *****");

        System.out.println("***** Ingrese el nombre de la persona *****");
        String nombre = input.next();

        System.out.println("***** Ingrese el telefono de la persona *****");
        int telefono = input.nextInt();

        System.out.println("***** Ingrese el sueldo*****");
        int sueldo = input.nextInt();

        System.out.println("***** Ingrese el lenguaje que desarrolla de la persona *****");
        String lenguaje = input.next();

        Empleado developer = new Developer(nombre,telefono,sueldo,lenguaje);
        unaListaEmpleado.add(developer);

        return unaListaEmpleado;


    }
    public static List<Empleado> ingresoManager(List<Empleado> unaListaEmpleado) {
        Scanner input = new Scanner(System.in);

        System.out.println("***** AGREGAR MANAGER *****");

        System.out.println("***** Ingrese el nombre de la persona *****");
        String nombre = input.next();

        System.out.println("***** Ingrese el telefono de la persona *****");
        int telefono = input.nextInt();

        System.out.println("***** Ingrese el sueldo*****");
        int sueldo = input.nextInt();

        System.out.println("***** Ingrese el area donde la persona se desenvuelve *****");
        String area = input.next();

        Empleado manager = new Manager(nombre,telefono,sueldo,area);
        unaListaEmpleado.add(manager);

        return unaListaEmpleado;


    }
        public static void imprimoPersonal(List<Empleado> listaEmpleado ){
        for (Empleado empleado : listaEmpleado){
            System.out.println(empleado);
            System.out.println("**********");

        }

    }



}
