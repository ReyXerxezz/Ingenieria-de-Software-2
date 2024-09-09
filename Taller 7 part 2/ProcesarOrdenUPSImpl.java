public class ProcesarOrdenUPSImpl implements IProcesarOrdenUPS {
    @Override
    public void enviarOrdenUPS(Orden orden) {
        System.out.println("UPS");
        System.out.println("Desde: "+orden.getOrigen());
        System.out.println("Hacia: "+orden.getDestino());
        System.out.println("Número de orden: "+orden.getId());
        System.out.println("Fecha de realización de la orden: "+orden.getFecha());
    }
}
