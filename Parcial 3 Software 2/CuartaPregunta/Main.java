package CuartaPregunta;

public class Main {
    public static void main(String[] args) {
        Configuracion configuracion = Configuracion.getInstancia();

        configuracion.setUrl("http://mi-url.com");
        configuracion.setUsuario("miUsuario");
        configuracion.setPassword("miPassword");

        System.out.println("URL: " + configuracion.getUrl());
        System.out.println("Usuario: " + configuracion.getUsuario());
        System.out.println("Password: " + configuracion.getPassword());

        Configuracion otraConfiguracion = Configuracion.getInstancia();
        System.out.println("¿Son la misma instancia? " + (configuracion == otraConfiguracion));
    }
}
