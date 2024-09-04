public class UsuarioFuncionalidad {
    private ServicioDeCorreo servicioDeCorreo = new ServicioDeCorreo();

    public UsuarioFuncionalidad() {

    }

    public void enviarNotificacion(){
        servicioDeCorreo.enviarCorreo();
    }
}