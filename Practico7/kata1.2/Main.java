//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {





        Producto producto1 = new Producto("Papas Fritas",1500);
        Producto producto2 = new Producto("Coca Cola 1 Litro",2500);
        Producto producto3 = new Producto("Papel de Cocina",3000);




      Pedido pedido1 = new Pedido();


      pedido1.agregarProducto(producto1);
      pedido1.agregarProducto(producto2);
      pedido1.agregarProducto(producto3);


        System.out.println("El total del pedido es: " +pedido1.calcularTotal());


        System.out.println("---- Kata1.2-------------------");



        TarjetaCredito tarjeta1 = new TarjetaCredito(123131311);

        Paypal p1 = new Paypal("agustinahuelaciar@gmail.com");




        tarjeta1.aplicarDescuento(10.5);

        tarjeta1.procesarPago(1000);


        p1.aplicarDescuento(30);
        p1.procesarPago(2000);









    }
}