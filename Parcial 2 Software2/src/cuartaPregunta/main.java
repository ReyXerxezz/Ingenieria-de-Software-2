package cuartaPregunta;

public class main {
    public static void main(String[] args) {
        double valor = 1000.0;
        System.out.println("Para el valor de "+valor+" los impuestos correspondientes en cada país son: ");

        ImpuestoCalculator calculadorColombia = ImpuestosFactory.getCalculator("colombia");
        calculadorColombia.calcularImpuestos(valor);

        ImpuestoCalculator calculadorEEUU = ImpuestosFactory.getCalculator("eeuu");
        calculadorEEUU.calcularImpuestos(valor);

        ImpuestoCalculator calculadorFrancia = ImpuestosFactory.getCalculator("francia");
        calculadorFrancia.calcularImpuestos(valor);
    }
}