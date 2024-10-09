package Indireccion;

public interface IServicioNotificaciones {
    Correo crearCorreo(Usuario usuario);
    void enviarCorreo(Correo correo);
}
