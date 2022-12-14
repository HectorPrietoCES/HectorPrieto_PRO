import java.util.ArrayList;

public class T4_ejercicio4AL {
    public static void main(String[] args) {
        ArrayList<Integer>numero1 = new ArrayList<Integer>();
        ArrayList<Integer>numero2 = new ArrayList<Integer>();
        int n1 = 0, n2 = 0;
        int contador = 0;

        for (int i = 0; i < 20; i++) {
            numero1.add((int)(Math.random() * 21));
            numero2.add((int)(Math.random() * 21));
        }

        for (int i = 0; i < numero1.size(); i++) {
            if (numero1.get(i)==numero2.get(i)) {
                //System.out.println("Son iguales"+contador+"veces");
                contador++;
            }
        }
        System.out.println("Son iguales "+contador+" veces");

    }
}
