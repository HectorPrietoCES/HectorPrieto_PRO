package Ejercicio0;

public class Coche {

    private Motor motor;
    private String marca, modelo;
    private double acumuladoAverias;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;

    }
    public void acumularAveria(){
        double costeAveria= Math.random() * 401+100;
        this.acumuladoAverias+= costeAveria;

    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getacumuladoAverias() {
        return acumuladoAverias;
    }

    public void setacumuladoAverias(double acumuladoAverias) {
        this.acumuladoAverias = acumuladoAverias;
    }
}
