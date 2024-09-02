public class PaqueteGrande extends Paquete implements IPaqueteGrande {
    private double largo;
    private String medioTransporte;

    public PaqueteGrande(double peso, double altura, double base, double largo, String medioTransporte){
        super(peso, altura, base);
        this.largo = largo;
        this.medioTransporte = medioTransporte;
    }

    public double getLargo(){
        return largo;
    }
    public String getMedioTransporte(){
        return medioTransporte;
    }


    @Override
    public double calcularCostoEnvioGrande() {
        return ((getLargo() * getAltura() * getBase()) + getPeso()) * 0.075;
    }
}
