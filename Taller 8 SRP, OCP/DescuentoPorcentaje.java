public class DescuentoPorcentaje extends Descuento{
    private double valor = 0.19;
    @Override
    public double calcular(Producto producto) {
        return producto.getPrecio()- (producto.getPrecio() * valor);
    }
}