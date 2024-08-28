public class CalculoImpuestoSaludable extends Calculo{
    private final double impuesto = 0.05;

    @Override
    public double calcular(double x) {
        return x * impuesto;
    }

    public double getImpuesto() {
        return impuesto;
    }
}
