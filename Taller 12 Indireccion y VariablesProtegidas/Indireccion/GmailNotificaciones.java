package Indireccion;

public class GmailNotificaciones implements IServicioNotificaciones{
    @Override
    public Correo crearCorreo(Usuario usuario) {
        return new Correo("Buenas tardes " + usuario.getNombre() + ", este es tu correo desde Gmail.");
    }

    @Override
    public void enviarCorreo(Correo correo) {
        System.out.println("Enviando correo desde Gmail: " + correo.getContenido());
    }
}
