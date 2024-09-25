public class Producto {
    private String nombre;
    private int stock;
    private String categoria;
    private int impuesto;
    private double precio;

    public Producto(String nombre, int stock, String categoria, int impuesto, double precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.categoria = categoria;
        this.impuesto = impuesto;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public double getPrecio() {
        return precio;
    }
}
