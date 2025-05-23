import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

            System.out.println("Kata 1: ");


        List<Producto<?>> productos = new ArrayList<>();

        productos.add(new Producto<String>("SKU003", "Pantalones", 70000.00));
        productos.add(new Producto<Integer>(123, "Camisetas de Futbol", 75000.50));
        productos.add(new Producto<Long>(999999998L, "Short", 25000.00));



        for (Producto<?> producto : productos) {
            System.out.println(producto);
        }


            System.out.println("---------------------------------------------");


            System.out.println("Kata 2: ");


        Producto<String> p1 = new Producto<>("SKU003", "Pantalones", 70000.00);
        Producto<Integer> p2 = new Producto<>(123, "Camisetas de Futbol", 75000.50);
        Producto<Long> p3 = new Producto<>(999999998L, "Short", 25000.00);

        Carrito<Producto<?>> carrito = new Carrito<>();

        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);



        System.out.println("Productos en el carrito:");
        carrito.mostrarProductos();


        System.out.println("Total: $" + carrito.obtenerTotal());

        System.out.println("-----------------------------------");
        carrito.eliminarProducto(p2);
        System.out.println("Producto eliminado.");

        System.out.println("Lista de los productos despues de la eliminacion:");
        carrito.mostrarProductos();
        System.out.println("Total del carrito: $" + carrito.obtenerTotal());


            System.out.println("------------------------------------------------");


            System.out.println("Kata 3: ");


            Producto<String> pantalon = new Producto<>("SKU003", "Pantalones", 70000.00);
            Producto<Integer> camiseta = new Producto<>(123, "Camisetas de Futbol", 75000.50);
            Producto<Long> shortDeport = new Producto<>(999999998L, "Short", 25000.00);

            Pedido pedido1 = new Pedido(1, java.time.LocalDate.of(2024, 3, 10));
            pedido1.agregarProducto(pantalon);
            pedido1.agregarProducto(shortDeport);

            Pedido pedido2 = new Pedido(2, java.time.LocalDate.of(2024, 2, 5));
            pedido2.agregarProducto(camiseta);

            Pedido pedido3 = new Pedido(3, java.time.LocalDate.of(2024, 5, 15));
            pedido3.agregarProducto(pantalon);
            pedido3.agregarProducto(camiseta);

            List<Pedido> pedidos = new ArrayList<>();
            pedidos.add(pedido1);
            pedidos.add(pedido2);
            pedidos.add(pedido3);

            System.out.println("Pedidos ordenados por total:");
            pedidos.sort(null);
            for (Pedido p : pedidos) {
                    System.out.println(p);
            }

            System.out.println("\nPedidos ordenados por fecha:");
            pedidos.sort(new ComparadorPedidosPorFecha());
            for (Pedido p : pedidos) {
                    System.out.println(p);
            }





    }
}
