import java.util.ArrayList;
import java.util.Scanner;

public class main {

    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static PasswordValidator passwordValidator = new PasswordValidator();
    private static EmailService emailService = new EmailService();
    private static SalarioCalculator salarioCalculator = new SalarioCalculator();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Crear Usuario");
            System.out.println("2. Iniciar Sesión");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearUsuario(scanner);
                    break;
                case 2:
                    iniciarSesion(scanner);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void crearUsuario(Scanner scanner) {
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa tu apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingresa tu correo electrónico: ");
        String email = scanner.nextLine();

        String contrasena;
        while (true) {
            System.out.print("Ingresa tu contraseña: ");
            contrasena = scanner.nextLine();
            System.out.print("Confirma tu contraseña: ");
            String confirmacionContrasena = scanner.nextLine();

            if (contrasena.equals(confirmacionContrasena)) {
                if (passwordValidator.validarContrasena(contrasena)) {
                    System.out.println("Usuario creado exitosamente.");
                    break;
                } else {
                    System.out.println("La contraseña no es válida. Debe tener al menos 8 caracteres.");
                }
            } else {
                System.out.println("Las contraseñas no coinciden. Inténtalo de nuevo.");
            }
        }

        Usuario usuario = new Usuario(nombre, apellido, email, contrasena);
        usuarios.add(usuario);
    }

    private static void iniciarSesion(Scanner scanner) {
        System.out.print("Ingresa tu correo electrónico: ");
        String email = scanner.nextLine();
        System.out.print("Ingresa tu contraseña: ");
        String contrasena = scanner.nextLine();

        Usuario usuario = buscarUsuarioPorEmail(email);
        if (usuario == null) {
            System.out.println("El correo electrónico no existe.");
            return;
        }

        if (passwordValidator.validarSesion(usuario, contrasena)) {
            System.out.println("Sesión iniciada exitosamente.");
            menuUsuario(scanner, usuario);
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }

    private static void menuUsuario(Scanner scanner, Usuario usuario) {
        while (true) {
            System.out.println("\n--- Menú de Usuario ---");
            System.out.println("1. Enviar Correo");
            System.out.println("2. Calcular Salario");
            System.out.println("3. Cerrar Sesión");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    enviarCorreo(scanner, usuario);
                    break;
                case 2:
                    calcularSalario(scanner);
                    break;
                case 3:
                    System.out.println("Cerrando sesión...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void enviarCorreo(Scanner scanner, Usuario usuario) {
        System.out.print("Ingresa el correo electrónico del destinatario: ");
        String destinatarioEmail = scanner.nextLine();

        Usuario destinatario = buscarUsuarioPorEmail(destinatarioEmail);
        if (destinatario == null) {
            System.out.println("El destinatario no existe.");
            return;
        }

        System.out.print("Ingresa el mensaje: ");
        String mensaje = scanner.nextLine();
        emailService.enviarCorreo(destinatario, mensaje);
    }

    private static void calcularSalario(Scanner scanner) {
        System.out.print("Ingresa la cantidad de horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();
        System.out.print("Ingresa la tarifa por hora: ");
        double tarifaPorHora = scanner.nextDouble();
        scanner.nextLine();

        double salario = salarioCalculator.calcularSalario(horasTrabajadas, tarifaPorHora);
        System.out.println("El salario calculado es: $" + salario);
    }

    private static Usuario buscarUsuarioPorEmail(String email) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email)) {
                return usuario;
            }
        }
        return null;
    }
}

//Usuario: Mantiene la información básica del usuario. Esta clase sigue teniendo una única responsabilidad: manejar los datos del usuario.
//EmailService: Esta clase se centra únicamente en el envío de correos electrónicos, lo que la hace responsable solo de esa funcionalidad.
//PasswordValidator: Separa la lógica de seguridad y autenticación de la clase Usuario, permitiendo cambios en la validación de contraseñas sin afectar otras partes del sistema.
//SalarioCalculator: Encapsula la lógica de cálculo de salarios, permitiendo que cualquier cambio en la forma de calcular el salario se haga en esta clase sin interferir con otras responsabilidades.
