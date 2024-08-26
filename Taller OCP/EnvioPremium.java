public class EnvioPremium extends Envio  {
    @Override
    public double calcularCosto(double peso, double distancia) {
        return peso * 2 + distancia * 1;
    }
}