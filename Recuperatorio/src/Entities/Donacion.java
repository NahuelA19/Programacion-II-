package Entities;
import Enum.TipoDonacion;

import java.time.LocalDate;

public class Donacion {
    private TipoDonacion tipoDonacion;
    private String descripcion;
    private LocalDate fecha;

    public Donacion(String descripcion, LocalDate fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Donacion(TipoDonacion tipoDonacion, String descripcion, LocalDate fecha) {
        this.tipoDonacion = tipoDonacion;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public TipoDonacion getTipoDonacion() {
        return tipoDonacion;
    }

    public void setTipoDonacion(TipoDonacion tipoDonacion) {
        this.tipoDonacion = tipoDonacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Donacion{" +
                "tipoDonacion=" + tipoDonacion +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
