import java.sql.SQLOutput;
import java.util.Scanner;

public class EntradaEstructuras {

    public static void main(String[] args) {
        estructuraIf();

    }

    public static void estructuraIf() {
        //IF

        int numeroUno = 10;
        int numeroDos = 20;

        System.out.println("Ejecucion de un simple");

        if (numeroUno > 0 && numeroUno <= 15 && numeroDos % 2 == 0) {
            // numeroUno>0 ejecuto el contenido de las  {}
            System.out.println("El numero es positivo y por lo tanto lo ejecuto");

            numeroUno++;

        } else {
            System.out.println("no se cumple la condición");
        }

        System.out.println("Continuacion del programa");
        System.out.println("El valor del numeroUno es: " + numeroUno);


        numeroUno = -20;
        numeroDos = 10;

        if (numeroUno > 10) {
            System.out.println("El numero es mas grande que 10");
        } else if (numeroUno >= 0 && numeroUno <= 10) {
            System.out.println("El numero esta entre 0 y 10");
        } else if (numeroUno < 0 && numeroUno > -10) {
            System.out.println("El numero es negativo");
        } else {
            // siempre el numero será -10
            System.out.println("El numero es un negativo grande");
        }


        // pedir por consola una nota
        // si la nota es valida [0-10]
        // si es valida 0-4,99 5-6.99aprobado 7-8.99 notable 9-9.99 sobre 10 matricula
        // de no serlo avisa

        Scanner lecturaTeclado = new Scanner(System.in);


        System.out.printf("¿Que nota has sacado en el examen?%n");
        double nota = lecturaTeclado.nextDouble();
        //if (nota>=0 && nota<=10)
        if (nota >= 0 && nota <= 4.99) {
            System.out.println("El examen esta suspenso");
        } else if (nota >= 5 && nota <= 6.99) {
            System.out.println("El examen esta aprobado");
        } else if (nota >= 7 && nota <= 8.99) {
            System.out.println("El examen es un notable");
        } else if (nota >= 9 && nota <= 9.99) {
            System.out.println("El examen es un sobresaliente!");
        } else if (nota == 10) {
            System.out.println("El examen es matricula de honor!!!!!!!!!!");
        }
    }


}
