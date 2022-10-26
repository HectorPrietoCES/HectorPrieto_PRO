import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduzca un numero del 0 al 100");
        int numero1 = lecturaTeclado.nextInt();
        int numeros= 0;


        do {
            System.out.println("Introduzca un numero del 0 al 100");
            numero1 = lecturaTeclado.nextInt();
            //numeros=numeros+numero1;

            if (numero1 >= 0 && numero1 <= 100) {
                //System.out.println("Introduzca un numero del 0 al 100");
            } else {
                System.out.println("El valor introducido no se encuentra entre el 0 y el 100");
            }

        } while (numero1 >= 0 && numero1 <= 100);

        System.out.println("Los numeros introducidos son: "+numero1); //no se poner los numeros que se piden
        System.out.println("El numero mas grande introducido es: ");
    }
}
