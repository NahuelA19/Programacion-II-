package service;

import dao.ProductoDAOImpl;
import model.Producto;
import java.util.List;

public class ProductoServiceImpl implements GenericService<Producto> {

    private ProductoDAOImpl productoDAO = new ProductoDAOImpl();

    @Override
    public boolean crear(Producto p) {
        if (p.getNombre() == null || p.getNombre().trim().isEmpty()) {
            System.out.println("❌ El nombre del producto no puede estar vacío.");
            return false;
        }

        if (p.getPrecio() < 0) {
            System.out.println("❌ El precio no puede ser negativo.");
            return false;
        }

        if (p.getCantidad() < 0) {
            System.out.println("❌ La cantidad no puede ser negativa.");
            return false;
        }

        if (p.getCategoria() == null || p.getCategoria().getId() <= 0) {
            System.out.println("❌ La categoría es inválida.");
            return false;
        }

        return productoDAO.crear(p);
    }

    @Override
    public Producto leer(int id) {
        return productoDAO.leer(id);
    }

    @Override
    public boolean actualizar(Producto p) {
        if (p.getNombre() == null || p.getNombre().trim().isEmpty()) {
            System.out.println("❌ El nombre del producto no puede estar vacío.");
            return false;
        }

        return productoDAO.actualizar(p);
    }

    @Override
    public boolean eliminar(int id) {
        return productoDAO.eliminar(id);
    }

    @Override
    public List<Producto> listar() {
        return productoDAO.listar();
    }
}
