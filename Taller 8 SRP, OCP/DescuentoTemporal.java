public class DescuentoTemporal extends Descuento{
    private double valor = 0.30;
    @Override
    public double calcular(Producto producto) {
        return producto.getPrecio()- (producto.getPrecio() * valor);
    }
}
