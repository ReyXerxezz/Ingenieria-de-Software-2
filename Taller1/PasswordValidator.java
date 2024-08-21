public class PasswordValidator {
    public boolean validarContraseña(String contrasena) {

        return contrasena.length() >= 8;
    }

    public boolean validarSesion(Usuario usuario, String contrasena) {
        return usuario.getContrasena().equals(contrasena);
    }
}
