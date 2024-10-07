package ACBA;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Carlos", "Calle 3");
        Producto prod1 = new Producto(1, "Laptop", 800.0);
        Producto prod2 = new Producto(2, "Mouse", 20.0);

        Factura factura = new Factura();
        factura.procesarFactura(cliente, Arrays.asList(prod1, prod2));

        double totalConDescuento = factura.calcularPrecioConDescuento(10);
        System.out.println("Total con descuento: " + totalConDescuento);

        GestorProducto crudProducto = new GestorProducto();
        crudProducto.crearProducto(prod1);
        crudProducto.actualizarProducto(prod2);
    }
}
