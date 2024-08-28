import java.util.Scanner;
import java.util.UUID;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el correo del comprador: ");
        String correo = scanner.nextLine();

        String idFactura = UUID.randomUUID().toString();

        Factura factura = new Factura(correo, idFactura);

        factura.agregarCategoriaImpuesto("Verduras", new CalculoImpuestoSaludable());
        factura.agregarCategoriaImpuesto("General", new CalculoImpuestoIva());
        factura.agregarCategoriaImpuesto("Electrónica", new CalculoImpuestoReteIva());

        String continuar;
        do {
            System.out.print("Ingrese el nombre del producto: ");
            String nombreProducto = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precioProducto = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Ingrese la categoría del producto (Verduras, General, Electrónica): ");
            String categoria = scanner.nextLine();

            factura.agregarProducto(nombreProducto, precioProducto, categoria);

            System.out.print("¿Desea agregar otro producto? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        factura.mostrarFactura();

        scanner.close();
    }
}
