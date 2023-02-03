package EjercicioAgenda3;

public class Persona {

    // Agregar persna . no se puede agregar una persona
    // que ya existe dentro de la agenda (con igual dni)
    // en el caso de que se agregue la persona --> true
    // en el caso de que no se agrgue la person a--> false
    // [new persona ("Hector","Prieto", 1234A, 1234)]
    // new persona ("Carlos", "Garcia", 1234B, 1342)]

    String nombre, apellido;
    int dni, telefono;

    public Persona (String nombre, String apellido, int dni, int telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;

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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
