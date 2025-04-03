public class Main {
    public static void main(String[] args) {

       Empleado empleado1 = new Empleado("Juan Roman","Software Engineer");
       Empleado empleado2 = new Empleado("Martin", "Data Scientist");

        //Prueba toString:

        System.out.println(empleado1.toString());

        System.out.println(empleado2.toString());


        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");

        //Prueba de aumento de sueldos:


        //Aumento en %:
        empleado1.actualizarSalario(10.0);
        empleado2.actualizarSalario(9.0);

        System.out.println("Aumento porcentual del salario: ");

        System.out.println("El salario del empleado: " +empleado1.getNombre()+ " luego del aumento es de : " +empleado1.getSalario());




        System.out.println("El salario del empleado: " +empleado2.getNombre()+ " luego del aumento es de : " +empleado2.getSalario());



        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");


        System.out.println("Aumento monto fijo : ");



        //Prueba aumento  monto fijo:

        empleado1.setSalario(3000);
        empleado2.setSalario(3000);

        empleado1.actualizarSalario(100);
        empleado2.actualizarSalario(90);


        System.out.println("El salario del empleado: " +empleado1.getNombre()+ " luego del aumento es de : " +empleado1.getSalario());


        System.out.println("El salario del empleado: " +empleado2.getNombre()+ " luego del aumento es de : " +empleado2.getSalario());

        System.out.println("//////////////////////////////////////////////////////////////////////////////////");

        System.out.println("La cantidad de empleados es de: " +Empleado.mostrarListaEmpleados());







    }
}