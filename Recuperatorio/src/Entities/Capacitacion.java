package Entities;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;

public class Capacitacion {
    private String tema;
    private LocalDate fecha;
    private Capacitador capacitador;
    private ArrayList<Voluntario> voluntarios = new ArrayList<>();

    public Capacitacion(String tema, LocalDate fecha) {
        this.tema = tema;
        this.fecha = fecha;
    }


    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Capacitador getCapacitador() {
        return capacitador;
    }

    public void setCapacitador(Capacitador capacitador) {
        this.capacitador = capacitador;
    }

    public ArrayList<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(ArrayList<Voluntario> voluntarios) {
        this.voluntarios = voluntarios;
    }

    public void MostrarAsisitente(){
        for(Voluntario v: voluntarios){

            System.out.println("Voluntario: " + v.getNombre()) ;
            System.out.println("DNI: " + v.getDni()) ;
            System.out.println("-------------------------");
        }
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "tema='" + tema + '\'' +
                ", fecha=" + fecha +
                ", capacitador=" + capacitador +
                ", voluntarios=" + voluntarios +
                '}';
    }
}
