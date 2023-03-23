import model.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {


        do {
            Scanner lecturaTeclado = new Scanner(System.in);
            String nombre, apellido, dni, contestacion;
            int edad, telefono;
            System.out.println("Introduzca el nombre del usuario");
            nombre = lecturaTeclado.next();
            System.out.println("Introduzca los apellidos del usuario");
            apellido = lecturaTeclado.next();
            System.out.println("Introduzca el DNI del usuario");
            dni = lecturaTeclado.next();
            System.out.println("Introduzca el teléfono del usuario");
            telefono = lecturaTeclado.nextInt();
            System.out.println("Introduzca la edad del usuario");
            edad = lecturaTeclado.nextInt();
            Usuario usuario = new Usuario(nombre, apellido, dni, telefono, edad);
            agenda.add(usuario);
            System.out.println("¿Quieres seguir añadiendo?");
            contestacion=lecturaTeclado.next();
        }while();

        Usuario usuario = new Usuario("Hector", "Prieto","95142635S", 856412625,23);
        System.out.println(usuario);


    }


}
