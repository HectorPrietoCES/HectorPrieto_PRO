public class EjercicioSaludo {

    public static void main(String[] args) {
        // esto es lo que ejecuta el run del programa
        realizarSaludo();

    }
    public static void realizarSaludo(){
        // esto es lo que llama el void main de arriba para que se ejecute
        //String saludo = "Hola";
        // no hace falta hacer un string si pones "" entre los parentesis
        String nombre = "Héctor";
        String apellido = "Prieto,";
        String tener = "tengo";
        int edad = 23;
        String años = "años";
        String frase = "y estas en la clase de programación";

        /*/ println (el ln hace el salto de linea) y \t hace un tab a lo escrito dentro del ()
        y \n hace el print ln al final del ()
        sout es el normal y souf es el formateado
         */
        System.out.println("Hola soy "+nombre+" "+apellido+" "+tener+" "+edad+" "+años+ " y estoy en la clase de programación");

        System.out.printf("Hola soy %s %s %s %d %s y estoy en la clase de programación\n",nombre ,apellido ,tener ,edad ,años);

        System.out.println("Hola soy "+nombre+" "+apellido+" "+tener+" "+edad+" "+años+ " y estoy en la clase de programación");

    }


}
