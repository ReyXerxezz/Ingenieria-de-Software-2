package segundaPregunta;

public class main{
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        Notificacion notificacion = new Notificacion("Recordatorio de reunión", "daniel@gmail.com");

        sistema.enviarNotificacionPorSMS(notificacion);
        sistema.enviarNotificacionPorWhatsapp(notificacion);

        Tarea tarea = new Tarea("Completar informe mensual");

        sistema.insertarTarea(tarea);
        sistema.leerTarea(tarea);

        tarea.marcarComoCompletada();
        sistema.leerTarea(tarea);
    }
}