package model;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Trabajador> listaTrabajadores;
    private ArrayList<Jefe> listaJefe;

    public Empresa(){
        this.listaTrabajadores = new ArrayList<>();
        this.listaJefe = new ArrayList<>();
    }


    public void registrarTrabajador (Trabajador trabajador){
        listaTrabajadores.add(trabajador);
    }
    public void registrarJefe (Jefe jefe){
        listaJefe.add(jefe);
    }

    public void listarTrabajadores(){
        for (Trabajador item : listaTrabajadores) {
            System.out.println(listaTrabajadores);
        }
    }

    public void listarJefes(){
        for (Jefe item : listaJefe) {
            System.out.println(listaJefe);
        }
    }

    public ArrayList<Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(ArrayList<Trabajador> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }

    public ArrayList<Jefe> getListaJefe() {
        return listaJefe;
    }

    public void setListaJefe(ArrayList<Jefe> listaJefe) {
        this.listaJefe = listaJefe;
    }



}

