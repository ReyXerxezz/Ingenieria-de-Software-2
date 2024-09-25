public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 50, "Electrónica", 19, 1500.00);
        Producto producto2 = new Producto("Mouse", 100, "Accesorios", 19, 20.00);

        // Crear instancias de los servicios
        ServicioStock servicioStock = new ServicioStock();
        ServicioEnvio servicioEnvio = new ServicioEnvio(servicioStock);

        // Aumentar stock
        servicioStock.aumentarStock(producto1, 10);
        System.out.println("Nuevo stock del producto1: " + producto1.getStock());

        // Aplicar descuento
        Descuento descuentoFijo = new DescuentoFijo();
        double precioConDescuento = descuentoFijo.calcular(producto1);
        System.out.println("Precio con descuento fijo: " + precioConDescuento);

        // Enviar stock
        boolean enviado = servicioEnvio.enviarStock(producto1, 5);
        if (enviado) {
            System.out.println("Stock enviado. Nuevo stock del producto1: " + producto1.getStock());
        } else {
            System.out.println("No hay suficiente stock para enviar.");
        }
    }
}