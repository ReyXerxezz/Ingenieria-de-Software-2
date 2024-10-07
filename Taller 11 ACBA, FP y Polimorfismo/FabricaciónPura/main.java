package FabricaciónPura;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 1000.0, 1);
        Producto producto2 = new Producto("Mouse", 25.0, 2);

        Cliente cliente = new Cliente("Carlos", "Calle 3, Pereira");

        List<Producto> listaProductos = Arrays.asList(producto1, producto2);
        Pedido pedido = FabricaPedidos.crearPedido(cliente, listaProductos);

        pedido.mostrarDetallesPedido();

    }
}
