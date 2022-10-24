import java.util.Scanner;

public class EjercicioTres {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);

        System.out.printf("El precio del coche es:%n");
        Double preciocoche = lecturaTeclado.nextDouble();
        System.out.printf("¿En cuantos plazos vas a pagar el coche?%n");
        Double plazoscoche = lecturaTeclado.nextDouble();

        Double pagarcoche = preciocoche/plazoscoche;
        System.out.printf("Vas a pagar el coche de %.2f en %.0f meses, con un total de %.2f cada plazo" +
                " (sin tener en cuenta los intereses)%n",preciocoche ,plazoscoche ,pagarcoche);


        double interes = 3.5;
        double formula = (interes*preciocoche)/100;
        double preciocoche1 = preciocoche - 5000;
        System.out.printf("El interes pagado (%.1f) en el primer mes es de %.2f -> %.1f de %.2f%n",interes ,formula ,interes ,preciocoche);
        double interes2 = 2*(3.5);
        double formula2 = (interes2*preciocoche1)/100;
        double preciocoche2 = preciocoche - 10000;
        System.out.printf("El interes pagado (%.1f) en el primer mes es de %.2f -> %.1f de %.2f%n",interes2 ,formula2 ,interes2 ,preciocoche1);
        double interes3 = 3*(3.5);
        double formula3 = (interes3*preciocoche2)/100;
        double preciocoche3 = preciocoche - 15000;
        System.out.printf("El interes pagado (%.1f) en el primer mes es de %.2f -> %.1f de %.2f%n",interes3 ,formula3 ,interes3 ,preciocoche2);
        double interes4 = 4*(3.5);
        double formula4 = (interes4*preciocoche3)/100;
        double preciocoche4 = preciocoche - 20000;
        System.out.printf("El interes pagado (%.1f) en el primer mes es de %.2f -> %.1f de %.2f%n",interes4 ,formula4 ,interes4 ,preciocoche3);
        double interes5 = 5*(3.5);
        double formula5 = (interes5*preciocoche4)/100;
        double preciocoche5 = preciocoche - 25000;
        System.out.printf("El interes pagado (%.1f) en el primer mes es de %.2f -> %.1f de %.2f%n",interes5 ,formula5 ,interes5 ,preciocoche4);
        double interes6 = 6*(3.5);
        double formula6 = (interes6*preciocoche5)/100;
        double preciocoche6 = preciocoche - 30000;
        System.out.printf("El interes pagado (%.1f) en el primer mes es de %.2f -> %.1f de %.2f%n",interes6 ,formula6 ,interes6 ,preciocoche5);



    }
}
