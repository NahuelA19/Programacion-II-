package Entities;

import java.util.ArrayList;

public class Voluntario extends Persona {

    private Turno turno;

    private ArrayList<Tarea>tareasRealizadas;


    public Voluntario(String nombre, String dni, String email) {
        super(nombre, dni, email);
        tareasRealizadas = new ArrayList<>();
    }


    public Voluntario(String nombre, String dni, String email, Turno turno) {
        super(nombre, dni, email);
        this.turno = turno;
        tareasRealizadas = new ArrayList<>();
    }


    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public ArrayList<Tarea> getTareasRealizadas() {
        return tareasRealizadas;
    }

    public void setTareasRealizadas(ArrayList<Tarea> tareasRealizadas) {
        this.tareasRealizadas = tareasRealizadas;
    }

    public void realizarTarea(Tarea tarea) {
        this.tareasRealizadas.add(tarea);
    }

    @Override
    public String toString() {
        return "Voluntario{" +
                "turno=" + turno +
                ", tareasRealizadas=" + tareasRealizadas +
                '}';
    }
}
