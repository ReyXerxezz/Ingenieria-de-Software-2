import java.util.Date;

public class SistemaEnvios {

    public Orden crearOrden(String id, Date fecha, String origen, String destino) {
        Orden orden = new Orden(id, fecha, destino, origen);
        return orden;
    }

    public void enviarOrden(Orden orden, String proveedor) {
        switch (proveedor.toLowerCase()) {
            case "dhl":
                IProcesarOrdenDHL dhlProcessor = new ProcesarOrdenDHLImpl();
                dhlProcessor.enviarOrdenDHL(orden);
                break;
            case "fedex":
                IProcesarOrdenFedex fedexProcessor = new ProcesarOrdenFedexImpl();
                fedexProcessor.enviarOrdenFedex(orden);
                break;
            case "ups":
                IProcesarOrdenUPS upsProcessor = new ProcesarOrdenUPSImpl();
                upsProcessor.enviarOrdenUPS(orden);
                break;
            default:
                System.out.println("Proveedor no reconocido.");
                break;
        }
    }
}