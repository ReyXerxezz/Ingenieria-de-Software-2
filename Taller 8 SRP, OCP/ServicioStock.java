public class ServicioStock {

    public boolean disminuirStock(Producto producto, int cantidad) {
        if (cantidad <= producto.getStock()) {
            producto.setStock(producto.getStock() - cantidad);
            return true;
        } else {
            return false;
        }
    }

    public void aumentarStock(Producto producto, int cantidad) {
        producto.setStock(producto.getStock() - cantidad);
    }
}
