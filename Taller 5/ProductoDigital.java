public class ProductoDigital extends Producto {
    private int tamanoArchivo;

    public ProductoDigital(int tamanoArchivo, String nombre, int cantidad, double precio){
        super(nombre, cantidad, precio);
        this.tamanoArchivo = tamanoArchivo;

    }

    @Override
    public double calcularCosto() {
        return 0;
    }
}
