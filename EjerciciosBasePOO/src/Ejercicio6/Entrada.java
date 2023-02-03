package Ejercicio6;

public class Entrada {

    public static void main (String[] args ){
         Equipo e1 = new Equipo("Madrid");
         Equipo e2 = new Equipo("Barsa");

        for (int i = 0; i < 3; i++) {
            e1.atacar();
            e2.atacar();
        }
        System.out.printf("El resultado es EquipoA %d EqiuipoB %d" ,e1.getGoles(),+e2.getGoles());
    }
}
