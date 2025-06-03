package Entities;

import java.util.ArrayList;
import java.util.List;

public class Sector {

    private String nombre;

    private String descripcion;

    private ArrayList<Cultivo> cultivos;


    public Sector(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        cultivos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Cultivo> getCultivos() {
        return cultivos;
    }

    public void setCultivos(ArrayList<Cultivo> cultivos) {
        this.cultivos = cultivos;
    }

    public List<Cosecha> getCosechaDelSector() {
        int aux = cultivos.size();

        List<Cosecha> cosechsDelSector = new ArrayList<>();

        for (Cultivo cultivo : cultivos) {
            cosechsDelSector.add(cultivo.getCosechas().get(aux));
            --aux;
        }
        return cosechsDelSector;
    }






}
