public class Empleado {

    private int id;
    private int edad;
    private String nombre;
    private String puesto;
    private double salario;

    private static int totalEmpleados=0;


    //Getter and Setter:

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    public static void setTotalEmpleados(int totalEmpleados) {
        Empleado.totalEmpleados = totalEmpleados;
    }


    //Constructor y Metodos: :

    public Empleado() {
    }

    public Empleado(int edad, String nombre, String puesto) {
        this.edad = edad;
        this.nombre = nombre;
        this.puesto = puesto;
    }



    //Metodo con salario fijo y incremento de empleado + id.

    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados; // Relacion id de empleado con el total de los mismos.
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000; // Se establece el salario fijo.

    }


    //Salario + porcentaje del mismo
    public void actualizarSalario(double porcentaje) {
        salario += salario * (porcentaje / 100);
    }


    //Salario + aumento
    public void actualizarSalario(int aumento) {
        salario += aumento;
    }


    //To String para los datos de cada empleado.
    @Override
    public String toString() {
        return "Empleado (ID=" + this.id + " || Nombre=" + this.nombre + " || Puesto=" + this.puesto + " || Salario=" + this.salario + ")";

    }


    //Metodo estatico para ver cada uno de los empleados:

    public static int mostrarListaEmpleados() {
        return totalEmpleados;
    }

}
