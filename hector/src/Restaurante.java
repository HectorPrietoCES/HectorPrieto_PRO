public class Restaurante {

    String nif, nombre, dni;
    int pedidos, caja;
    Pedido pedido;

    public Restaurante(String nif, String nombre) {
        this.nombre = nombre;
        this.nif=nif;
    }

    String[] pedidos1 = new String[0];

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPedidos() {
        return pedidos;
    }

    public void setPedidos(int pedidos) {
        this.pedidos = pedidos;
    }

    public int getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


    public void cobrarPedidos(String dni) {

    }

    public void agregarPedido(Pedido pedido){
        setPedidos(0);
    }
}
