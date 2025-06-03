package Entities;

import java.time.LocalDate;

public class Turno {

    private LocalDate fecha;


    private String horario;

    public Turno(LocalDate fecha, String horario) {
        this.fecha = fecha;
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "fecha=" + fecha +
                ", horario='" + horario + '\'' +
                '}';
    }
}
