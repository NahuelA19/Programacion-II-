import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Pedido implements Comparable<Pedido> {
    private int id;
    private List<Producto<?>> productos;
    private LocalDate fecha;

    public Pedido(int id, LocalDate fecha) {
        this.id = id;
        this.fecha = fecha;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto<?> producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto<?> p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public int compareTo(Pedido otro) {
        return Double.compare(this.calcularTotal(), otro.calcularTotal());
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", total=" + calcularTotal() +
                '}';
    }
}

class ComparadorPedidosPorFecha implements Comparator<Pedido> {
    @Override
    public int compare(Pedido p1, Pedido p2) {
        return p1.getFecha().compareTo(p2.getFecha());
    }
}



