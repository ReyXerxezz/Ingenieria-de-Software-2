public class DescuentoFijo extends Descuento {
    private double valor = 0.05;
    @Override
    public double calcular (Producto producto) {
        return producto.getPrecio()- (producto.getPrecio() * valor);
    }
}
