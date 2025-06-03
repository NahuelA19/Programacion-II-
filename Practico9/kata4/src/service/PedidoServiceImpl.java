package service;

import dao.ItemPedidoDAOImpl;
import dao.PedidoDAOImpl;
import dao.ProductoDAOImpl;
import model.ItemPedido;
import model.Pedido;
import model.Producto;
import util.ConexionDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

public class PedidoServiceImpl {

    private final PedidoDAOImpl pedidoDAO = new PedidoDAOImpl();
    private final ItemPedidoDAOImpl itemDAO = new ItemPedidoDAOImpl();
    private final ProductoDAOImpl productoDAO = new ProductoDAOImpl();

    public void crearPedido(Pedido pedido) {
        if (pedido.getItems() == null || pedido.getItems().isEmpty()) {
            System.out.println("El pedido debe tener al menos un ítem.");
            return;
        }

        Connection conn = null;
        try {
            conn = ConexionDB.conectar();
            conn.setAutoCommit(false);

            double total = 0.0;

            // Validar ítems y calcular subtotales
            for (ItemPedido item : pedido.getItems()) {
                Producto productoBD = productoDAO.obtenerPorId(item.getProducto().getId());

                if (productoBD == null) {
                    throw new RuntimeException("Producto no encontrado: ID " + item.getProducto().getId());
                }

                if (productoBD.getCantidad() < item.getCantidad()) {
                    throw new RuntimeException("Stock insuficiente para producto: " + productoBD.getNombre());
                }

                if (item.getCantidad() <= 0) {
                    throw new RuntimeException("La cantidad debe ser mayor a cero.");
                }

                double subtotal = productoBD.getPrecio() * item.getCantidad();
                item.setSubtotal(subtotal);
                total += subtotal;

                // Descontar stock
                productoBD.setCantidad(productoBD.getCantidad() - item.getCantidad());
                productoDAO.actualizar(productoBD);
            }

            pedido.setFecha(LocalDate.now());
            pedido.setTotal(total);

            // Insertar el pedido
            int pedidoId = pedidoDAO.insertar(pedido, conn);

            // Insertar ítems
            for (ItemPedido item : pedido.getItems()) {
                itemDAO.insertar(item, pedidoId);
            }

            // Actualizar total del pedido
            pedidoDAO.actualizarTotal(pedidoId, total, conn);

            conn.commit();
            System.out.println("✅ Pedido registrado correctamente.");
        } catch (Exception e) {
            if (conn != null) {
                try {
                    conn.rollback();
                    System.out.println("❌ Pedido cancelado por error: " + e.getMessage());
                } catch (SQLException ex) {
                    System.out.println("⚠️ Error en rollback: " + ex.getMessage());
                }
            }
        } finally {
            if (conn != null) {
                try {
                    conn.setAutoCommit(true);
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("⚠️ Error cerrando conexión: " + ex.getMessage());
                }
            }
        }
    }
}


