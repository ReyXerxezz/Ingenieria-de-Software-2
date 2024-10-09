package Indireccion;

public class main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Carlos", "101", new GmailNotificaciones());
        Usuario usuario2 = new Usuario("Pepe", "102", new OutlookNotificaciones());

        usuario1.generarCorreo();
        usuario2.generarCorreo();
    }
}
