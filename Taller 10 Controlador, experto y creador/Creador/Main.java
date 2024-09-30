package Creador;

public class Main {
    public static void main(String[] args) {
        Order orden = new Order();

        orden.agregarComputadora(1,"Intel corei5", "Intel graphics", 8);
        orden.agregarComputadora(2,"Intel corei7", "nvidia gtx 1080", 16);
        orden.agregarComputadora(3,"Intel corei9", "NVIDIA GTX 3080", 32);

        orden.mostrarOrden();
    }
}
