package model;

import java.util.Scanner;

public final class Todoterreno extends Coche  {
    // extends para traer to-do lo que tiene coche a todoterreno
    // cuando un 4x4 (no un 4x2) enciende, pregunta si quiero encender el modo campo
    // y si enciendo " encendiendo modo campo"

    private String traccion; // 2x4 o 4x4
    private boolean modoCampo;

    public Todoterreno() {
    }

    public Todoterreno(String marca, String modelo, String traccion){
        super(marca,modelo);
        //modo campo = false
        this.traccion=traccion;
    }

    @Override
    public void encender() {
        super.encender();
        if (traccion.equalsIgnoreCase("4x4")){
            System.out.println("¿Quieres encender el modo campo?");
            String respuesta = new Scanner(System.in).next();
            if (respuesta.equalsIgnoreCase("si")){
                modoCampo=true;
            }
        }
    }



    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Traccion "+traccion);
        System.out.println("Modo campo "+modoCampo);
    }

    public String getTraccion() {
        return traccion;
    }
    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
    public boolean isModoCampo() {
        return modoCampo;
    }
    public void setModoCampo(boolean modoCampo) {
        this.modoCampo = modoCampo;
    }
}
