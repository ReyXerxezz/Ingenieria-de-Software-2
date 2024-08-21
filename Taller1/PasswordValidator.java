public class PasswordValidator {
    public boolean validarContrasena(String contrasena) {

        return contrasena.length() >= 8;
    }

    public boolean validarSesion(Usuario usuario, String contrasena) {
        return usuario.getContrasena().equals(contrasena);
    }
}
