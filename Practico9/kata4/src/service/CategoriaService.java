package service;

import model.Categoria;
import java.util.List;

public interface CategoriaService {
    boolean crearCategoria(Categoria categoria);
    Categoria obtenerCategoria(int id);
    boolean actualizarCategoria(Categoria categoria);
    boolean eliminarCategoria(int id);
    List<Categoria> listarCategorias();
}
