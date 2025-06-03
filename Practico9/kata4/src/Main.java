import model.Categoria;
import model.Producto;
import model.ItemPedido;
import model.Pedido;

import service.CategoriaServiceImpl;
import service.ProductoServiceImpl;
import service.PedidoServiceImpl;

import dao.ProductoDAOImpl;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final CategoriaServiceImpl categoriaService = new CategoriaServiceImpl();
    private static final ProductoServiceImpl productoService = new ProductoServiceImpl();
    private static final PedidoServiceImpl pedidoService = new PedidoServiceImpl();
    private static final ProductoDAOImpl productoDAO = new ProductoDAOImpl();

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1 -> crearCategoria();
                case 2 -> listarCategorias();
                case 3 -> eliminarCategoria();
                case 4 -> crearProducto();
                case 5 -> listarProductos();
                case 6 -> eliminarProducto();
                case 7 -> crearPedidoCon2Productos();
                case 8 -> mostrarPedidosConDetalles();
                case 0 -> System.out.println("👋 ¡Hasta luego!");
                default -> System.out.println("❌ Opción inválida.");
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n📋 MENÚ PRINCIPAL:");
        System.out.println("1. Crear categoría");
        System.out.println("2. Listar categorías");
        System.out.println("3. Eliminar categoría");
        System.out.println("4. Crear producto");
        System.out.println("5. Listar productos");
        System.out.println("6. Eliminar producto");
        System.out.println("7. Crear pedido con 2 productos");
        System.out.println("8. Mostrar todos los pedidos con detalles");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Métodos Kata 3 --------------------------
    private static void crearCategoria() {
        System.out.print("Ingrese nombre de la categoría: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese descripción: ");
        String descripcion = scanner.nextLine();

        Categoria categoria = new Categoria();
        categoria.setNombre(nombre);
        categoria.setDescripcion(descripcion);

        if (categoriaService.crear(categoria)) {
            System.out.println("✅ Categoría creada con éxito.");
        }
    }

    private static void listarCategorias() {
        List<Categoria> categorias = categoriaService.listar();
        System.out.println("📦 Categorías:");
        for (Categoria c : categorias) {
            System.out.println(c.getId() + " - " + c.getNombre() + " (" + c.getDescripcion() + ")");
        }
    }

    private static void eliminarCategoria() {
        listarCategorias();
        System.out.print("Ingrese el ID de la categoría a eliminar: ");
        int id = Integer.parseInt(scanner.nextLine());

        if (categoriaService.eliminar(id)) {
            System.out.println("🗑️ Categoría eliminada.");
        }
    }

    private static void crearProducto() {
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.print("Cantidad: ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        listarCategorias();
        System.out.print("ID de categoría: ");
        int idCategoria = Integer.parseInt(scanner.nextLine());

        Categoria categoria = categoriaService.leer(idCategoria);
        if (categoria == null) {
            System.out.println("❌ Categoría no encontrada.");
            return;
        }

        Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setDescripcion(descripcion);
        producto.setPrecio(precio);
        producto.setCantidad(cantidad);
        producto.setCategoria(categoria);

        if (productoService.crear(producto)) {
            System.out.println("✅ Producto creado con éxito.");
        }
    }

    private static void listarProductos() {
        List<Producto> productos = productoService.listar();
        System.out.println("🛒 Productos:");
        for (Producto p : productos) {
            System.out.println(p.getId() + " - " + p.getNombre() + " | $" + p.getPrecio() +
                    " | Stock: " + p.getCantidad() +
                    " | Categoría: " + p.getCategoria().getNombre());
        }
    }

    private static void eliminarProducto() {
        listarProductos();
        System.out.print("ID del producto a eliminar: ");
        int id = Integer.parseInt(scanner.nextLine());

        if (productoService.eliminar(id)) {
            System.out.println("🗑️ Producto eliminado.");
        }
    }

    // Métodos Kata 4 --------------------------
    private static void crearPedidoCon2Productos() {
        System.out.println("📝 Crear Pedido con 2 productos:");
        listarProductos();

        Pedido pedido = new Pedido();
        List<ItemPedido> items = new java.util.ArrayList<>();

        for (int i = 1; i <= 2; i++) {
            System.out.print("ID del producto " + i + ": ");
            int idProd = Integer.parseInt(scanner.nextLine());

            System.out.print("Cantidad: ");
            int cantidad = Integer.parseInt(scanner.nextLine());

            Producto producto = new Producto();
            producto.setId(idProd);

            ItemPedido item = new ItemPedido();
            item.setProducto(producto);
            item.setCantidad(cantidad);

            items.add(item);
        }

        pedido.setItems(items);
        pedidoService.crearPedido(pedido);
    }

    private static void mostrarPedidosConDetalles() {
        String sql = """
                SELECT p.id AS pedido_id, p.fecha, i.cantidad, i.subtotal,
                       pr.nombre AS producto, pr.precio,
                       c.nombre AS categoria
                FROM pedidos p
                JOIN items_pedido i ON p.id = i.pedido_id
                JOIN productos pr ON i.producto_id = pr.id
                JOIN categorias c ON pr.categoria_id = c.id
                ORDER BY p.id;
                """;

        try (var conn = util.ConexionDB.conectar();
             var stmt = conn.createStatement();
             var rs = stmt.executeQuery(sql)) {

            int pedidoActual = -1;
            double total = 0;

            while (rs.next()) {
                int pedidoId = rs.getInt("pedido_id");

                if (pedidoId != pedidoActual) {
                    if (pedidoActual != -1) {
                        System.out.printf("   ➕ Total del pedido: $%.2f\n", total);
                        System.out.println("------------------------------------");
                    }
                    pedidoActual = pedidoId;
                    total = 0;
                    System.out.println("\n🧾 Pedido #" + pedidoId + " - Fecha: " + rs.getDate("fecha"));
                }

                String producto = rs.getString("producto");
                String categoria = rs.getString("categoria");
                int cantidad = rs.getInt("cantidad");
                double subtotal = rs.getDouble("subtotal");

                total += subtotal;

                System.out.printf(" - %s (%s) x%d → Subtotal: $%.2f\n",
                        producto, categoria, cantidad, subtotal);
            }

            if (pedidoActual != -1) {
                System.out.printf("   ➕ Total del pedido: $%.2f\n", total);
            }

        } catch (Exception e) {
            System.out.println("❌ Error al mostrar pedidos: " + e.getMessage());
        }
    }
}
