package SegundaPregunta;

public class HamburguesaBuilder {
    private String tipoTomate;
    private String tipoCarne;
    private String tipoQueso;
    private String tipoPan;

    public HamburguesaBuilder setTipoTomate(String tipoTomate) {
        this.tipoTomate = tipoTomate;
        return this;
    }

    public String getTipoTomate() {
        return this.tipoTomate;
    }

    public HamburguesaBuilder setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
        return this;
    }

    public String getTipoCarne() {
        return this.tipoCarne;
    }

    public HamburguesaBuilder setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    public String getTipoQueso() {
        return this.tipoQueso;
    }

    public HamburguesaBuilder setTipoPan(String tipoPan) {
        this.tipoPan = tipoPan;
        return this;
    }

    public String getTipoPan() {
        return this.tipoPan;
    }

    public Hamburguesa build() {
        return new Hamburguesa(this);
    }
}
