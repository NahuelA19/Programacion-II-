package service;

import dao.CategoriaDAOImpl;
import model.Categoria;

import java.util.List;

public class CategoriaServiceImpl implements GenericService<Categoria> {

    private CategoriaDAOImpl categoriaDAO = new CategoriaDAOImpl();

    @Override
    public boolean crear(Categoria c) {
        if (c.getNombre() == null || c.getNombre().trim().isEmpty()) {
            System.out.println("❌ El nombre no puede estar vacío.");
            return false;
        }

        if (categoriaDAO.existeNombre(c.getNombre())) {
            System.out.println("❌ Ya existe una categoría con ese nombre.");
            return false;
        }

        return categoriaDAO.crear(c);
    }

    @Override
    public Categoria leer(int id) {
        return categoriaDAO.leer(id);
    }

    @Override
    public boolean actualizar(Categoria c) {
        if (c.getNombre() == null || c.getNombre().trim().isEmpty()) {
            System.out.println("❌ El nombre no puede estar vacío.");
            return false;
        }

        return categoriaDAO.actualizar(c);
    }

    @Override
    public boolean eliminar(int id) {
        return categoriaDAO.eliminar(id);
    }

    @Override
    public List<Categoria> listar() {
        return categoriaDAO.listar();
    }
}
