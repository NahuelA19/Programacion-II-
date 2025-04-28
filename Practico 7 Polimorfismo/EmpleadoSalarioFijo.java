
import java.time.LocalDate;


public class EmpleadoSalarioFijo extends Empleado {



    private static final double PORC1 = 0.05;
    private static final double PORC2 = 0.1;

    private double salarioBasico;


    public EmpleadoSalarioFijo() {
    }

    public EmpleadoSalarioFijo(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public EmpleadoSalarioFijo(String dni, String nombre, String apellido, int anioIngreso, double salarioBasico) {
        super(dni, nombre, apellido, anioIngreso);
        this.salarioBasico = salarioBasico;
    }


    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }


    public double porcAdicional() {

        double porcAdicional = 0;

        int ant =antiguedadEnAnios();


        if(ant == 1) {
            porcAdicional = 0;
        } else if (ant>1 && ant<5) {


            porcAdicional = PORC1;

        } else if (ant>=5) {

            porcAdicional = PORC2;

        }

     return porcAdicional;
    }





    @Override
    public double getSalario() {

       double salarioFinal = 0;
       salarioFinal =  (salarioBasico + salarioBasico*porcAdicional());

        return salarioFinal;
    }
}
