import java.lang.reflect.Array;
import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        ClaseColeccion<Integer> claseColeccion= new ClaseColeccion(new ArrayList<Integer>());
        claseColeccion.listarElementos();
        claseColeccion.agregarElemento("Palabra");
    }
}
