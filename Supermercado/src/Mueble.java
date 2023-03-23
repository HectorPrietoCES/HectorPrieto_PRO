public class Mueble extends Producto{
    private String descripcion;

    public Mueble() {
    }

    public Mueble(String nombre, int precio, String descripcion) {
        super(nombre, precio);
        this.descripcion = descripcion;
    }
}
