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
        // variable primitiva
        char grupoSang = 'a';
        // números-> int(entero)
        // byte(-128 al 128), short (números pequeños)
        // no le doy valor es 0
        // variable primitiva en minúscula
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

        /*Crear un metodo que se llame saludar y crear variables que guarden
        * con el nombre, apellido edad y salga por consola el saludo:
            hola hector prieto, tienes 38 años y estas en la clase de programación
         */

    }
}
