import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {
    private Connection conexion;

    public ProductoDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public void guardarProducto(Producto producto) throws SQLException {
        String sql = "INSERT INTO productos (nombre, stock, categoria, impuesto, precio) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, producto.getNombre());
            statement.setInt(2, producto.getStock());
            statement.setString(3, producto.getCategoria());
            statement.setInt(4, producto.getImpuesto());
            statement.setDouble(5, producto.getPrecio());
            statement.executeUpdate();
        }
    }

    public void actualizarProducto(Producto producto) throws SQLException {
        String sql = "UPDATE productos SET stock = ?, categoria = ?, impuesto = ?, precio = ? WHERE nombre = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, producto.getStock());
            statement.setString(2, producto.getCategoria());
            statement.setInt(3, producto.getImpuesto());
            statement.setDouble(4, producto.getPrecio());
            statement.setString(5, producto.getNombre());
            statement.executeUpdate();
        }
    }

    public void eliminarProducto(String nombre) throws SQLException {
        String sql = "DELETE FROM productos WHERE nombre = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, nombre);
            statement.executeUpdate();
        }
    }

    public Producto obtenerProducto(String nombre) throws SQLException {
        String sql = "SELECT * FROM productos WHERE nombre = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, nombre);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return new Producto(
                            resultSet.getString("nombre"),
                            resultSet.getInt("stock"),
                            resultSet.getString("categoria"),
                            resultSet.getInt("impuesto"),
                            resultSet.getDouble("precio")
                    );
                }
            }
        }
        return null;
    }

    public List<Producto> obtenerTodosLosProductos() throws SQLException {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM productos";
        try (PreparedStatement statement = conexion.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Producto producto = new Producto(
                        resultSet.getString("nombre"),
                        resultSet.getInt("stock"),
                        resultSet.getString("categoria"),
                        resultSet.getInt("impuesto"),
                        resultSet.getDouble("precio")
                );
                productos.add(producto);
            }
        }
        return productos;
    }
}

