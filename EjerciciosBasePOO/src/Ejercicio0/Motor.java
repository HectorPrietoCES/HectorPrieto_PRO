package Ejercicio0;

public class Motor {

    private int litrosAceite, cv;


    public Motor (int cv){
        this.cv = cv;
    }

    public int getAceite() {
        return litrosAceite;
    }

    public void setAceite(int aceite) {
        this.litrosAceite = aceite;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }
}
