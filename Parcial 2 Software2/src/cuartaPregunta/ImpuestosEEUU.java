package cuartaPregunta;

public class ImpuestosEEUU implements ImpuestoCalculator {
    @Override
    public void calcularImpuestos(double valor) {
        valor = valor * 0.3;
        System.out.println("El impuesto en EEUU es de: " + valor);
    }
}