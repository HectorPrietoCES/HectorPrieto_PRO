public class Producto {

    String nombreProducto;
    int precio;

    public Producto(String nombreProducto, int precio){
        this.nombreProducto=nombreProducto;
        this.precio=precio;

    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void mostrarInfo (){
        System.out.println("El producto seleccionado es:"+getNombreProducto()+"y su precio es:"+getPrecio());
    }


}
