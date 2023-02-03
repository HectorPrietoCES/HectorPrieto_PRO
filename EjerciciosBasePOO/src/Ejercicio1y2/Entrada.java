package Ejercicio1y2;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner lecturaTeclado = new Scanner(System.in);
        String nombre, apellido, dni;
        int edad, altura;
        double peso;

        System.out.println("Introduce nombre:");
        nombre = lecturaTeclado.next();
        System.out.println("Introduce apellido:");
        apellido = lecturaTeclado.next();
        System.out.println("Introduce dni:");
        dni = lecturaTeclado.next();
        System.out.println("Introduce edad:");
        edad = lecturaTeclado.nextInt();
        System.out.println("Introduce altura:");
        altura = lecturaTeclado.nextInt();
        System.out.println("Introduce peso:");
        peso = lecturaTeclado.nextDouble();
 
        Persona persona1 = new Persona(nombre, apellido, dni, edad,altura,peso);
        Persona persona2 = new Persona("Hector","Prieto");
        Persona persona3 = new Persona();

        persona1.mostrarDatos();
        persona2.mostrarDatos();
        persona3.mostrarDatos();
    }
}
