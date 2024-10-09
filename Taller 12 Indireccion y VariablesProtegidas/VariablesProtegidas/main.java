package VariablesProtegidas;

public class main {
    public static void main(String[] args) {
        CanalNotificacion canalCorreo = new CanalCorreoElectronico();
        CanalNotificacion canalSMS = new CanalSMS();
        CanalNotificacion canalWhatsapp = new CanalWhatsapp();

        Notificador notificador = new Notificador(canalCorreo);
        Notificador notificador1 = new Notificador(canalSMS);
        Notificador notificador2 = new Notificador(canalWhatsapp);

        Notificacion notificacion = new Notificacion("Hola", ":)");
        notificador.enviarNotificacion(notificacion);
        notificador1.enviarNotificacion(notificacion);
        notificador2.enviarNotificacion(notificacion);
    }
}
