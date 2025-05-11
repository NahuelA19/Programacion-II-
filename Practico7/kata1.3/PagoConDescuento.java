public interface PagoConDescuento extends Pago {

    public void aplicarDescuento(double porcentaje);


    @Override
    public void procesarPago(double monto);
}
