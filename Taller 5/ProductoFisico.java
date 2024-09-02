public class ProductoFisico extends Producto implements Enviar {
    private double peso;

    public ProductoFisico(String nombre, double precio, int cantidad, double peso) {
        super(nombre,cantidad,precio);
        this.peso = peso;
    }

    @Override
    public double calcularCosto() {
        return getPrecio() * getCantidad() + peso * 0.5;
    }

    @Override
    public void enviarPorCorreo() {
        System.out.println("Enviando producto físico por correo: " + getNombre());
    }

    public double getPeso() {
        return peso;
    }
}
