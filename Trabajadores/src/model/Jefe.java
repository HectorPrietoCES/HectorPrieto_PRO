package model;

public final class Jefe extends Persona {

    private int acciones;
    private double beneficio;

    public Jefe() {
    }

    public Jefe(String nombre, String apellido, String dni, int acciones, double beneficio) {
        super(nombre, apellido, dni);
        this.acciones = acciones;
        this.beneficio = beneficio;
    }

    public int getAcciones() {
        return acciones;
    }

    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }

    public double getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(double beneficio) {
        this.beneficio = beneficio;
    }
}
