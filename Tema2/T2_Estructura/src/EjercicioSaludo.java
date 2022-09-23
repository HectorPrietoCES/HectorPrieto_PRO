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

        System.out.println("Hola soy "+nombre+" "+apellido+" "+tener+" "+edad+" "+años+ " y estoy en la clase de programación");

    }
}
