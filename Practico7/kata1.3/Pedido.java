import java.util.ArrayList;

public class Pedido implements Pagable  {

    ArrayList<Producto> productos = new ArrayList<>();

    Cliente cliente = new Cliente();

    private String estado = "Disponible";

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

   public void cambiarEstado(String nuevoEstado) {
        String auxiliar = estado;
        this.estado = nuevoEstado;

        if(this.estado.equals(auxiliar) ) {

        } else {
            cliente.notificar("El producto ha cambiado de estado a:" + estado);

        }

   }


}
