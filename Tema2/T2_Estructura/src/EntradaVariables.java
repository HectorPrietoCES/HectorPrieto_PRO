public class EntradaVariables {
    // control + D copiar linea

    public static void main(String[] args) {

        System.out.println("Tipos de variable");
        // palabras -> String siempre ""
        // si no tiene valor asignado es null
        // String es una clase de java, la primera en MAYUS, variable compleja
        String nombre = "Héctor";
        String apellido = "Prieto";
        // letra -> char (character) se pone entre '' no ""
        // si no tiene valor de -1
        // variable compleja

        /*/ todas las variables primitivas de abajo se pueden hacer complejas
        poniendo la primera en mayus y poniendo la palabra entera
         */
        char grupoSang = 'a';
        // números-> int(entero)
        // byte(-128 al 128), short (números pequeños)
        // no le doy valor es 0
        // variable primitiva en MINÚSCULA
        int edad = 23;
        // números con decimales y grandes-> double y float
        // si no tiene valor es 0.0
        // variable primitiva
        double peso = 74.2;
        // verdadero / falso --> true false
        // boolean si no le doy valor será 'flase'
        // variable primitiva
        boolean aprobado = true;

        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(edad);
        System.out.println(grupoSang);
        System.out.println(aprobado);
        System.out.println(peso);

        //r las vqariables primiritvas van en mis
        /*Crear un metodo que se llame saludar y crear variables que guarden
        * con el nombre, apellido edad y salga por consola el saludo:
            hola hector prieto, tienes 38 años y estas en la clase de programación
         */

        valoresMaxMin();
    }

    public static void valoresMaxMin() {
        //r obtener los valores max y min de cada uno de los tipos
        //r int float double short byte

        byte numeroByte = 9;
        short numeroShort = 9000;
        int numeroInt = 100000;
        long numeroLong = 234567;
        float numeroFloat;

        //r sacar max y min de todas las variables
        //r         MAX         MIN
        //r Integer 2345        34567
        //r Double  45678       23456
        System.out.println("        byte");
        byte maxValor = Byte.MAX_VALUE;
        byte minValor = Byte.MIN_VALUE;
        System.out.println("Valor max: " + maxValor);
        System.out.println("Valor min: " + minValor);

        System.out.println("        short");
        short maxValorshort = Short.MAX_VALUE;
        short minValorshort = Short.MIN_VALUE;
        System.out.println("Valor max:" + maxValorshort);
        System.out.println("Valor min:" + minValorshort);

        System.out.println("        int");
        int maxValorint = Integer.MAX_VALUE;
        int minValorint = Integer.MIN_VALUE;
        System.out.println("Valor max:" + maxValorint);
        System.out.println("Valor min:" + minValorint);

        System.out.println("        long");
        long maxValorlong = Long.MAX_VALUE;
        long minValorlong = Long.MIN_VALUE;
        System.out.println("Valor max:" + maxValorlong);
        System.out.println("Valor min:" + minValorlong);

        System.out.println("        float");
        float maxValorfloat = Float.MAX_VALUE;
        float minValorfloat = Float.MIN_VALUE;
        System.out.println("Valor max;" + maxValorfloat);
        System.out.println("Valor min;" + minValorfloat);


        System.out.println("          \t\tMax                                     \t\t\t\t\t\t\tMin");
        System.out.println("byte");
        System.out.printf("\t\t \t\t%d\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%d\n",maxValor ,minValor);
        System.out.println("short");
        System.out.printf("     \t\t\t%d                                  \t\t\t\t\t\t\t%d\n" ,maxValorshort ,minValorint);
        System.out.println("int");
        System.out.printf("     \t\t%d                             \t\t\t\t\t\t\t\t%d\n" ,maxValorint ,minValorint);
        System.out.println("long");
        System.out.printf("     \t%d                  \t\t\t\t\t\t\t\t\t%d\n" ,maxValorlong ,minValorlong);
        System.out.println("float");
        System.out.printf("     %f                   \t\t\t%f\n" ,maxValorfloat ,minValorfloat);

    }
}