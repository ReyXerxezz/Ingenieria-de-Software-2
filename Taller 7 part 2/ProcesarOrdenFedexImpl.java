public class ProcesarOrdenFedexImpl implements IProcesarOrdenFedex{

    @Override
    public void enviarOrdenFedex(Orden orden) {
            System.out.println("Fedex");
            System.out.println("Desde: "+orden.getOrigen());
            System.out.println("Hacia: "+orden.getDestino());
            System.out.println("Número de orden: "+orden.getId());
            System.out.println("Fecha de realización de la orden: "+orden.getFecha());
    }
}
