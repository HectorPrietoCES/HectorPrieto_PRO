package Ejercicio1y2;

public class Persona {

    private String nombre, apellido, dni;
    private int edad, altura;
    private double peso;

    public Persona(String nombre, String apellido, String dni, int edad, Integer altura, Double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public Persona(String nombre, String apellido, String dni, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        dni = "111111111X";
    }

    public Persona() {
        nombre = "por defecto";
        apellido = "por defecto";
        dni = "111111111X";
    }


    public void mostrarDatos() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);

    }

    public void incrementarEdad(int numero) {
        edad += numero;
    }

    public double IMC() {
        double imc = (altura / 100) * (altura / 100);
        return imc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}



