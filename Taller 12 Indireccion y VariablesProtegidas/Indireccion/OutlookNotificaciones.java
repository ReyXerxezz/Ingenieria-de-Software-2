package Indireccion;

public class OutlookNotificaciones implements IServicioNotificaciones{
    @Override
    public Correo crearCorreo(Usuario usuario) {
        return new Correo("Buenas tardes " + usuario.getNombre() + ", este es tu correo desde Outlook.");
    }

    @Override
    public void enviarCorreo(Correo correo) {
        System.out.println("Enviando correo desde Outlook: " + correo.getContenido());
    }
}