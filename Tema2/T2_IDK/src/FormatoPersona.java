import java.util.Scanner;

public class FormatoPersona {

    public static void main(String[] args) {

        String linea1 = pedirDatos();
        String linea2 = pedirDatos();
        System.out.println("\tNOMBRE\t\t\t\tEDAD\t\tALTURA\t\tCARNET\t\tLETRA");
        System.out.printf("%s", linea1);
        System.out.printf("%s", linea2);
    }

    public static void datosPersona() {


        //System.out.println("\tNOMBRE\t\t\t\tEDAD\t\tALTURA\t\tCARNET\t\tLETRA");

        //System.out.println("================           =====    ======    ======    =====");

        // System.out.println("----------------------------------------------");
        // System.out.printf("%s\t\t\t\t\t\t\t%d\t\t%.2f\t\t%b\t\t%s",nombre1 ,edad1 ,altura1 ,carnet1 ,dni1);


    }


    public static String pedirDatos() {

        Scanner lecturaTeclado = new Scanner(System.in);

        System.out.println("¿Cómo te llamas?");
        String nombre = lecturaTeclado.next();

        System.out.println("¿Cuantos años tienes?");
        int edad = lecturaTeclado.nextInt();

        System.out.println("¿Cuanto mides? ej; x,xx");
        double altura = lecturaTeclado.nextDouble();

        System.out.println("¿Tienes carnet de conducir? True / False");
        boolean carnet = lecturaTeclado.nextBoolean();

        System.out.println("Última letra del DNI");
        char dni = lecturaTeclado.next().charAt(0);


        //System.out.printf("%s\t\t\t\t\t\t\t%d\t\t%.2f\t\t%b\t\t%s%n",nombre ,edad ,altura ,carnet ,dni);
        return String.format("%s\t\t\t\t\t\t\t%d\t\t%.2f\t\t%b\t\t%s%n", nombre, edad, altura, carnet, dni);

    }


}
