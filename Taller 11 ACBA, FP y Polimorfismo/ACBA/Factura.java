package ACBA;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {
    private List<Integer> idProducto = new ArrayList<>();
    private List<String> nombreProducto = new ArrayList<>();
    private List<Double> precioProducto = new ArrayList<>();
    private int idCliente;
    private String nombreCliente;
    private String direccionCliente;
    private List<Integer> listaProductosIdComprados = new ArrayList<>();
    private double descuento;
    private double total;
    private Date fechaFactura;

    public double calcularPrecioConDescuento(double descuento) {
        return getTotal() - (getTotal() * descuento / 100); // Lógica para aplicar descuento
    }

    public void calcularTotal() {
        setTotal(0);
        for (double precio : getPrecioProducto()) {
            setTotal(getTotal() + precio);
        }
    }

    public String generarNumeroFactura() {
        return "FACT-" + getIdCliente() + "-" + new Date().getTime();
    }

    public void procesarFactura(Cliente cliente, List<Producto> productos) {
        this.setIdCliente(cliente.getId());
        this.setNombreCliente(cliente.getName());
        this.setDireccionCliente(cliente.getDireccion());
        // Guardar productos comprados
        for (Producto producto : productos) {
            getIdProducto().add(producto.getId());
            getNombreProducto().add(producto.getName());
            getPrecioProducto().add(producto.getPrice());
        }
        calcularTotal();
        guardarFacturaEnBaseDeDatos();
    }

    private void guardarFacturaEnBaseDeDatos() {
        System.out.println("Factura guardada en la base de datos");
    }

    public List<Integer> getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(List<Integer> idProducto) {
        this.idProducto = idProducto;
    }

    public List<String> getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(List<String> nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public List<Double> getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(List<Double> precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public List<Integer> getListaProductosIdComprados() {
        return listaProductosIdComprados;
    }

    public void setListaProductosIdComprados(List<Integer> listaProductosIdComprados) {
        this.listaProductosIdComprados = listaProductosIdComprados;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }
}
