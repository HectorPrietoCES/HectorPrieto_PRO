import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        int posicion = 0;
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros que quieres comprobar");
        posicion = lecturaTeclado.nextInt();
        int[] numero = new int[posicion];


        int serie = posicion, numero1 = 0, numero2 = 1, suma = 0;

        System.out.println("Los numeros de Fibonacci que quieres comprobar son:");
        System.out.println(numero1);

        for (int i = 1; i < serie; i++) {
            System.out.println(suma);
            suma = numero1 + numero2;
            numero1 = numero2;
            numero2 = suma;
        }

    }
}

