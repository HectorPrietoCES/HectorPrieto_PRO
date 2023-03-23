import java.io.*;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduce el nombre del jugador");
        String jugador = lecturaTeclado.next();
        int numeroRandom = (int)(Math.random()*21);
        int numeroElegido, contador=0;
        File file = new File("src/ejemplo.txt");
        FileWriter fileWriter = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        System.out.println(numeroRandom);

        do {
            System.out.println("Introduzca el numero");
            numeroElegido = lecturaTeclado.nextInt();
            contador++;
        } while(numeroRandom!=numeroElegido);

        try {
            FileWriter fr = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
