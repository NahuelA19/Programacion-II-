package dao;

import model.Pedido;
import util.ConexionDB;

import java.sql.*;

public class PedidoDAOImpl {

    public int insertar(Pedido pedido, Connection conn) throws SQLException {
        String sql = "INSERT INTO pedidos (fecha, total) VALUES (?, ?)";
        int generatedId = -1;

        try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setDate(1, Date.valueOf(pedido.getFecha()));
            stmt.setDouble(2, pedido.getTotal());

            stmt.executeUpdate();

            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    generatedId = rs.getInt(1);
                }
            }
        }

        return generatedId;
    }

    public void actualizarTotal(int pedidoId, double total, Connection conn) throws SQLException {
        String sql = "UPDATE pedidos SET total = ? WHERE id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDouble(1, total);
            stmt.setInt(2, pedidoId);
            stmt.executeUpdate();
        }
    }
}
