import java.time.LocalDate;

public abstract class Empleado {

    private String dni;
    private String nombre;
    private String apellido;
    private int anioIngreso;


    public Empleado() {
    }

    public Empleado(String dni, String nombre, String apellido, int anioIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public abstract double getSalario();



    public int antiguedadEnAnios(){

       int anioActual = LocalDate.now().getYear();

       int antiguedad = anioActual - anioIngreso;



        return antiguedad;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", anioIngreso=" + anioIngreso +
                '}';
    }
}
