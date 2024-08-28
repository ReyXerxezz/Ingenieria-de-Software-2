public class ProductoFisico extends Producto {
    private int peso;

    public ProductoFisico(int peso, String nombre, int cantidad, double precio) {
        super(nombre,cantidad,precio);
        this.peso = peso;
    }

    @Override
    public double calcularCosto() {
        return 0;
    }
}
