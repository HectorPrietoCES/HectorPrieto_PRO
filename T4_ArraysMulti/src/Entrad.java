import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Entrad {


    public static void main(String[] args) {

        ejercicio1();

        // tipo [] [] nombre = new tipo [5][5]
        // tipo [] [] nombre = new tipo [5][5] {{1,2,3,4},{5,6,7,0},{8,9,10,0}}
        // tipo [] [] nombre = new tipo [3][4]

        //String [][] multidimensionalArray = new String [3][3];
       /* String[][] multidimensionalArray = new String[][]{
                {"Elemento 1_1", "Elemento 1_2", "Elemento 1_3"},
                {"Elemento 2_1", "Elemento 2_2", "Elemento 2_3"},
                {"Elemento 3_1", "Elemento 3_2", "Elemento 3_3"},
                {"Elemento 4_1", "Elemento 4_2", "Elemento 4_3"},
        };
        multidimensionalArray[2][2] = "Fila 3_Columna 3";
        //System.out.println(multidimensionalArray[2][2]);
        //multidimensionalArray.lenght ---> 4
        for (int i = 0; i < multidimensionalArray.length; i++) {
            //recorrer filas
            for (int j = 0; j < multidimensionalArray[i].length; j++) {
                //recorrercolumnas
                System.out.print(multidimensionalArray[i][j] + "\t\t");
            }
            //camio de fila
            System.out.println();
        }

        */

    }


    //pidais por consola el numero de filas, el numero de columnas
    //crear un array multidimensional de numeros con los datos introducidos
    //rellenar dicho array con numeros aleatorios 0-10 (primera fila)
    //rellenar dicho array con numeros aleatorios 11-20 (segunda fila)
    //rellenar dicho array con numeros aleatorios 21-30 (tercera fila)
    //rellenar dicho array con numeros aleatorios 31-40 (cuarta fila)
    //rellenar dicho array con numeros aleatorios 41-50 (quinta fila)


    public static void ejercicio1() {
        Scanner lecturaTeclado = new Scanner(System.in);
        int filas, columnas;
        int maximo = 99, minimo=-99;
        System.out.println("Introduce el número de filas");
        filas = lecturaTeclado.nextInt();
        System.out.println("Introduce el número de columnas");
        columnas = lecturaTeclado.nextInt();
        int[][] arrayNumeros = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int numero = (int) (Math.random() * 11);
                arrayNumeros [i][j]=(int)(Math.random() * 11);
            }
        }

        for (int[] fila:arrayNumeros) {
            for (int numero :fila) {
                System.out.print(numero+"\t\t");
            }
            System.out.println(" ");
        }

        //sacar el max y min de cada fila
        //sacar el sumatorio de cada fila


    }

}
