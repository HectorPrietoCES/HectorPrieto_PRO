import java.util.ArrayList;
import java.util.Scanner;

public class T4_ejercicio1AL {

    public static void main(String[] args) {

        Scanner lecturaTeclado = new Scanner(System.in);
        ArrayList <String> nombres = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce palabras");
            nombres.add(lecturaTeclado.next());
        }
        for (int i = 0; i < 1; i++) {
            String lista = nombres.get(i);
            System.out.println(lista);
        }
    }
}
