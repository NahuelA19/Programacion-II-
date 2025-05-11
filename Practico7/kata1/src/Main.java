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






    }
}