package FactoryMethod;

public class CreadorPaypal extends CreadorPago {
    @Override
    public IMetodoPago crearMetodoPago() {
        return new PagoPaypal();
    }
}