package Ejercicio6;

import java.util.ArrayList;

public class Equipo {

    String nombre;
    int nivelAtaque, nivelCentro, nivelDefensa;
    int goles;
    boolean atacar;

    //ArrayList <Jugador> plantilla = ArrayList <Jugador> plantilla;

    public Equipo (){

    }

    public Equipo (String nombre){
        nivelAtaque = (int)(Math.random()*101);
        nivelCentro = (int)(Math.random()*101);
        nivelDefensa = (int)(Math.random()*101);

    }

    public Equipo (String nombre, int nivelAtaque, int nivelCentro, int nivelDefensa, int goles){
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelCentro  =nivelCentro;
        this.nivelDefensa = nivelDefensa;
        this.goles = goles;
    }

    public boolean atacar(){
        if ((nivelAtaque*(Math.random()*2)+(nivelCentro*(Math.random()*2)/2))>90){
            goles++;
            return true;
        } else{
            return false;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public int getNivelCentro() {
        return nivelCentro;
    }

    public void setNivelCentro(int nivelCentro) {
        this.nivelCentro = nivelCentro;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public void setNivelDefensa(int nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public boolean isAtacar() {
        return atacar;
    }

    public void setAtacar(boolean atacar) {
        this.atacar = atacar;
    }
}
