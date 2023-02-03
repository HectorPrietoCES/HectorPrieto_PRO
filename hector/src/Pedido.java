public class Pedido {

    boolean estadoPedido;
    String cliente, productos;
    int cuenta;
    Producto producto;

    public Pedido (String cliente, String productos, int cuenta){
        this.cliente=cliente;
        this.productos=productos;
        this.cuenta=cuenta;
    }

    public boolean isEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(boolean estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }


    public void agregarProductos(Producto producto){

    }
}
