public class Main {
    public static void main(String[] args) {
        ProductoFisico productoFisico = new ProductoFisico("Laptop", 1000.0, 2, 5.0);
        ProductoDigital productoDigital = new ProductoDigital("E-book", 20.0, 5, 15.0);
        ProductoMixto productoMixto = new ProductoMixto("Combo Software + Hardware", 1500.0, 1, 3.0, 50.0);

        System.out.println("Costo total de producto físico: " + productoFisico.calcularCosto());
        System.out.println("Costo total de producto digital: " + productoDigital.calcularCosto());
        System.out.println("Costo total de producto mixto: " + productoMixto.calcularCosto());

        productoFisico.enviarPorCorreo();
        productoMixto.enviarPorCorreo();
    }
}
