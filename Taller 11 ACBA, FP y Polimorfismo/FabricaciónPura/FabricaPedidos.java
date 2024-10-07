package FabricaciónPura;

import java.util.List;

public class FabricaPedidos {
    private static int idPedido = 0;

    public static Pedido crearPedido(Cliente cliente, List<Producto> productos) {
        idPedido++;
        return new Pedido(idPedido,cliente, productos);
    }
}
