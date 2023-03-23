public class Ropa extends Producto{
    private int talla;

    public Ropa() {
    }

    public Ropa(String nombre, int precio, int talla) {
        super(nombre, precio);
        this.talla = talla;
    }
}
