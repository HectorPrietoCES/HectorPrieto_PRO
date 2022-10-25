import java.util.Scanner;

public class While {
    // Pedir por consola numeros hasta introducir un negativo
    // Cuando termine el programa mostrará
    //      cuantos numeros he introducido
    //      cuantos numeros he introducido
    //      cuantos han sido impares

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int numeroAleatorio = 0;

        while (numeroAleatorio >= 0) {
            System.out.println("Introduce otro numero");
            numeroAleatorio = lecturaTeclado.nextInt();
        }
    }
}
