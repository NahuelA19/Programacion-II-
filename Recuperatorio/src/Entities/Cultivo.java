package Entities;
import Enum.TipoCultivo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cultivo {

    private String especie;
    private TipoCultivo tipoCultivo;
    private LocalDate fechaSiembra;
    private ArrayList<Cosecha> cosechas = new ArrayList<>();




    public Cultivo(String especie, TipoCultivo tipoCultivo, LocalDate fechaSiembra) {
        this.especie = especie;
        this.tipoCultivo = tipoCultivo;
        this.fechaSiembra = fechaSiembra;

    }


    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public ArrayList<Cosecha> getCosechas() {
        return cosechas;
    }

    public void setCosechas(ArrayList<Cosecha> cosechas) {
        this.cosechas = cosechas;
    }

    public TipoCultivo getTipoCultivo() {
        return tipoCultivo;
    }

    public void setTipoCultivo(TipoCultivo tipoCultivo) {
        this.tipoCultivo = tipoCultivo;
    }

    public LocalDate getFechaSiembra() {
        return fechaSiembra;
    }

    public void setFechaSiembra(LocalDate fechaSiembra) {
        this.fechaSiembra = fechaSiembra;
    }

    @Override
    public String toString() {
        return "Cultivo{" +
                "especie='" + especie + '\'' +
                ", tipoCultivo=" + tipoCultivo +
                ", fechaSiembra=" + fechaSiembra +
                ", cosechas=" + cosechas +
                '}';
    }
}


