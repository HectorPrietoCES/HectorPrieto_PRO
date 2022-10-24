import java.util.Scanner;

public class IMCswtich {

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

        switch (sexo){
            case "Masculino":
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
                }
                break;
            case "Femenino":
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
                    break;




            }
        }
    }
