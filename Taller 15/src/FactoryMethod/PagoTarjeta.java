package FactoryMethod;

public class PagoTarjeta implements IMetodoPago{

    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Pago de $" + cantidad + " realizado con Tarjeta.");
    }
    
}
