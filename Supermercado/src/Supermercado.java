import java.util.ArrayList;

public class Supermercado<T> {
    private int caja;
    ArrayList Producto = new ArrayList();

    public Supermercado() {
    }

    public Supermercado(int caja, ArrayList producto) {
        this.caja = caja;
    }


    public void listarProductos (ArrayList producto){
        for (Object item:producto) {
            System.out.println("Producto "+producto);
        }
    }

    public void agregarProductos(ArrayList producto){
        for (Object item:producto) {
            System.out.println("producto añadido");
        }
    }
}
