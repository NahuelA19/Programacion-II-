package dao;

import model.Producto;
import java.util.List;

public interface ProductoDAO {
    Producto obtenerPorId(int id);
    boolean actualizar(Producto producto);
    List<Producto> listar();
    boolean crear(Producto producto);
    boolean eliminar(int id);
}
