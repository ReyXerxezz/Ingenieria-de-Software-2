public class CalculoImpuestoIva extends Calculo {
    private final double impuesto = 0.19;

    @Override
    public double calcular(double x) {
        return x * impuesto;
    }

    public double getImpuesto() {
        return impuesto;
    }
}
