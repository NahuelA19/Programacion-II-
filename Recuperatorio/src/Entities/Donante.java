package Entities;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Donante  extends Persona{

    ArrayList<Donacion> donaciones = new ArrayList();


    public Donante(String nombre, String dni, String email) {
        super(nombre, dni, email);
    }

    public Donante(String nombre, Domicilio domicilio, String dni, String email) {
        super(nombre, domicilio, dni, email);
    }


    public ArrayList<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(ArrayList<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

    public void MostrarDonaciones(){

        for(Donacion d : donaciones){
            System.out.println(d.toString());
        }
    }


    @Override
    public String toString() {
        return "Donante{" +
                "donaciones=" + donaciones +
                '}';
    }


}
