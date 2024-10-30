package primeraPregunta;

public class mainOrdenes {
    public static void main(String[] args) {
        Orden orden1 = new Orden(0, 100.0);
        Orden orden2 = new Orden(0, 200.0);
        Orden orden3 = new Orden(0, 50.0);

        System.out.println("Total con imuesto de la primera orden: " + orden1.calcularTotalConImpuesto(orden1.getPrecio()));
        System.out.println("Total con imuesto de la segunda orden: " + orden2.calcularTotalConImpuesto(orden2.getPrecio()));
        System.out.println("Total con imuesto de la tercer orden: " + orden3.calcularTotalConImpuesto(orden3.getPrecio()));

        OrdenEstado estado = new OrdenEstado();

        System.out.println("Estado de la primera orden: " + estado.obtenerEstado(orden1.getOrdenId()));
        orden2.setOrdenId(50);
        System.out.println("Estado de la segunda orden: " + estado.obtenerEstado(orden2.getOrdenId()));
        orden3.setOrdenId(100);
        System.out.println("Estado de la tercera orden: " + estado.obtenerEstado(orden3.getOrdenId()));

        System.out.println("Ejemplo de estado inexistente" + estado.obtenerEstado(-1));
    }
}