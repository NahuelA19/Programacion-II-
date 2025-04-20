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
        for (Producto producto : this.productos) {
            System.out.println("Id: " + producto.getId());
            System.out.println("Nombre: " +producto.getNombre());
            System.out.println("Producto: " +producto.getPrecio());
            System.out.println("Cantidad: " +producto.getCantidad());
            System.out.println("Categoria: "+producto.getCategoria());

            System.out.println("////////////////////////////////");
        }
    }



}
