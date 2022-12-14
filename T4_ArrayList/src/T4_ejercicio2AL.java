import java.util.ArrayList;
import java.util.Scanner;

public class T4_ejercicio2AL {

    public static void main(String[] args) {
        Scanner lecturaTelcado = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int n1 = 0, suma = 0, max = 0, min = 101;
        double media = 0;

        for (int i = 0; i < 10; i++) {
            n1 = (int) (Math.random() * 101);
            numeros.add(n1);
        }

        for (Integer item: numeros) {
            suma+=item;
            if (item >max){
                max=item;
            }
            if (item<min){
                min = item;
            }
        }
        media = (double)suma / numeros.size();
        System.out.println("La suma de los numeros es " + suma);
        System.out.println("La media de los numeros es " + media);
        System.out.println("El numero maximo es " + max);
        System.out.println("El numero minimo es " + min);

    }
}
