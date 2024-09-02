public class ProductoDigital extends Producto {
    private double tamanoArchivo;

    public ProductoDigital(String nombre, double precio, int cantidad, double tamanoArchivo){
        super(nombre, cantidad, precio);
        this.tamanoArchivo = tamanoArchivo;

    }

    @Override
    public double calcularCosto() {
        return getPrecio() * getCantidad();
    }
}
