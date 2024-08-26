public class EnvioExpress extends Envio {
    @Override
    public double calcularCosto(double peso, double distancia) {
        return peso * 1.0 + distancia * 0.2;
    }
}