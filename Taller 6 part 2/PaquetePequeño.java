public class PaquetePequeño extends Paquete implements IPaquetePequeño {
    private double valorDeclarado;

    public PaquetePequeño(double peso, double altura, double base, double valorDeclarado){
        super(peso, altura, base);
        this.valorDeclarado = valorDeclarado;
    }

    public double getValorDeclarado(){
        return valorDeclarado;
    }

    @Override
    public double calcularCostoEnvioPequeño() {
        return ((getAltura() * getBase()) + getPeso()) * 50;
    }
}
