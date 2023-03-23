public class Alimento extends Producto {
    private int calorias;

    public Alimento() {
    }

    public Alimento(String nombre, int precio, int calorias) {
        super(nombre, precio);
        this.calorias = calorias;
    }
}
