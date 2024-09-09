public class ProcesarOrdenDHLImpl implements IProcesarOrdenDHL{

    @Override
    public void enviarOrdenDHL(Orden orden) {
        System.out.println("DHL");
        System.out.println("Desde: "+orden.getOrigen());
        System.out.println("Hacia: "+orden.getDestino());
        System.out.println("Número de orden: "+orden.getId());
        System.out.println("Fecha de realización de la orden: "+orden.getFecha());
    }
}
