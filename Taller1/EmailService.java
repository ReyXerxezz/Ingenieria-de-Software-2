public class EmailService {
    public void enviarCorreo(Usuario usuario, String mensaje) {
        // Lógica para enviar un correo electrónico
        System.out.println("Enviando correo a " + usuario.getEmail() + ": " + mensaje);
    }
}
