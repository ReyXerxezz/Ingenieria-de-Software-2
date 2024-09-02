import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear listas de DVDs, Cartillas, y Libros
        List<DVD> dvds = new ArrayList<>();
        dvds.add(new DVD("Matrix", 1999));
        dvds.add(new DVD("Inception", 2010));
        dvds.add(new DVD("Interstellar", 2014));

        List<Cartilla> cartillas = new ArrayList<>();
        cartillas.add(new Cartilla("Santillana", "Matemáticas 1"));
        cartillas.add(new Cartilla("Norma", "Lenguaje 3"));
        cartillas.add(new Cartilla("Alfaguara", "Ciencias Sociales 2"));

        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("Cien Años de Soledad", "Gabriel García Márquez"));
        libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes"));
        libros.add(new Libro("El Principito", "Antoine de Saint-Exupéry"));

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("=== Menú Principal ===");
            System.out.println("1. Acceder a Libros");
            System.out.println("2. Acceder a Cartillas");
            System.out.println("3. Acceder a DVDs");
            System.out.println("4. Salir");
            System.out.print("Selecciona una sección: ");
            int seccion = scanner.nextInt();

            switch (seccion) {
                case 1:
                    manejarLibros(libros, scanner);
                    break;
                case 2:
                    manejarCartillas(cartillas, scanner);
                    break;
                case 3:
                    manejarDVDs(dvds, scanner);
                    break;
                case 4:
                    continuar = false;
                    System.out.println("¡Gracias por utilizar la librería!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del menú.");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static void manejarLibros(List<Libro> libros, Scanner scanner) {
        System.out.println("=== Libros Disponibles ===");
        for (int i = 0; i < libros.size(); i++) {
            System.out.println((i + 1) + ". " + libros.get(i).getTitulo() + " - Autor " + libros.get(i).getAutor());
        }
        System.out.print("Selecciona un Libro: ");
        int libroSeleccionado = scanner.nextInt();

        if (libroSeleccionado > 0 && libroSeleccionado <= libros.size()) {
            Libro libro = libros.get(libroSeleccionado - 1);
            System.out.println("1. Prestar");
            System.out.println("2. Devolver");
            System.out.println("3. Solicitar Nueva Versión");
            System.out.println("4. Renovar Portada");
            System.out.println("5. Mantenimiento de Hojas");
            System.out.print("Selecciona una acción: ");
            int accion = scanner.nextInt();

            switch (accion) {
                case 1:
                    libro.prestar();
                    break;
                case 2:
                    libro.devolver();
                    break;
                case 3:
                    libro.solicitarNuevaVersion();
                    break;
                case 4:
                    libro.renovarPortada();
                    break;
                case 5:
                    libro.mantenimientoHojas();
                    break;
                default:
                    System.out.println("Acción no válida.");
            }
        } else {
            System.out.println("Selección no válida.");
        }
    }

    private static void manejarCartillas(List<Cartilla> cartillas, Scanner scanner) {
        System.out.println("=== Cartillas Disponibles ===");
        for (int i = 0; i < cartillas.size(); i++) {
            System.out.println((i + 1) + ". " + cartillas.get(i).getNombre() + " - Editorial " + cartillas.get(i).getEditorial());
        }
        System.out.print("Selecciona una Cartilla: ");
        int cartillaSeleccionada = scanner.nextInt();

        if (cartillaSeleccionada > 0 && cartillaSeleccionada <= cartillas.size()) {
            Cartilla cartilla = cartillas.get(cartillaSeleccionada - 1);
            System.out.println("1. Prestar");
            System.out.println("2. Devolver");
            System.out.println("3. Mantenimiento de Hojas");
            System.out.print("Selecciona una acción: ");
            int accion = scanner.nextInt();

            switch (accion) {
                case 1:
                    cartilla.prestar();
                    break;
                case 2:
                    cartilla.devolver();
                    break;
                case 3:
                    cartilla.mantenimientoHojas();
                    break;
                default:
                    System.out.println("Acción no válida.");
            }
        } else {
            System.out.println("Selección no válida.");
        }
    }

    private static void manejarDVDs(List<DVD> dvds, Scanner scanner) {
        System.out.println("=== DVDs Disponibles ===");
        for (int i = 0; i < dvds.size(); i++) {
            System.out.println((i + 1) + ". " + dvds.get(i).getNombre() + " (" + dvds.get(i).getAno() + ")");
        }
        System.out.print("Selecciona un DVD: ");
        int dvdSeleccionado = scanner.nextInt();

        if (dvdSeleccionado > 0 && dvdSeleccionado <= dvds.size()) {
            DVD dvd = dvds.get(dvdSeleccionado - 1);
            System.out.println("1. Prestar");
            System.out.println("2. Devolver");
            System.out.println("3. Solicitar Nueva Versión");
            System.out.print("Selecciona una acción: ");
            int accion = scanner.nextInt();

            switch (accion) {
                case 1:
                    dvd.prestar();
                    break;
                case 2:
                    dvd.devolver();
                    break;
                case 3:
                    dvd.solicitarNuevaVersion();
                    break;
                default:
                    System.out.println("Acción no válida.");
            }
        } else {
            System.out.println("Selección no válida.");
        }
    }
}