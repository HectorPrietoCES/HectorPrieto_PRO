import java.util.ArrayList;
import java.util.Scanner;

public class T4_ejercicio678 {

    public static void main(String[] args) {
        ejercicio6();
    }

    public static void ejercicio6() {
        ArrayList<Object[]> listaCoches = new ArrayList<Object[]>();

        int opcion = 0;
        do {
            System.out.println("1. Agregar coche");
            System.out.println("2. Lista coche");
            System.out.println("3. Buscar marca");
            System.out.println("4. Borrar marca");
            System.out.println("5. Salir");
            System.out.println("Que quieres hacer");
            opcion = new Scanner(System.in).nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce marca:");
                    String marca = new Scanner(System.in).next();
                    System.out.println("Introduce modelo:");
                    String modelo = new Scanner(System.in).next();
                    System.out.println("Introduce CV:");
                    int cv = new Scanner(System.in).nextInt();
                    listaCoches.add(new Object[]{marca, modelo, cv});
                    break;
                case 2:
                    //ejercicio8(listaCoches);
                    break;
                case 3:
                    //ejercicio8(listaCoches);
                    break;
                case 4:
                    System.out.println("Introduce marca que quieras borrar:");
                    String marcaBorrar = new Scanner(System.in).next();
                    borrarMarca(listaCoches, marcaBorrar);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta, intentalo de nuevo");
            }
        } while (opcion != 5);


        Object[] coche1 = new Object[]{"Ford", "Fiesta", 125};
        Object[] coche2 = new Object[]{"Ford", "Focus", 160};
        Object[] coche3 = new Object[]{"Mercedes", "AMG-GTR", 300};
        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);
        ejercicio7(listaCoches);
        ejercicio8(listaCoches);
    }

    public static void ejercicio7(ArrayList<Object[]> listaCoches) {

        for (int i = 0; i < listaCoches.size(); i++) {
            System.out.println("Marca-> " + listaCoches.get(i)[0] + " Modelo-> " + listaCoches.get(i)[1] + " CV-> " + listaCoches.get(i)[2]);
        }
    }

    public static void ejercicio8(ArrayList<Object[]> listaCoches) {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduce la marca de coche que quieres buscar");
        String busquedaCoche = lecturaTeclado.next();

        for (Object[] item : listaCoches) {
            if (((String) item[0]).equalsIgnoreCase(busquedaCoche)) {
                System.out.println(item[0]);
                System.out.println(item[1]);
                System.out.println(item[2]);
            } else {
                System.out.println("No hay modelos en la lista");
                break;
            }
        }
    }

    public static void borrarMarca(ArrayList<Object[]> lista, String marca) {

        for (int i = 0; i < lista.size(); i++) {
            if (((String)lista.get(i)[0]).equalsIgnoreCase(marca)){
                lista.remove(i);
            }
        }
    }


}
