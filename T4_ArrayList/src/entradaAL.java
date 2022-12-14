import java.util.ArrayList;
import java.util.Scanner;

public class entradaAL {

    public static void main(String[] args) {

        //inicioArrayList();
        //listasTipadas();
        //ejercicioNumeros();
        listasArray();


    }

    public static void listasArray() {
        ArrayList<Object[]> listaAgenda = new ArrayList<>();
        listaAgenda.add(new Object[]{"hector", "password", 23, "correo@ces", "541235","admin"});
        listaAgenda.add(new Object[]{"borja", "dsf", 32, "correo@ces", "457412","admin"});
        listaAgenda.add(new Object[]{"rodrigo", "dasg", 35, "correo@ces", "526882","user"});
        listaAgenda.add(new Object[]{"maria", "pmj", 18, "correo@ces", "698532","user"});
        listaAgenda.add(new Object[]{"cristina", "tfgfsdg", 59, "correo@ces", "874125","admin"});
        listaAgenda.add(new Object[]{"pepe", "123456", 30, "correo@ces", "269721","user"});
        listaAgenda.add(new Object[]{"raul", "5646", 27, "correo@ces", "397125","user"});
        listaAgenda.add(new Object[]{"pedro", "fdsf", 96, "correo@ces", "488852","admin"});
        // cambiar de user(pepe) a admin algun usuario
        listaAgenda.get(6)[5] = "admin";


        /* Pedir al usuari opor teclado un nombre y una contraseña
        si el usuario no esta en la lista --> no existe el usuario
        Si el usuario esta en la lista pero su pass no es correcta ---> pass incorrecta
        Si el usuario esta en la lista y su pass es correxta pero es user -->privilegios insuficientes
        Si el usuario esta en la lista y su pass es correcta pero es admin --> acceso correcto
        */

        Scanner lecturaTeclado = new Scanner(System.in);
        String usuario, password;
        boolean user = false;
        boolean admin = true;
        System.out.println("Introduzca un nombre de usuario");
        usuario = lecturaTeclado.next();
        System.out.println("Introduzca una contraseña para el usuario");
        password = lecturaTeclado.next();


        for (Object[] usuario1: listaAgenda) {
            if (!usuario1[0].equals(usuario)){
                System.out.println("El usuario no existe");
                break;
            }
            if (!usuario1[1].equals(password)){
                System.out.println("La contraseña no coincide");
                break;
            }
            if (!usuario1[0].equals(usuario)||!usuario1[1].equals(password)|| usuario1[5]!=(Object) true){
                System.out.println("Acceso correcto");
            }else{
                System.out.println("No hay privilegios");
            }
        }




        /*for (Object[] usuario1:listaAgenda){
            if ((int)usuario1[2]<35){
                for (Object item:usuario1) {
                    System.out.println(item+" ");
                }
                System.out.println();
            }

        }*/
    }

    public static void inicioArrayList() {
        ArrayList lista = new ArrayList();
        // .size tamaño de la lista
        System.out.println(lista.size());
        // .add añade elemento
        lista.add("elemento 1");
        lista.add(12345);
        lista.add(true);
        lista.add('a');
        System.out.println(lista.size());
        // .remove eliminar elementos
        lista.remove(1);
        lista.remove(2);
        System.out.println(lista.size());
        // antes del cambio
        System.out.println("El elemento de la posicion 1 es " + lista.get(0));
        // .set cambiar en una posicion un elemento
        lista.set(0, "elemento 1.0");
        System.out.println(lista.size());
        System.out.println("El elemento de la posicion 1 es " + lista.get(0));

        /*for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }*/

        for (Object item : lista) {
            System.out.println(item);
        }
    }

    public static void listasTipadas() {

        ArrayList<String> listasPalabras = new ArrayList();
        listasPalabras.add("Hola");
        listasPalabras.add("Coche");
        listasPalabras.add("Lista");
        listasPalabras.add("Ola");
        listasPalabras.add("Ey");
        listasPalabras.add("Adios");
        Scanner lecturaTeclado = new Scanner(System.in);
        // .search buscar por palabras

        // se pide un palabra por teclado
        // se comprueba si la palabra esta en la lista

        System.out.println("Introduce la palabra para buscar");
        String palabra = lecturaTeclado.next();

        for (int i = 0; i < listasPalabras.size(); i++) {

            if (listasPalabras.contains(palabra)) {
                System.out.println("la palabra se encuentra en el array");
                break;
            } else {
                System.out.println("no se encuentra en el array");
                break;
            }

        }

    }

    public static void ejercicioNumeros() {

        // Crear unalista de numeros (solo numeros)
        // meter 50 aleatorios entre 0-20
        // Pedir al usuario un número
        // Indicar las veces que se repite dicho numero
        // Obtener primera la posicion del numero indicado
        // En el caso de que no se repita avisar al usuario
        // En el caso de que no aparecer avisar al usuario

        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner lecturaTeclado = new Scanner(System.in);
        int n1 = 0;
        int numero = lecturaTeclado.nextInt();
        int contador = 0;

        for (int i = 0; i < 50; i++) {
            n1 = (int) (Math.random() * 21);
            numeros.set(i, n1);
        }

        System.out.println("Introduzca un numero");
        numero = lecturaTeclado.nextInt();

        for (int i = 0; i < numeros.size(); i++) {

            if (numeros.contains(numero)) {
                contador++;
                System.out.println("El numero pedido se repite " + contador + " veces");
            }
        }
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.contains(numero)) {
                System.out.println("se ha repetido en la posicion ");
            }

        }

    }

}
