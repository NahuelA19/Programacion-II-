package service;

import model.Producto;
import java.util.List;

public interface ProductoService {
    boolean crearProducto(Producto producto);
    Producto obtenerProducto(int id);
    boolean actualizarProducto(Producto producto);
    boolean eliminarProducto(int id);
    List<Producto> listarProductos();
    List<Producto> listarProductosPorCategoria(int idCategoria);
}
