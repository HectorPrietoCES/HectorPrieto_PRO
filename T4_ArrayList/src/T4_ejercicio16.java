import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class T4_ejercicio16 {
    public static void main(String[] args) {

        ArrayList<Object[]> listaCoches = new ArrayList<Object[]>();
        Object[] coche1 = new Object[]{"Ford", "Fiesta", 10000, "7458LKL"};
        listaCoches.add (new Object[]{"Ford", "Fiesta", 10000, "7458LKL"});

        int opcion = 0;
        do {
            System.out.println("1. Añadir coche");
            System.out.println("2. Listar coches");
            System.out.println("3. Buscar coche");
            System.out.println("4. Mostrar costes");
            System.out.println("5. Eliminar coche");
            System.out.println("6. Vaciar garaje");
            System.out.println("7. Salir");
            System.out.println("Que quieres hacer");
            opcion = new Scanner(System.in).nextInt();

            switch (opcion) {
                case 1:
                    aniadir16(listaCoches);
                    break;
                case 2:
                    listar16(listaCoches);
                    break;
                case 3:
                    matricula16(listaCoches);
                    break;
                case 4:
                    coste16(listaCoches);
                    break;
                case 5:
                    //listaCoches.clear();
                    System.out.println("Introduce marca que quieras borrar:");
                    String marcaBorrar = new Scanner(System.in).next();
                    borrar16(listaCoches, marcaBorrar);
                case 6:
                    System.out.println("Se va a vaciar el garaje...");
                    for (int i = 0; i < listaCoches.size(); i++) {
                        listaCoches.remove(i);
                    }
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta, intentalo de nuevo");
            }
        } while (opcion != 8);
    }

    public static void aniadir16(ArrayList<Object[]>listarCoches) {
        System.out.println("Introduce marca:");
        String marca = new Scanner(System.in).next();
        System.out.println("Introduce modelo:");
        String modelo = new Scanner(System.in).next();
        System.out.println("Introduce el precio del coche");
        Integer precio = new Scanner (System.in).nextInt();
        System.out.println("Introduce la matricula");
        String matricula = new Scanner(System.in).next();
        listarCoches.add(new Object[]{marca, modelo, precio, matricula});

    }

    public static void listar16(ArrayList<Object[]> listarCoches) {

        for (int i = 0; i < listarCoches.size(); i++) {
            System.out.println("Marca-> " + listarCoches.get(i)[0] + " Modelo-> " + listarCoches.get(i)[1] + " Precio-> " + listarCoches.get(i)[2] + "Matricula-> " +listarCoches.get(i)[3]);
        }
    }

    public static void matricula16(ArrayList<Object[]> listarCoches) {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduce la matricula del coche que quieres buscar");
        String busquedaMatricula = lecturaTeclado.next();

        for (Object[] item : listarCoches) {
            if (((String) item[0]).equalsIgnoreCase(busquedaMatricula)) {
                System.out.println("Marca ->"+item[0]);
                System.out.println("Modelo ->"+item[1]);
                System.out.println("Precio ->"+item[2]);
                System.out.println("Matricula ->"+item[3]);
            } else {
                System.out.println("No se encuentra la matricula en la lista");
                break;
            }
        }
    }

    public static void borrar16(ArrayList<Object[]> lista, String marca) {

        for (int i = 0; i < lista.size(); i++) {
            if (((String)lista.get(i)[0]).equalsIgnoreCase(marca)){
                lista.remove(i);
            }
        }
    }

    public static void coste16(ArrayList<Object[]> listarCoches) {
        int suma = 0;
        for (int i = 0; i < listarCoches.size(); i++) {
            suma += (int)listarCoches.get(i)[2];
        }
        System.out.println("El coste total de los vehiculos del garaje es -> " +suma);
    }
}

