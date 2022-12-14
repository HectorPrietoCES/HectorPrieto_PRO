import java.util.ArrayList;
import java.util.Scanner;

public class T4_ejercicio3AL {

    public static void main(String[] args) {

        ArrayList<String> nombresClase = new ArrayList<String>();
        Scanner lecturaTeclado = new Scanner(System.in);
        String parar = "stop";

        for (int i = 0; i < 100; i++) {
            System.out.println("Introduce el nombre de tus compañeros de clase, para finalizar escriba stop");
            nombresClase.add(lecturaTeclado.next());
            if (lecturaTeclado.next().equals(parar)){
                break;
            }
        }

        int aleatorio = (int)(Math.random()* nombresClase.size());
        System.out.println("El nombre aleatorio de clase es "+nombresClase.get(aleatorio));
    }
}
