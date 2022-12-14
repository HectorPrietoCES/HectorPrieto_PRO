import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner lecturaTeclado = new Scanner(System.in);
        String palabraMaestra, palabraSecundaria;
        System.out.println("Introduce la palabra maestra ");
        palabraMaestra = lecturaTeclado.next();
        System.out.println("La palabra maestra es -->" +palabraMaestra);
        System.out.println("Introduce la palabra secundaria ");
        palabraSecundaria = lecturaTeclado.next();



        do {
            System.out.println("Introduce la palabra secundaria");
            palabraSecundaria = lecturaTeclado.next();
            if (palabraSecundaria == palabraMaestra){
                break;
            }
        } while (palabraSecundaria != palabraMaestra);


    }
}
