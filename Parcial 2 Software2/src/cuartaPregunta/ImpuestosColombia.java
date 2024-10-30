package cuartaPregunta;

public class ImpuestosColombia implements ImpuestoCalculator {
    @Override
    public void calcularImpuestos(double valor) {
        valor = valor * 0.19;
        System.out.println("El impuesto en Colombia es de: " + valor);
    }
}
