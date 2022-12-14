public class Ejercicio2 {

    public static void main(String[] args) {

        int max = 20; int min = 0;
        double[] array = {Math.random() * 21, Math.random() * 21, Math.random() * 21, Math.random() * 21, Math.random() * 21
                , Math.random() * 21, Math.random() * 21, Math.random() * 21, Math.random() * 21, Math.random() * 21,};

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= max){
                System.out.println("El numero " +array[i]+ " es el mas grande");
            }
        }


    }
}
