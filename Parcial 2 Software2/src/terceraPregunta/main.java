package terceraPregunta;

public class main {
    public static void main(String[] args) {
        ICliente cliente = new Cliente("1", "Dan Fel", "dan@gmail.com");

        FacturaFisica facturaFisica = new FacturaFisica("101", 100.0, cliente);
        FacturaElectronica facturaElectronica = new FacturaElectronica("102", 150.0, "NE456", cliente);

        System.out.println("Factura física creada para el cliente: " + cliente.getNombre());
        System.out.println("Detalles de la factura: \n"+"Codigo: "+facturaFisica.getCodigo() + "\n"+"Total: "+facturaFisica.getTotal()+"\n"+"Cliente: "+facturaFisica.getCliente().getNombre());
        System.out.println("Factura electrónica creada para el cliente: " + cliente.getNombre());

        System.out.println("Detalles de la factura: \n"+"Codigo: "+facturaElectronica.getCodigo() + "\n"+"Total: "+facturaElectronica.getTotal()+"\n"+"Cliente: "+facturaElectronica.getCliente().getNombre());
    }
}