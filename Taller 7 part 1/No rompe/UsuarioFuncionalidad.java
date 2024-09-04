public class UsuarioFuncionalidad {
    private IServicioDeNotificaciones servicioDeNotificaciones;

    public UsuarioFuncionalidad(IServicioDeNotificaciones servicioDeNotificaciones) {
        this.servicioDeNotificaciones = servicioDeNotificaciones;
    }

    public void enviarNotificacion(){
        servicioDeNotificaciones.enviarCorreo();
    }
}
