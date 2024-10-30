package segundaPregunta;

public class Notificacion {
    private String mensaje;
    private String destinatario;

    public Notificacion(String mensaje, String destinatario) {
        this.mensaje = mensaje;
        this.destinatario = destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getDestinatario() {
        return destinatario;
    }
}