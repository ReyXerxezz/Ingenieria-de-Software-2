import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear listas de paquetes
        List<PaquetePeligroso> paquetesPeligrosos = new ArrayList<>();
        paquetesPeligrosos.add(new PaquetePeligroso(10.5, 2.5, 1.5, true));
        paquetesPeligrosos.add(new PaquetePeligroso(5.0, 3.0, 2.0, false));

        List<PaquetePequeño> paquetesPequeños = new ArrayList<>();
        paquetesPequeños.add(new PaquetePequeño(1.2, 0.5, 0.5, 1000));
        paquetesPequeños.add(new PaquetePequeño(0.8, 0.3, 0.4, 500));

        List<PaqueteGrande> paquetesGrandes = new ArrayList<>();
        paquetesGrandes.add(new PaqueteGrande(20.0, 4.0, 3.0, 10.0, "Aéreo"));
        paquetesGrandes.add(new PaqueteGrande(25.0, 5.0, 3.5, 12.0, "Marítimo"));

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("=== Menú Principal ===");
            System.out.println("1. Paquetes Peligrosos");
            System.out.println("2. Paquetes Pequeños");
            System.out.println("3. Paquetes Grandes");
            System.out.println("4. Salir");
            System.out.print("Selecciona una sección: ");
            int seccion = scanner.nextInt();

            switch (seccion) {
                case 1:
                    manejarPaquetesPeligrosos(paquetesPeligrosos, scanner);
                    break;
                case 2:
                    manejarPaquetesPequeños(paquetesPequeños, scanner);
                    break;
                case 3:
                    manejarPaquetesGrandes(paquetesGrandes, scanner);
                    break;
                case 4:
                    continuar = false;
                    System.out.println("¡Gracias por utilizar el sistema de gestión de paquetes!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del menú.");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static void manejarPaquetesPeligrosos(List<PaquetePeligroso> paquetes, Scanner scanner) {
        System.out.println("=== Paquetes Peligrosos ===");
        for (int i = 0; i < paquetes.size(); i++) {
            System.out.println((i + 1) + ". Paquete " + (i + 1) + " - Peso: " + paquetes.get(i).getPeso() + " kg");
        }
        System.out.print("Selecciona un Paquete Peligroso: ");
        int paqueteSeleccionado = scanner.nextInt();

        if (paqueteSeleccionado > 0 && paqueteSeleccionado <= paquetes.size()) {
            PaquetePeligroso paquete = paquetes.get(paqueteSeleccionado - 1);
            System.out.println("1. Verificar contenido peligroso");
            System.out.println("2. Asegurar contenido peligroso");
            System.out.print("Selecciona una acción: ");
            int accion = scanner.nextInt();

            switch (accion) {
                case 1:
                    System.out.println("¿El contenido es peligroso? " + paquete.verificarContenidoPeligroso());
                    break;
                case 2:
                    paquete.asegurarContenidoPeligroso();
                    break;
                default:
                    System.out.println("Acción no válida.");
            }
        } else {
            System.out.println("Selección no válida.");
        }
    }

    private static void manejarPaquetesPequeños(List<PaquetePequeño> paquetes, Scanner scanner) {
        System.out.println("=== Paquetes Pequeños ===");
        for (int i = 0; i < paquetes.size(); i++) {
            System.out.println((i + 1) + ". Paquete " + (i + 1) + " - Peso: " + paquetes.get(i).getPeso() + " kg, Valor declarado: " + paquetes.get(i).getValorDeclarado());
        }
        System.out.print("Selecciona un Paquete Pequeño: ");
        int paqueteSeleccionado = scanner.nextInt();

        if (paqueteSeleccionado > 0 && paqueteSeleccionado <= paquetes.size()) {
            PaquetePequeño paquete = paquetes.get(paqueteSeleccionado - 1);
            System.out.println("1. Calcular costo de envío");
            System.out.print("Selecciona una acción: ");
            int accion = scanner.nextInt();

            if (accion == 1) {
                double costoEnvio = paquete.calcularCostoEnvioPequeño();
                System.out.println("El costo de envío es: $" + costoEnvio);
            } else {
                System.out.println("Acción no válida.");
            }
        } else {
            System.out.println("Selección no válida.");
        }
    }

    private static void manejarPaquetesGrandes(List<PaqueteGrande> paquetes, Scanner scanner) {
        System.out.println("=== Paquetes Grandes ===");
        for (int i = 0; i < paquetes.size(); i++) {
            System.out.println((i + 1) + ". Paquete " + (i + 1) + " - Peso: " + paquetes.get(i).getPeso() + " kg, Medio de transporte: " + paquetes.get(i).getMedioTransporte());
        }
        System.out.print("Selecciona un Paquete Grande: ");
        int paqueteSeleccionado = scanner.nextInt();

        if (paqueteSeleccionado > 0 && paqueteSeleccionado <= paquetes.size()) {
            PaqueteGrande paquete = paquetes.get(paqueteSeleccionado - 1);
            System.out.println("1. Calcular costo de envío");
            System.out.print("Selecciona una acción: ");
            int accion = scanner.nextInt();

            if (accion == 1) {
                double costoEnvio = paquete.calcularCostoEnvioGrande();
                System.out.println("El costo de envío es: $" + costoEnvio);
            } else {
                System.out.println("Acción no válida.");
            }
        } else {
            System.out.println("Selección no válida.");
        }
    }
}