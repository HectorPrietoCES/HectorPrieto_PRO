package objetos;

// base del objeto de tipo coche
public class Coche {

    /*propiedades o atributos -> variables
        -cosas que definen al objeto (Coche)
        -marca, modelo, caballos, numero de puertas, precio */
    private String marca, modelo;
    private int cv, numPuertas, precio;


    /*metodos -> constructor siempre y cuando no tenga otro hay uno por defecto
        -por defecto tengo el constructor default Coche() {null, false, dependiendo de la propiedad}
        -marca = null, modelo = null, cv = null, numPuertas = null, precio = null */
    // public NombreClase"Coche"(parametros){}

    public Coche(){
        marca = "por defecto";
        modelo = "por defecto";
        // constructor por defecto, crear siempre
    }

    public Coche(String marca, String modelo, int cv, int numPuertas, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.numPuertas = numPuertas;
        this.precio = precio;
    }

    public Coche(String marca, String modelo, int cv, int numPuertas){
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.numPuertas = numPuertas;
    }


    //metodos -> funcionalidades

    //metodos -> getter / setter

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

}
