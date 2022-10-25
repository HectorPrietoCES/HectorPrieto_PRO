import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        int menu=lecturaTeclado.nextInt();
        do {
            switch (menu) {
                case 1:
                    System.out.println("SUMA");
                case 2:
                    System.out.println("RESTA");
                case 3:
                    System.out.println("DIVISION");
                case 4:
                    System.out.println("MULTIPLICACION");
                case 5:
                    System.out.println("SALIR");

                    System.out.println("Introduce un número");
                    boolean numeroUno = lecturaTeclado.nextBoolean();
                    boolean numeroDos = lecturaTeclado.nextBoolean();
            }
        } while (menu==5);

    }
}