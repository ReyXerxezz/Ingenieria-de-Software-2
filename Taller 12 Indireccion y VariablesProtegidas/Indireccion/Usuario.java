package Indireccion;

public class Usuario {
    private String nombre;
    private String identificacion;
    private IServicioNotificaciones servicioNotificaciones;

    public Usuario(String nombre, String identificacion, IServicioNotificaciones servicioNotificaciones) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.servicioNotificaciones = servicioNotificaciones;
    }

    public void generarCorreo() {
        Correo correo = servicioNotificaciones.crearCorreo(this);
        servicioNotificaciones.enviarCorreo(correo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public IServicioNotificaciones getServicioNotificaciones() {
        return servicioNotificaciones;
    }

    public void setServicioNotificaciones(IServicioNotificaciones servicioNotificaciones) {
        this.servicioNotificaciones = servicioNotificaciones;
    }
}
