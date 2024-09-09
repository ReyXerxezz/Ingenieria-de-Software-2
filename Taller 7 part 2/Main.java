import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaEnvios sistemaEnvios = new SistemaEnvios();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ID de la orden: ");
        String id = scanner.nextLine();

        System.out.print("Ingrese el origen de la orden: ");
        String origen = scanner.nextLine();

        System.out.print("Ingrese el destino de la orden: ");
        String destino = scanner.nextLine();

        Orden orden = sistemaEnvios.crearOrden(id, new Date(), origen, destino);

        System.out.print("Ingrese el proveedor de envío (DHL, FedEx, UPS): ");
        String proveedor = scanner.nextLine();

        sistemaEnvios.enviarOrden(orden, proveedor);

        System.out.println("\nDetalles de la orden:");
        System.out.println("ID: " + orden.getId());
        System.out.println("Origen: " + orden.getOrigen());
        System.out.println("Destino: " + orden.getDestino());
        System.out.println("Fecha: " + orden.getFecha());
    }
}

