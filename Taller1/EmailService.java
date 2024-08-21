public class EmailService {
    public void enviarCorreo(Usuario usuario, String mensaje) {
        System.out.println("Enviando correo a " + usuario.getEmail() + ": " + mensaje);
    }
}
