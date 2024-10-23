package FactoryMethod;

public class PagoPaypal implements IMetodoPago {
    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Pago de $" + cantidad + " realizado con PayPal.");
    }
}
