package PrimeraPregunta;

public class ServicioEnvioConcreto implements ServicioEnvioFactory {
    @Override
    public ServicioEnvio crearServicioEnvio() {
        return new ServicioEnvio();
    }
}
