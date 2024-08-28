public class CalculoImpuestoReteIva extends Calculo {
    private final double impuesto = 0.10;

    @Override
    public double calcular(double x) {
        return x * impuesto;
    }

    public double getImpuesto() {
        return impuesto;
    }
}
