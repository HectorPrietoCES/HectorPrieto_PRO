import java.io.PrintStream;
import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {

        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.printf("¿Como te llamas?%n", lecturaTeclado);
        String nombre = lecturaTeclado.next();
        System.out.printf("¿Cual es tu apellido?%n");
        String apellido = lecturaTeclado.next();
        System.out.printf("¿Cuantos años tienes?%n");
        double edad = lecturaTeclado.nextDouble();
        System.out.printf("¿Cuanto pesas?%n");
        double peso = lecturaTeclado.nextDouble();
        System.out.printf("¿Cuanto mides? ej:1,65%n");
        double altura = lecturaTeclado.nextDouble();
        System.out.printf("Masculino - Femenino%n");
        String sexo = lecturaTeclado.next();

        Double formula = (peso / (altura * altura));
        System.out.printf("Tu IMC es %.2f%n", formula);

        PrintStream printf = System.out.printf("Hola %s tu IMC teniendo en cuenta tu altura" +
                " de %.2f m y tu peso de %.2f kg tiene un valor de %.2f ", nombre, altura, peso, formula);


    }

}