
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void listarProductos() {
        for (Producto producto : productos) {
            producto.mostrarInfo();
            System.out.println("////////////////////////////////");
        }
    }

    public void buscarProductoPorId(String id) {
        for (Producto producto : this.productos) {
            if(id.equals(producto.getId())) {
                System.out.println("Productos encontrados por id: ");
                producto.mostrarInfo();
            }
        }
    }

    public void eliminarProductoPorId(String id) {
        this.productos.removeIf(producto -> id.equals(producto.getId()));
    }

    public void actulizarStock(String id, int nuevaCantidad) {
        for (Producto producto : this.productos) {
            if(id.equals(producto.getId())) {
                producto.setCantidad(nuevaCantidad);
            }
        }
    }

    public void filtrarPorCategoria(Producto.CategoriaProducto categoria) {
        System.out.println("..........................................................");
        System.out.println("Productos encontrados por categoria " + categoria + ": ");

        for (Producto producto : this.productos) {
            if(producto.getCategoria().equals(categoria)) {
                producto.mostrarInfo();
                System.out.println("----------------------------------------");
            }
        }
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto producto : this.productos) {
            total += producto.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;

        Producto productoMayor = productos.get(0);
        for (Producto producto : this.productos) {
            if(producto.getCantidad() > productoMayor.getCantidad()) {
                productoMayor = producto;
            }
        }
        return productoMayor;
    }

    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> productosFiltrados = new ArrayList<>();
        for (Producto producto : this.productos) {
            if(producto.getPrecio() >= min && producto.getPrecio() <= max) {
                productosFiltrados.add(producto);
            }
        }
        return productosFiltrados;
    }

    public void mostrarCategoriasDisponibles() {
        System.out.println("Categorías disponibles:");
        for (Producto.CategoriaProducto categoria : Producto.CategoriaProducto.values()) {
            System.out.println(categoria.name() + ": " + categoria.getDescripcion());
        }
    }
}