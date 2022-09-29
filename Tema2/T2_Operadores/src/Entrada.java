public class Entrada {
    public static void main(String[] args) {
        // operarAritmeticos()
        //operarAritmeticos();
        //operadoresAsignacion();
        //operadoresRelacionales();
        operadoresLogicos();
    }

    private static void operarAritmeticos() {
        int numeroUno = 0;
        //monarios
        // ++ incremento en 1 a la variable que se aplique
        // -- decremento en 1 a la variable que se aplique
        // -  cambio de signo
        numeroUno++; //1
        numeroUno++; //2
        numeroUno++; //3
        numeroUno++; //4
        System.out.println("El valor del numero es: " + numeroUno);
        numeroUno = -8;
        numeroUno--; //-9
        numeroUno--; //-10
        System.out.println("El valor del numero es: " + numeroUno);
        // solo util con una asignación -numeroUno; //r -2
        // binarios
        numeroUno = 5;
        int numeroDos = 10;

        // suma +
        int suma = numeroUno + numeroDos;
        System.out.printf("La suma entre %d y %d es %d%n", numeroUno, numeroDos, suma); // ,suma o ,numeroUno+numeroDos

        // resta -
        int resta = numeroUno - numeroDos;
        System.out.printf("La resta entre %d y %d es %d%n", numeroUno, numeroDos, resta);

        //multiplicación *
        int multiplicación = numeroUno * numeroDos;
        System.out.printf("La multiplicación entre %d y %d es %d%n", numeroUno, numeroDos, multiplicación);

        // division /         al ser un numero con decimales no es int es float o double y "f" en vez de "d"
        // con los (float) o (double) antes de los numeros se hace una conversión
        float división = (float) numeroUno / (float) numeroDos;
        System.out.printf("La division entre %d y %d es %.2f%n", numeroUno, numeroDos, división);

        // restp - módulo %
        int modulo = numeroUno % numeroDos;
        System.out.printf("Módulo entre %d y %d es %d%n", numeroUno, numeroDos, modulo);

    }

    public static void operadoresAsignacion() {
        // asignacion =
        int numeroUno = 10, numeroDos = 20;

        numeroUno += numeroDos;
        System.out.printf("El valor de n1 es %d%n", numeroUno);
        // +=
        System.out.println(numeroUno);

        numeroUno -= 6;  // numero1 = 30 - 6 //numero1 = 24
        System.out.printf("El valor de n1 es %d%n", numeroUno);

        // -=
        numeroUno -= numeroDos;
        System.out.printf("El valor de n1 es %d%n", numeroUno);

        // *=
        numeroUno *= 2; //numero1= 24 * 2
        System.out.printf("El valor de n2 es %d%n", numeroUno);

        // /=
        numeroUno /= 2; // numero1 48/2
        System.out.printf("El valor de 1 es %d%n", numeroUno);

        // %=
        numeroUno %= 5; // numero 1=24%5
        System.out.printf("El valor de n1 es %d%n", numeroUno);

    }

    public static void operadoresRelacionales() {

        // relacionales o de comparación --> ture o false
        int numeroUno = 10, numeroDos = 9;
        boolean resultado; // false hasta que se demuestre lo contrario siempre

        // n1 > n2 --> ¿El numero 1 es mas grande que el numero 2?
        resultado = numeroUno > numeroDos;
        System.out.printf("El resultado de comparar (>) %d con el %d es %b%n", numeroUno, numeroDos, resultado);

        numeroUno = 10;
        numeroDos = 10;
        // >=
        resultado = numeroUno >= numeroDos;
        System.out.printf("El resultado de comparar (>=) %d con el %d es %b%n", numeroUno, numeroDos, resultado);

        numeroUno = 19;
        numeroDos = 10;
        // <
        resultado = numeroUno < numeroDos;
        System.out.printf("El resultado de comparar (<) %d con el %d es %b%n", numeroUno, numeroDos, resultado);

        numeroUno = 9;
        numeroDos = 10;
        // <=
        resultado = numeroUno <= numeroDos;
        System.out.printf("El resultado de comparar (<=) %d con el %d es %b%n", numeroUno, numeroDos, resultado);

        numeroUno = 10;
        numeroDos = 10;
        // ==
        resultado = numeroUno == numeroDos;
        System.out.printf("El resultado de comparar (==) %d con el %d es %b%n", numeroUno, numeroDos, resultado);

        numeroUno = 10;
        numeroDos = 10;
        // !=
        resultado = numeroUno != numeroDos;
        System.out.printf("El resultado de comparar (!=) %d con el %d es %b%n", numeroUno, numeroDos, resultado);

        numeroUno = 7;
        numeroDos = 10;
        // !
        resultado = !(numeroUno < numeroDos); // poner la ! delante cambia la operacion
        System.out.printf("El resultado de comparar (!) %d con el %d es %b%n", numeroUno, numeroDos, resultado);


    }

    public static void operadoresLogicos() {
        // los logicos juntas condiciones (trues y falses)
        /*/ && (puerta logica AND)  OP OP (operador) (true o false) T+T ; T+F ; F+T; F+F, R= T ; F ; F ; F
            || (puerta logica OR) OP OP ; T+T ; T+f; F+T; F+F ;  T; T; T;
         */
    }

}
