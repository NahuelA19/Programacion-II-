//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Roman","Riquelme","Primero",10);


        //Muestra la informacion tal cual se ingresa:
        estudiante1.mostrarInfo();



        System.out.println("////////////////////////////////////////////////////////////////");


        //Se prueba el metodo:
        estudiante1.subirCalificacion(10);


        estudiante1.mostrarInfo();

        System.out.println("////////////////////////////////////////////////////////////////");



        //Se prueba otro metodo:
        estudiante1.bajarCalificacion(12);


        estudiante1.mostrarInfo();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        }
    }
