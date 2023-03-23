package model;

public class Usuario {

    private String nombre, apellido,dni;
    private int telefono, edad;

    public Usuario(String nombre, String apellido, String dni, int telefono, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre + '\n' +
                " Apellidos = " + apellido + '\n' +
                " DNI = " + dni + '\n' +
                " Teléfono = " + telefono +
                " Edad = " + edad;

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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
