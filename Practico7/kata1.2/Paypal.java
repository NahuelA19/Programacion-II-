public class Paypal implements PagoConDescuento {
    public String email;
    public double descuento;


    public Paypal() {
    }

    public Paypal(String email) {
        this.email = email;
    }




    @Override
    public void aplicarDescuento(double porcentaje) {
        this.descuento = porcentaje;
    }

    @Override
    public void procesarPago(double monto) {
        double montoFinal = monto - (monto * descuento / 100);
        System.out.println("Pago realizado a traves del paypal con maiL:  " + email + ": $" + montoFinal);
    }
}
