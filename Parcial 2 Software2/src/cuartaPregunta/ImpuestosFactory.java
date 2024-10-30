package cuartaPregunta;

public class ImpuestosFactory {
    public static ImpuestoCalculator getCalculator(String pais) {
        switch (pais.toLowerCase()) {
            case "colombia":
                return new ImpuestosColombia();
            case "eeuu":
                return new ImpuestosEEUU();
            case "francia":
                return new ImpuestosFrancia();
            default:
                throw new IllegalArgumentException("No hay calculador de impuestos disponible para el país: " + pais);
        }
    }
}
