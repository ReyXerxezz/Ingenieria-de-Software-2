package ACBA;

public class GestorProducto {
    public void crearProducto(Producto producto) {
        System.out.println("Producto creado: " + producto.getName());
    }

    public Producto leerProducto(int id) {
        return new Producto(id, "ProductoX", 50.0);
    }

    public void actualizarProducto(Producto producto) {
        System.out.println("Producto actualizado: " + producto.getName());
    }

    public void eliminarProducto(int id) {
        System.out.println("Producto eliminado con ID: " + id);
    }
}
