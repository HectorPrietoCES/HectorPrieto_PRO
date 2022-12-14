import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        //creacionArrays();
        //accesoArray();
        //accesoArrayPalabras();
        //ejercicioUnoArrays();
        //busquedaArrays();
        //ejercicioCuatroArrays();
        //ejercicio4Arrays();
        //ejercicio5Arrays();
        //ejercicioSumaArrays();


    }

    public static void ejercicio4Arrays() {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < 20; i++) {
            numero[i] = (int) (Math.random() * 101);
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = cuadrado[i] * numero[i];
        }
        System.out.println("numero            cuadrado            cubo");
        for (int i = 0; i < 20; i++) {

            System.out.printf(" %d           │    %d          │ %d\n", numero[i], cuadrado[i], cubo[i]);

        }


    }

    public static void ejercicio5Arrays() {

        int[] numero = new int[20];

        for (int i = 0; i < 20; i++) {
            numero[i] = (int) (Math.random() * 31);
            if (numero[i] == 6) ;
            {
                numero[i] = 8;
                System.out.println(numero[i]);
            }
            if (numero[i] == 7) ;
            {
                numero[i] = 15;
                System.out.println(numero[i]);
            }
            if (numero[i] == 20) ;
            {
                numero[i] = 10;
                System.out.println(numero[i]);
            }
        }
    }

    public static void ejercicioCuatroArrays() {
            /*realiza una app que simule el funcionamiento de la primitiva
            elegir 5 numeros para jugar [5,34,78,65,86]--> los numeros estan entre 0-99
            si sale algun numero fuera de rango el sistema pedirá otro
            una vez esten los numeros elegidos el sistema muestra el cupon
            1: 5
            2: 34
            3: 78
            4: 65
            5: 86
        el sistema genera 5 numeros premiados [6,67,23,65,5]
        el sistema evalua cual es el premio que me ha tocado :
        0 aciertos -> 0 euros
        1 acierto -> 10 euros
        2 aciertos -> 100 euros
        3 aciertos -> 1000 euros
        4 aciertos -> 10000 euros
        5 aciertos 100000 euros
        ud ha ganado x euros
             */

        Scanner lecturaTeclado = new Scanner(System.in);
        double numerosPremiados = Math.random() * 99;

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el numero para jugar " + (i + 1));
            int cuponUsuario = lecturaTeclado.nextInt();
            do {
                System.out.println("Introduce un número valido entre 0 y 99");
            } while (cuponUsuario > 0 || cuponUsuario < 99);


        }


    }


    public static void busquedaArrays() {

        //buscar la/s palabra que tiene/s 2 letras
        //en el momento que se encuentre una, parar la busqueda
        //el sistema dira en que posicion se encuentra la palabra
        String[] palabras = new String[]{"hola", "adios", "estoy", "en", "la", "clase", "programación", "java", "arrays"};
        /*for (String item:palabras) {
            System.out.println(item);
        }*/

        int contador = 0;
        int contadorPosicion = 0;
        for (String item : palabras) {
            if (item.length() == 2) {
                System.out.println(item);
                contador++;
                contadorPosicion++;
                break;
            }
            contadorPosicion++;
        }


    }

    private static void creacionArrays() {
        //array de numeros
        int[] numeros = new int[10];
        // 0 0 0 0 0 0 0 0 0 0
        int[] numerosIniciados = new int[]{1, 2, 3, 4, 5, 6};
        // 1 2 3 4 5 6
        boolean[] booleanos = new boolean[5];
        // false false false false false
        boolean[] booleanIniciados = new boolean[]{true, false, true};
        // true false true
        String[] palabras = new String[5];
        // null null null null null
        String[] palabrasIniciadas = new String[]{"uno", "dos", "tres"};
        // uno dos tres

        Object[] elementosGenericos = new Object[]{1, false, "palabra", 'A', 0.0};


    }

    private static void operacionesArray() {
        int aleatorio = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]= (int) (Math.random() * 10);

        }

        for (int item : array) {
            System.out.println(array +", ");
        }

    }

    private static void ejercicioSumaArrays() {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("introduzca un la longitud de los array");
        int longitud = lecturaTeclado.nextInt();

        int[] arrayUno = new int[longitud];
        int[] arrayDos = new int[longitud];
        int[] arrayTres = new int[longitud];

        arrayUno = rellenarArray(arrayUno);
        arrayDos = rellenarArray(arrayDos);

        for (int i = 0; i < longitud; i++) {
            arrayTres[i] = arrayUno[i] + arrayDos[i];
        }


        System.out.println("Array 1");
        imprimirArrayEj(arrayUno);
        System.out.println("Array 2");
        imprimirArrayEj(arrayDos);
        System.out.println("resultado");
        imprimirArrayEj(arrayTres);
    }

    private static int[] rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int aleatorio = (int) (Math.random() * 10) + 1;
            array[i] = aleatorio;

        }
        return array;
    }

    private static void imprimirArrayEj(int[] array) {
        for (int item : array) {
            System.out.println(item);
        }
    }

    private static void accesoArray() {
        int[] numeros = new int[]{31, 564, 14, 35, 1, 9, 5, 6, 254, 365, 87, 43, 64};
        int lecturaPosicion = numeros[numeros.length - 1];
        System.out.println(lecturaPosicion);
        for (int i = 0; i < numeros.length; i++) {
            //if (i%2==0) {
            //  System.out.println(numeros[i]);
            //}
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }

        }

    }

    public static void accesoArrayPalabras() {
        String[] palabras = new String[]{"palabraUno", "palabraDos", "palabraTres"};
        System.out.println(palabras[1].length());
        /*for (int i = 0; i < palabras.length/2; i++) {
            System.out.println(palabras[i]);

        }*/
        for (String element : palabras) {
            System.out.println(element);
        }
    }

    public static void ejercicioUnoArrays() {
        /*
        1.-Crea un array de 10 numeros con los valores que quieras
        .-saca la media de los numeros
        .-saca el numero mas grande
        .-saca el numero mas pequeño
        2.-Crear un array con las letras del abecedario
        -.sacar 5 palabras aleatorias de 5 letras (palabra1=AGADFG)(palabra2=YVFBV)
         */

        int[] numeros = new int[]{5, 4, 78, 12, 35, 6, 8, 56, 97, 854};

        int sumaNumeros = 0;
        int mayor = 0;
        int menor = 1000000;
        for (int element : numeros) {
            sumaNumeros += element;
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("La media de los numeros seleccionados es:" + sumaNumeros / numeros.length);
        System.out.println("El numero mas grande de los numeros seleccionados es:" + mayor);
        System.out.println("El numero mas pequeño de los numeros seleccionados es:" + menor);


        char[] abecedario = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'y', 'z'};

        String palabraUno = "";
        String palabraDos = "";
        String palabraTres = "";
        String palabraCuatro = "";
        String palabraCinco = "";
        for (int i = 0; i < 5; i++) {
            int aleatorio = (int) (Math.random() * abecedario.length + 1);
            char letra = abecedario[aleatorio];
            palabraUno += letra;
        }

        System.out.println(palabraUno);
    }


}















