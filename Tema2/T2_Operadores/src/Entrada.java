import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        //operarAritmeticos();
        //operarAritmeticos();
        //operadoresAsignacion();
        //operadoresRelacionales();
        //operadoresLogicos();
        //metodoSinRetorno();
        //metodoConRetorno();

        //metodos:sumar,restar,multiplicar,dividir y modular
        //dentro de cada uno de los metodos definir los operandos
        //retornan un numero

        //El resultado de la suma es XXXX

        /*System.out.printf("El resultado de la suma es %d%n", suma());
        System.out.printf("El resultado de la resta es %d%n", resta());
        System.out.printf("El resultado de la multiplicación es %d%n", multiplicacion());
        System.out.printf("El resultado de la division es %d%n", division());
        System.out.printf("El resultado del modular es %d%n", modular());*/

        //metodoConParametros("Hector", 23);
        //System.out.println("Otra ejecucion del metodo");
        //metodoConParametros("Pepe", 8);
        // en el main se definen 2 operadores
        // en los metodos s,r,m,d,m pero los operadores son los que me da el main
        /*System.out.printf("El resultado de la suma es %d%n", metodoSuma(2,2));
        System.out.printf("El resultado de la resta es %d%n", metodoResta(2,2));
        System.out.printf("El resultado de la multiplicacion es %d%n", metodoMultiplicacion(2,2));
        System.out.printf("El resultado de la division es %d%n", metodoDivision(2,2));
        System.out.printf("El resultado de la modulo es %d%n", metodoModulo(2,2));*/

        // Scanner --> complejo --> muchas funionalidades
        // Tipo nombre = new Tipo()

        //String nombre = new String(original="gsdfgsdfg");
        Scanner lecturaTeclado = new Scanner(System.in); //null
        System.out.println("Por favor introduce el numero que quieres leer");
        int numeroLeido = lecturaTeclado.nextInt();
        System.out.println("El numero leido es :"+numeroLeido);

        // realizar las operaciones matematicas donde se pida por teclado los operandos que necesito en cada operacion
        // crear un metodo que se llame saludar() +nombre apellidos y saludar
        // introduce tu nombre
        // introduce tu apellido
        // introduce tu edad
        // bienenido a la clase de programacion, los datos pasados son
        // nombre xxx
        // apellido xxx
        //edad xxx


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
        int numeroUno = 10, numeroDos = 6, numeroTres = 3;
        boolean acierto = false, resultado; //resultado = false
        String nombre; // se inicializa a null

        resultado = (numeroDos < 6) || (numeroTres != numeroUno) || numeroUno > 10;
        //              False                   True                False       = TRUE
        System.out.printf("El resultado de la sentencia lógica es %b%n", resultado);

        resultado = numeroUno > 0 && numeroTres < numeroDos && !acierto;
        //                True                 True             True    = TRUE
        System.out.printf("El resultado de la sentencia lógica es %b%n", resultado);

        // mod_acceso (public, protectec, private)
        // static es un acceso directo
        // void  --> retorno vacío: solo ejecuta lo que esta definido dentro
        // int,double,string,float,boolean,cualquier tipo --> retorno tipo: se ejecutan tod0 lo que hay en el metodo y al final me da un resultado
        // si tiene retorno, la ultima palabra del metodo es return

        // public static void metodoSinRetorno () {
        System.out.printf("Esto es un metodo que no tiene retorno");
        System.out.printf("Solo tiene ejecuciones");
        //public static int metodoConRetorno () {
    }
    //metodos:sumar,restar,multiplicar,dividir y modular
    //dentro de cada uno de los metodos definir los operandos
    //retornan un numero

    //El resultado de la suma es XXXX

    public static int suma() {
        int numeroUno = 2, numeroDos = 3;
        int resultado = numeroUno + numeroDos;
        return resultado;
    }

    public static int resta() {
        int numeroUno = 1, numeroDos = 2;
        int resultado = numeroDos - numeroUno;
        return resultado;
    }

    public static int multiplicacion() {
        int numeroUno = 2, numeroDos = 2;
        int resultado = numeroUno * numeroDos;
        return resultado;
    }

    public static int division() {
        int numeroUno = 5, numeroDos = 5;
        int resultado = numeroUno / numeroDos;
        return resultado;
    }

    public static int modular() {
        int numeroUno = 10, numeroDos = 2;
        int resultado = numeroUno % numeroDos;
        return resultado;
    }
    // tipo nombreTemporal, tipo nombreTemporal
    public static void metodoConParametros(String nombre, int numero){
        System.out.printf("El nombre pasado es %s%n",nombre);
        System.out.printf("El numero pasado es %d%n",numero);
    }

    // en el main se definen 2 operadores
    // en los metodos s,r,m,d,m pero los operadores son los que me da el main

    public static int metodoSuma(int numeroUno, int numeroDos){
        return numeroUno + numeroDos;
    }
    public static int metodoResta(int numeroUno, int numeroDos){
        return numeroUno - numeroDos;
    }
    public static int metodoMultiplicacion(int numeroUno, int numeroDos){
        return numeroUno * numeroDos;
    }
    public static int metodoDivision(int numeroUno, int numeroDos){
        return numeroUno / numeroDos;
    }
    public static int metodoModulo(int numeroUno, int numeroDos){
        return numeroUno % numeroDos;
    }
}




