public class Main {
    public static void  main(String [] args){
        IServicioDeNotificaciones servicioDeNotificaciones = new ServicioDeNotificacionesImpl();
        UsuarioFuncionalidad usuarioFuncionalidad = new UsuarioFuncionalidad(servicioDeNotificaciones);
        usuarioFuncionalidad.enviarNotificacion();
    }

}
