package model;

public final class Autonomo extends Trabajador {
    private double cuotasSS;

    public Autonomo() {
    }

    public Autonomo(String nombre, String apellido, String dni, double sueldo, boolean contratado, double cuotasSS) {
        super(nombre, apellido, dni, sueldo, contratado);
        this.cuotasSS = cuotasSS;
    }

    public double getCuotasSS() {
        return cuotasSS;
    }

    public void setCuotasSS(double cuotasSS) {
        this.cuotasSS = cuotasSS;
    }
}
