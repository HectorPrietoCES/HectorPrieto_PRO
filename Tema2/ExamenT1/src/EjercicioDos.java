import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.printf("¿Como se llama tu equipo?%n");
        String participante1n = lecturaTeclado.next();
        System.out.printf("¿Cuantos jugadores tiene tu equipo?%n");
        Double participantes1j = lecturaTeclado.nextDouble();
        System.out.printf("¿Que presupuesto tiene tu equipo?%n");
        Double participantes1p = lecturaTeclado.nextDouble();
        System.out.printf("¿Como se llama tu equipo?%n");
        String participante2n = lecturaTeclado.next();
        System.out.printf("¿Cuantos jugadores tiene tu equipo?%n");
        Double participantes2j = lecturaTeclado.nextDouble();
        System.out.printf("¿Que presupuesto tiene tu equipo?%n");
        Double participantes2p = lecturaTeclado.nextDouble();
        System.out.printf("¿Como se llama tu equipo?%n");
        String participante3n = lecturaTeclado.next();
        System.out.printf("¿Cuantos jugadores tiene tu equipo?%n");
        Double participantes3j = lecturaTeclado.nextDouble();
        System.out.printf("¿Que presupuesto tiene tu equipo?%n");
        Double participantes3p = lecturaTeclado.nextDouble();

        boolean participantesNu = participantes1j >= 11;
        System.out.printf("¿El primer participante tiene 11 jugadores? %b%n", participantesNu);
        boolean participantesNu2 = participantes2j % 2 == 0;
        System.out.printf("¿El segundo participante tiene jugadores pares?%b%n", participantesNu2);
        boolean participantesNu3 = participantes3p >= 0;
        System.out.printf("¿El tercer equipo tiene presupuesto positivo? %b%n", participantesNu3);
        boolean empieza = participantesNu && participantesNu2 && participantesNu3;
        System.out.printf("La Liga esta preparada para empezar%b%n");

    }


}
