import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Factura {
    private String correo;
    private String id;
    private double total;
    private double impuesto;
    private List<String> productos;
    private Map<String, Calculo> categoriasImpuestos;

    public Factura(String correo, String id) {
        this.correo = correo;
        this.id = id;
        this.productos = new ArrayList<>();
        this.total = 0.0;
        this.impuesto = 0.0;
        this.categoriasImpuestos = new HashMap<>();
    }

    public void agregarCategoriaImpuesto(String categoria, Calculo calculoImpuesto) {
        categoriasImpuestos.put(categoria, calculoImpuesto);
    }

    public void agregarProducto(String nombre, double precio, String categoria) {
        productos.add(nombre + " - $" + precio);
        Calculo calculoImpuesto = categoriasImpuestos.get(categoria);
        if (calculoImpuesto != null) {
            this.impuesto += calculoImpuesto.calcular(precio);
        }
        this.total += precio;
    }

    public void mostrarFactura() {
        System.out.println("Factura ID: " + id);
        System.out.println("Correo: " + correo);
        System.out.println("Productos:");
        for (String producto : productos) {
            System.out.println("- " + producto);
        }
        System.out.println("Impuesto total: $" + impuesto);
        System.out.println("Total a pagar (con impuestos): $" + (total + impuesto));
    }
}