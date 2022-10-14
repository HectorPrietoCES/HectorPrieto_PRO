import java.io.PrintStream;
import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.printf("¿Como te llamas?%n", lecturaTeclado);
        String nombre = lecturaTeclado.next();

        System.out.printf("¿Cuantos años tienes?%n");
        double edad = lecturaTeclado.nextDouble();

        System.out.printf("¿Cuanto pesas?%n");
        double peso = lecturaTeclado.nextDouble();

        System.out.printf("¿Cuanto mides? ej:1,65%n");
        double altura = lecturaTeclado.nextDouble();

        System.out.printf("Masculino - Femenino%n");
        String sexo = lecturaTeclado.next();

        Double IMC = (peso / (altura * altura));
        System.out.printf("Tu IMC es %.2f%n", IMC);

        if (sexo == "Masculino" ) {


            if (IMC < 18.5) {
                System.out.println("Tu IMC indica que tu peso es bajo");
            } else if (IMC > 18.5 && IMC < 24.9) {
                System.out.println("Tu IMC indica que tu peso es normal");
            } else if (IMC > 25.0 && IMC < 29.9) {
                System.out.println("Tu IMC indica que tu peso esta entre pre-obesidad o sobrepeso");
            } else if (IMC > 30.0 && IMC < 34.9) {
                System.out.println("Tu IMC indica que te encuentras en obesidad clase I");
            } else if (IMC > 35.0 && IMC < 39.9) {
                System.out.println("Tu IMC indica que te encuentras en obesidad clase II");
            } else if (IMC > 40) {
                System.out.println("Tu IMC indica que te encuentras en obesidad clase III");


            } else if (sexo == "Femenino") {
                if (IMC < 16.5) {
                    System.out.println("Tu IMC indica que tu peso es bajo");
                } else if (IMC > 16.5 && IMC < 22.9) {
                    System.out.println("Tu IMC indica que tu peso es normal");
                } else if (IMC > 23.0 && IMC < 25.9) {
                    System.out.println("Tu IMC indica que tu peso esta entre pre-obesidad o sobrepeso");
                } else if (IMC > 26.0 && IMC < 30.9) {
                    System.out.println("Tu IMC indica que te encuentras en obesidad clase I");
                } else if (IMC > 31.0 && IMC < 33.9) {
                    System.out.println("Tu IMC indica que te encuentras en obesidad clase II");
                } else if (IMC > 34) {
                    System.out.println("Tu IMC indica que te encuentras en obesidad clase III");
                }
            }
        }
    }

/*IMC    Estado MUJERES
Por debajo de 16.5    Bajo peso
16,5–22,9    Peso normal
23.0–25.9    Pre-obesidad o Sobrepeso
26.0–30.9    Obesidad clase I
31,0–33,9    Obesidad clase II
Por encima de 34    Obesidad clase III

IMC    Estado HOMBRES
Por debajo de 18.5    Bajo peso
18,5–24,9    Peso normal
25.0–29.9    Pre-obesidad o Sobrepeso
30.0–34.9    Obesidad clase I
35,0–39,9    Obesidad clase II
Por encima de 40    Obesidad clase III

 */
}