package Ejercicio11;

public class LlamadaLocal {
    
    private double   numeroOrigen, numeroDestino, coste, duracion;

    public LlamadaLocal(double numeroOrigen, double numeroDestino, double duracion){
            this.numeroOrigen=numeroOrigen;
            this.numeroDestino=numeroDestino;
            this.duracion=duracion;
    }

    public double getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(double numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public double getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(double numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void mostrarDatos(){
        System.out.println(+numeroOrigen+" está llamando a: "+numeroDestino+" a un coste de "+coste+" con una duracion en segundos de "+duracion);
    }
}
