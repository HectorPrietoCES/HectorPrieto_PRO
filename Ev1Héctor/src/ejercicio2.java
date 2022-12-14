public class ejercicio2 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 101);
            System.out.println("Los numeros del array son : " + numero[i]);
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = numero[i] * numero[i] * numero[i];
            System.out.println("Su cuadrado es "+cuadrado[i]);
            System.out.println("Su cubo es "+cubo[i]);

            }

    }


}

