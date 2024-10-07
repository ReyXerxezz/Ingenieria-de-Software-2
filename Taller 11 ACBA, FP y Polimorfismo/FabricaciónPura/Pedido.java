package FabricaciónPura;

import java.util.Date;
import java.util.List;

public class Pedido {
    private int id;
    private Date fecha;
    private Cliente cliente;
    private List<Producto> productos;

    public Pedido(int id, Cliente cliente, List<Producto> productos) {
        this.id = id;
        this.fecha = new Date();
        this.cliente = cliente;
        this.productos = productos;
    }

    public void mostrarDetallesPedido() {
        System.out.println("Pedido ID: " + id);
        System.out.println("Fecha del pedido: " + fecha);
        System.out.println("Cliente: " + cliente.getNombre() + ", Dirección: " + cliente.getDireccion());
        System.out.println("Productos del pedido:");
        for (Producto producto : productos) {
            System.out.println("- " + producto.getNombre() + " | Precio: " + producto.getPrecio() + " | Cantidad: " + producto.getCantidad());
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
