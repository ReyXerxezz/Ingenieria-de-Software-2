public class ProductoMixto extends Producto implements Enviar{
    private double peso;
    private double tamanoArchivo;

    public ProductoMixto(String nombre, double precio, int cantidad, double peso, double tamanoArchivo){
        super(nombre, cantidad, precio);
        this.peso = peso;
        this.tamanoArchivo = tamanoArchivo;

    }

    @Override
    public double calcularCosto() {
        return getPrecio() * getCantidad() + peso * 0.5;
    }

    @Override
    public void enviarPorCorreo() {
        System.out.println("Enviando producto mixto por correo: " + getNombre());
    }

    public double getPeso() { return peso; }

    public double getTamanoArchivo() { return tamanoArchivo; }
}
