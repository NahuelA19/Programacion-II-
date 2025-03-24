public class Estudiante {

    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;


    //Constructor:


    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }


    //Getter and Setter:


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {

        if (this.calificacion < 0) {
            System.out.println("La calificacion no puede ser negativo");
            this.calificacion = 0;
        } else if (this.calificacion > 10) {
            System.out.println("La calificacion no puede ser mayor que 10");
            this.calificacion = 10;
        } else {
            this.calificacion = calificacion;
        }

    }


    //Metodos:

    public void mostrarInfo() {
        System.out.printf("Nombre: %s\n", this.nombre);
        System.out.printf("Apellido: %s\n", this.apellido);
        System.out.printf("Curso: %s\n", this.curso);
        System.out.printf("Calificacion: %.2f\n", this.calificacion);
    }

    public void subirCalificacion(double puntos) {

        if ((puntos + this.calificacion) > 10) {
            System.out.println("La calificacion + puntos no puede ser mayor que 10");
            this.calificacion = 10;
        } else {
            this.calificacion = this.calificacion + puntos;
        }
    }


    public void bajarCalificacion(double puntos) {

        if ((this.calificacion - puntos) < 0) {
            System.out.println("La calificacion no puede ser menor que 0");
            this.calificacion = 0;
        } else {
            this.calificacion = this.calificacion - puntos;
        }


    }
}
