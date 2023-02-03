package model;

public final class Asalariado extends Trabajador {
    private int numeroPagas;

    public Asalariado() {
    }

    public Asalariado(String nombre, String apellido, String dni, double sueldo, boolean contratado, int numeroPagas) {
        super(nombre, apellido, dni, sueldo, contratado);
        this.numeroPagas = numeroPagas;
    }

    public int getNumeroPagas() {
        return numeroPagas;
    }

    public void setNumeroPagas(int numeroPagas) {
        this.numeroPagas = numeroPagas;
    }
}

