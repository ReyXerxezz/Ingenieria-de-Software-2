package PrimeraPregunta;

public class Main {
    public static void main(String[] args) {
        ServicioEnvioFactory factory = new ServicioEnvioConcreto();

        ServicioEnvio servicioEnvio = factory.crearServicioEnvio();

        String paquete1 = "Paquete 1";
        String paquete2 = "Paquete 2";

        servicioEnvio.enviarFormaExpress(paquete1);
        servicioEnvio.enviarFormaRegular(paquete2);
    }
}
