package SegundaPregunta;

public class Hamburguesa {
    private String tipoTomate;
    private String tipoCarne;
    private String tipoQueso;
    private String tipoPan;

    public Hamburguesa(HamburguesaBuilder builder) {
        this.tipoTomate = builder.getTipoTomate();
        this.tipoCarne = builder.getTipoCarne();
        this.tipoQueso = builder.getTipoQueso();
        this.tipoPan = builder.getTipoPan();
    }

    @Override
    public String toString() {
        return "Información de la Hamburguesa, " +
                "tipo de tomate: " + tipoTomate +
                ", tipo de carne: " + tipoCarne +
                ", tipo de queso: " + tipoQueso +
                ", tipo de pan: " + tipoPan;
    }
}