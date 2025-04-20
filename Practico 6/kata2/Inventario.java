import java.util.ArrayList;

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
            System.out.println("Id: " + producto.getId());
            System.out.println("Nombre: " +producto.getNombre());
            System.out.println("Producto: " +producto.getPrecio());
            System.out.println("Cantidad: " +producto.getCantidad());
            System.out.println("Categoria: "+producto.getCategoria());

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
        for (Producto producto : this.productos) {
            if(producto.getCategoria().equals(categoria)) {

                System.out.println("..........................................................");
                System.out.println("Productos encontrados por categoria " + categoria +": ");


                producto.mostrarInfoSinCategoria();
            }
        }
    }





    }

