package cuartaPregunta;

public class ImpuestosFrancia implements ImpuestoCalculator {
    @Override
    public void calcularImpuestos(double valor) {
        valor = valor * 0.5;
        System.out.println("El impuesto en Francia es de: " + valor);
    }
}