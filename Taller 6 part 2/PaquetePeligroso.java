public class PaquetePeligroso extends Paquete implements IPaquetePeligroso {
    private Boolean etiquetaPeligroso;
    private Boolean embalajeEspecial;

    public PaquetePeligroso(double peso, double altura, double base, Boolean etiquetaPeligroso) {
        super(peso, altura, base);
        this.etiquetaPeligroso = etiquetaPeligroso;
    }

    public Boolean getEtiquetaPeligroso() {
        return etiquetaPeligroso;
    }

    @Override
    public Boolean verificarContenidoPeligroso() {
        if(getEtiquetaPeligroso()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void asegurarContenidoPeligroso() {
        if(verificarContenidoPeligroso()){
            System.out.println("Embalaje peligroso ");
            setEmbalajeEspecial(true);
        } else {
            System.out.println("Embalaje no peligroso ");
            setEmbalajeEspecial(false);
        }
    }

    public Boolean getEmbalajeEspecial() {
        return embalajeEspecial;
    }

    public void setEmbalajeEspecial(Boolean embalajeEspecial) {
        this.embalajeEspecial = embalajeEspecial;
    }
}
