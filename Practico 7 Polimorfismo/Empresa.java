import java.util.ArrayList;

public class Empresa {


    private ArrayList<Empleado> empleados = new ArrayList<>();

    public void mostrarSalario() {
    }

    public void empleladoConMasClientes(){

    }


    public Empresa() {
    }

    public Empresa(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }


    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }


    //Agregar o eliminar empleados:

    public void agregarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        this.empleados.remove(empleado);
    }


    public void MostrarSalario() {

        System.out.println("Salario de los empleados: ");

       for (Empleado empleado : empleados) {

           System.out.println(empleado.getNombre() + " " + empleado.getApellido() + " " + "$ " +empleado.getSalario());
       }
    }

    public Empleado empleadoConMasClientes(){

        int aux = -1;
        Empleado elMayor = null;

        for (Empleado empleado : empleados) {

            if(empleado instanceof EmpleadoAComision){
                EmpleadoAComision empleadoAComision = (EmpleadoAComision) empleado;
                int cant = empleadoAComision.getCantClientesCaptados();

                if(cant > aux){
                  aux = cant;
                  elMayor = empleado;
                }


            }


        }

        return elMayor;
    }





}



