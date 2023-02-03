public class Cliente {

    String nombre;
    Object dni;

    public Cliente(String nombre, Object dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object getDni() {
        return dni;
    }

    public void setDni(Object dni) {
        this.dni = dni;
    }
}
