import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        int numero1 , suma=0;

        do {
            System.out.println("Introducza un número");
            numero1 = lecturaTeclado.nextInt();
            suma=suma+numero1;
        } while (numero1 != 0);

        System.out.println("La suma de los numeros elegidos es: "+suma);

    }
}
