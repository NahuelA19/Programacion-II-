public class Main {
    public static void main(String[] args) {

       Empresa empresa1 = new Empresa();

       empresa1.agregarEmpleado(new EmpleadoSalarioFijo("40834234","Ana","Flores",2025,750000));

       empresa1.agregarEmpleado(new EmpleadoAComision("224083405","Pedro","Raul",2000,550000,100,2500));


        empresa1.agregarEmpleado(new EmpleadoAComision("224083405","Tito","Calderon",2000,550000,1000,2500));

        empresa1.agregarEmpleado(new EmpleadoAComision("224083405","Ricardo","Ford",2000,550000,5000,2500));

        empresa1.agregarEmpleado(new EmpleadoSalarioFijo("354029302","Claudia","Valle",2021,750000));


        empresa1.agregarEmpleado(new EmpleadoSalarioFijo("354029302","Claudia","Valle",2015,750000));


        empresa1.agregarEmpleado(new EmpleadoSalarioFijo("345050553","Jorge","Almiron",2021,700000));

        empresa1.MostrarSalario();

        System.out.println("-----------------------------------------");


        System.out.println("El empleado con mas Clientes es: ");

        System.out.println(empresa1.empleadoConMasClientes());








    }

}