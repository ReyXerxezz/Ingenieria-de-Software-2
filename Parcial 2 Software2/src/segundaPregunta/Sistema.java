package segundaPregunta;

public class Sistema {
    public void enviarNotificacionPorSMS(Notificacion notificacion) {
        System.out.println("Enviando notificacion por SMS: " + notificacion.getMensaje() + " a " + notificacion.getDestinatario());
    }

    public void enviarNotificacionPorWhatsapp(Notificacion notificacion) {
        System.out.println("Enviando notificacion por Whatsapp: " + notificacion.getMensaje() + " a " + notificacion.getDestinatario());
    }

    public void insertarTarea(Tarea tarea) {
        System.out.println("Insertando tarea: " + tarea.getDescripcion());
    }

    public void leerTarea(Tarea tarea) {
        System.out.println("Obteniendo tarea: " + tarea.getDescripcion() + " - Completada: " + tarea.isCompletada());
    }
}