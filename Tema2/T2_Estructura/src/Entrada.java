public class Entrada {

    public static String miNombreClase = "HéctorP";

    // método para ver características de ámbito
    // esto es la segunda linea del comentario
    /*Esto es un comentario que me va a ocupar
    * varias líneas porque la explicación es algo
    * extensa */

    // TODO crear variables para el ámbito
    public static void metodoInicial () {
        // tipo_acceso tipo_de_la_variable nombre_de_la_variable = valor_variable
        // String guarda palabras ""
        String nombre = "Héctor";
        System.out.println(nombre);
        System.out.println(miNombreClase);
    }

    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        // ámbito de bloque o método
        String nombre="Héctor";
        String miNombre = "HéctorP";
        System.out.println("Hola Mundo");
        System.out.println(miNombre);
        System.out.println(miNombreClase);

        //ejecutar
        metodoInicial();

    }



}
