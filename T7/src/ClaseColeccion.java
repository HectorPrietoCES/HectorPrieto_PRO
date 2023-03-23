import java.util.ArrayList;

public class ClaseColeccion<T> {

    private ArrayList<Object> listaElemento;
    public ClaseColeccion(ArrayList listaElementos){
        this.listaElemento=listaElementos;
    }
    public void listarElementos(){
        for (Object item:listaElemento) {
            System.out.println(item);
        }
    }
    public void agregarElemento(Object elemento){
        this.listaElemento.add(elemento);
    }
}
