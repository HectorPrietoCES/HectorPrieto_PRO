import java.util.ArrayList;
import java.util.Scanner;

public class T5_ejercicio5AL {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        Scanner lecturaTeclado = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce palabras");
            palabras.add(lecturaTeclado.next());
        }

        int contadorletras = 0;
        String palabraGrande = palabras.get(0).replaceAll(" ", ""), palabraPequenia = palabras.get(0).replaceAll(" ", "");

        for (String item : palabras) {
            contadorletras += item.replaceAll(" ", "").length();
            if (item.replaceAll(" ", "").length() > palabraGrande.replaceAll(" ", "").length()) {
                palabraGrande = item;
            }
            if (item.replaceAll(" ", "").length() < palabraGrande.replaceAll(" ", "").length()) {
                palabraPequenia = item;
            }
        }
        System.out.println("La palabra mas grande es "+palabraGrande);
        System.out.println("La palabra mas pequeña es "+palabraPequenia);
        System.out.println("El numero de letras es "+contadorletras);


    }
}
