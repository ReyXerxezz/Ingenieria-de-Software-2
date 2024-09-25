public class ServicioEnvio {
    private ServicioStock gestorStock;

    public ServicioEnvio(ServicioStock gestorStock) {
        this.gestorStock = gestorStock;
    }

    public boolean enviarStock(Producto producto, int cantidad) {
        return gestorStock.disminuirStock(producto, cantidad);
    }
}
