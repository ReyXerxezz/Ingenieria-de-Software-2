public class PaquetePeligroso extends Paquete implements IPaquetePeligroso {
    private Boolean etiquetaPeligroso;
    private Boolean embalajeEspecial;
    private double costoExtra = 100000;

    public PaquetePeligroso(double peso, double altura, double base, Boolean peligroso) {
        super(peso, altura, base);
        this.etiquetaPeligroso = peligroso;
    }

    public Boolean getEtiquetaPeligroso() {
        return etiquetaPeligroso;
    }

    @Override
    public Boolean verificarContenidoPeligroso() {
        if(getEtiquetaPeligroso()){
            System.out.println("Embalaje peligroso ");
            return true;
        } else {
            System.out.println("Embalaje no peligroso ");
            return false;
        }
    }

    @Override
    public void asegurarContenidoPeligroso() {
        if(verificarContenidoPeligroso()){
            System.out.println("Costo extra de "+ getCostoExtra());
            setEmbalajeEspecial(true);
        } else {
            System.out.println("Sin costo extra ");
        }
    }

    @Override
    public double calcularCostoEnvioPeligroso() {
        if(getEmbalajeEspecial()){
            return (((getAltura() * getBase()) + getPeso()) * 50) + getCostoExtra();
        } else {
            return ((getAltura() * getBase()) + getPeso()) * 50;
        }
    }

    public double getCostoExtra() {
        return costoExtra;
    }

    public Boolean getEmbalajeEspecial() {
        return embalajeEspecial;
    }

    public void setEmbalajeEspecial(Boolean embalajeEspecial) {
        this.embalajeEspecial = embalajeEspecial;
    }
}
