public class EmpleadoAComision extends Empleado {


    private double salarioMinimo;

    private int cantClientesCaptados;

    private double montoPorCliente;


    public EmpleadoAComision() {
    }

    public EmpleadoAComision(double salarioMinimo, int cantClientesCaptados, double montoPorCliente) {
        this.salarioMinimo = salarioMinimo;
        this.cantClientesCaptados = cantClientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }

    public EmpleadoAComision(String dni, String nombre, String apellido, int anioIngreso, double salarioMinimo, int cantClientesCaptados, double montoPorCliente) {
        super(dni, nombre, apellido, anioIngreso);
        this.salarioMinimo = salarioMinimo;
        this.cantClientesCaptados = cantClientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public double getMontoPorCliente() {
        return montoPorCliente;
    }

    public void setMontoPorCliente(double montoPorCliente) {
        this.montoPorCliente = montoPorCliente;
    }

    public int getCantClientesCaptados() {
        return cantClientesCaptados;
    }

    public void setCantClientesCaptados(int cantClientesCaptados) {
        this.cantClientesCaptados = cantClientesCaptados;
    }

    @Override
    public double getSalario() {

        double salarioFinal;



        salarioFinal = (montoPorCliente*cantClientesCaptados);

        if(salarioFinal< salarioMinimo){
            salarioFinal = salarioMinimo;
        }



        return salarioFinal;
    }







}
