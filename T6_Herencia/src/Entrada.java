import model.Coche;
import model.Deportivo;
import model.Todoterreno;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        Todoterreno todoterreno = new Todoterreno("T1", "MT1", "4x4");
        /*todoterreno.mostrarDatos();
        todoterreno.encender();
        todoterreno.mostrarDatos();*/

        Deportivo deportivo = new Deportivo ("D1","MD1",  400, 500);
        /*deportivo.encender();
        deportivo.mostrarDatos();*/

        ArrayList<Coche> listaCoches = new ArrayList<Coche>();
        listaCoches.add(todoterreno);
        listaCoches.add(deportivo);

        for (Coche item : listaCoches){
            item.mostrarDatos();
        }
    }
}
