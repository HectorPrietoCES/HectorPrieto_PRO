import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        int binario, octal, hexadecimal;

        do {
            System.out.println("Introduce un numero entero positivo para convertirlo en binario");
                binario = lecturaTeclado.nextInt();
            System.out.println("Introduce un numero entero positivo para convertirlo en octal");
                octal = lecturaTeclado.nextInt();
            System.out.println("Introduce un numero entero positivo para convertirlo en hexadecimal");
                hexadecimal = lecturaTeclado.nextInt();
            if (binario < 0 && octal < 0 && hexadecimal < 0) {
                System.out.println("El numero introducido es negativo, introduce un número positivo");
                break ;
            }
        } while (binario==0);
        String binaryString = Integer.toBinaryString(binario);
        System.out.printf("El valor del numero en binario es %b%n",binaryString );
        System.out.printf("El valor del numero en octal es %o%n",octal);
        System.out.printf("El valor del numero hexadecimal es %h%n",hexadecimal);





    }
}
