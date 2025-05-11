import java.util.ArrayList;

public class Pedido implements Pagable  {

    ArrayList<Producto> productos = new ArrayList<>();


    public Pedido() {
    }

    public Pedido(ArrayList<Producto> productos) {
        this.productos = productos;
    }


    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }


    @Override
    public double calcularTotal() {

        double total = 0;


        for (Producto producto : productos) {

           total = total+ producto.getPrecio();

        }

        return total;
    }
}
