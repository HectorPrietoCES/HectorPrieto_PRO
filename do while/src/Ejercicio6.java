import java.util.Scanner;

public class Ejercicio6 {
    public class ejercicio6 {
        public static void main(String[] args) {
            Scanner lecturaTelcado = new Scanner(System.in);
            int numeroAleatorio = (int) Math.random() * 20 + 1;
            int numero = lecturaTelcado.nextInt();
            int repeticiones = 0;

            System.out.println("Introduzca numeros entre el 1 y el 20 para adivinar el número aleatorio");

            do {
                repeticiones++;
                System.out.println("Introduzca un numero entre el 1 y el 20");
                numero = lecturaTelcado.nextInt();
                System.out.println("Lo siento, intentalo de nuevo");
                numero = lecturaTelcado.nextInt();
            } while (numero == numeroAleatorio);

            System.out.println("Enhorabuena, has acertado el número en " + repeticiones + " intentos");
        }
    }

}
