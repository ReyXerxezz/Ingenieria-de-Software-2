public class ProductoMixto extends Producto{
    private int peso;
    private int tamanoArchivo;

    public ProductoMixto(int peso, int tamanoArchivo, String nombre, int cantidad, double precio){
        super(nombre, cantidad, precio);
        this.peso = peso;
        this.tamanoArchivo = tamanoArchivo;

    }

    @Override
    public double calcularCosto() {
        return 0;
    }
}
