import Entities.*;
import Enum.TipoCultivo;
import Enum.TipoDonacion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.Callable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Sector sectorFrutal = new Sector("Sector Frutal","este es el sector destinado a las frutas");

        Sector sectorAromaticas = new Sector("Sector Aromaticas","este es el sector destinado a las aromaticas");

        Cultivo cultivoFrutal = new Cultivo("Naranja", TipoCultivo.FRUTAL, LocalDate.now());

        Cultivo cultivoAromatico = new Cultivo("Lavanda", TipoCultivo.AROMATICA, LocalDate.now());

        Cosecha c1 = new Cosecha(LocalDate.now(),105.2);

        Cosecha c2 = new Cosecha(LocalDate.of(2025,5,3),300.2);


        Cosecha c3 = new Cosecha(LocalDate.now(),400.2);

        Cosecha c4 = new Cosecha(LocalDate.of(2025,5,3),300.2);





        //1:

        //Cultivo Frutal-Aromatics con dos cosechas.

        ArrayList<Cosecha> cosechasFrutales = new ArrayList<>();

        cosechasFrutales.add(c1);
        cosechasFrutales.add(c2);

        cultivoFrutal.setCosechas(cosechasFrutales);

        ArrayList<Cosecha> cosechasAromaticas = new ArrayList<>();
        cosechasAromaticas.add(c3);
        cosechasAromaticas.add(c4);

        cultivoAromatico.setCosechas(cosechasAromaticas);

        //Sectores con al menos un cultivo:

        sectorFrutal.getCultivos().add(cultivoFrutal);
        sectorAromaticas.getCultivos().add(cultivoFrutal);

        // Voluntario con al menos dos tareas:

        Tarea tarea1 = new Tarea("Realiza la recoleccion",LocalDate.now());
        Tarea tarea2 = new Tarea("Arreglo de cultivos dañados",LocalDate.of(2025,6,15));

        Voluntario v1 = new Voluntario("Nahuel","40973095","agustinahuelaciar@gmail.com");

        v1.getTareasRealizadas().add(tarea1);
        v1.getTareasRealizadas().add(tarea2);


        //Turno Asignado:

        Turno t1 = new Turno(LocalDate.now(),"8:00 am - 11 am");

        v1.setTurno(t1);


        //Capacitador y Capacitacion con al menos dos asistentes:

         Voluntario asistenteCapacitacion1 = new Voluntario("Claudia","22456053","claudia@mailfalso.com");
        Voluntario asistenteCapacitacion2 = new Voluntario("Rodrigo","40837405","rodrigo@mailfalso.com");


        Capacitador capacitador1 = new Capacitador("Tito","30304303","titocapcitaciones@gmail.com");


        Capacitacion capacitacion1 = new Capacitacion("Cultivacion correcta segun areas", LocalDate.of(2025,6,20));

        capacitacion1.getVoluntarios().add(asistenteCapacitacion1);
        capacitacion1.getVoluntarios().add(asistenteCapacitacion2);

        capacitacion1.setCapacitador(capacitador1);


        //Donacion:

        Donacion d1 = new Donacion("Donativo para los cultivos aromatizaticos",LocalDate.now());


        Donante donante = new Donante("Raul","22402830","rauldonanciones@gmail.com");

        donante.getDonaciones().add(d1);

        //Domicilio para cada persona:

        Domicilio domicilioDonante = new Domicilio("404","199","Mendoza","Godoy Cruz");
        Domicilio domicilioAsistente = new Domicilio("Calle null","199","Mendoza","Godoy Cruz");
        Domicilio domicilioCapacitador = new Domicilio("Calle new","199","Mendoza","Lujan de cuyo");
        Domicilio domicilioVoluntario= new Domicilio("Calle falsa123","199","Mendoza","Guaymallen");


        asistenteCapacitacion1.setDomicilio(domicilioAsistente);
        asistenteCapacitacion2.setDomicilio(domicilioAsistente);
        donante.setDomicilio(domicilioDonante);
        v1.setDomicilio(domicilioVoluntario);
        capacitador1.setDomicilio(domicilioCapacitador);

        //2:

        System.out.println("Voluntario:");

        v1.realizarTarea(tarea1);

        System.out.println(v1);

        //3:

        System.out.println("Cosechas; ");
        System.out.println(sectorFrutal.getCosechaDelSector());


        //4:

        capacitacion1.MostrarAsisitente();


        //5:

        d1.setTipoDonacion(TipoDonacion.DINERO);

        donante.MostrarDonaciones();









        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}