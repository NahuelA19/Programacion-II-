public class TarjetaCredito implements PagoConDescuento {
    public int numero;
    private double descuento;

    public TarjetaCredito() {
    }

    public TarjetaCredito(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void procesarPago(double monto) {

        double montoFinal = monto - (monto * descuento / 100);
        System.out.println("Pago con tarjeta " + numero + ": $" + montoFinal);

    }


    @Override
    public void aplicarDescuento(double porcentaje) {

        this.descuento = porcentaje;
    }





}
