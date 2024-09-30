package Creador;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Computer> computers = new ArrayList<>();
    private ComputerFactory factory = new ComputerFactory();

    public void agregarComputadora(int id, String procesador, String tarjetaGrafica, int ram) {
        Computer computer = factory.crearComputadora(id, procesador, tarjetaGrafica, ram);
        computers.add(computer);
    }

    public void mostrarOrden() {
        System.out.println("Computadoras en la orden:");
        for (Computer computer : computers) {
            System.out.println("Computadora: "+computer.getId()+"\t"+computer.getProcesador()+"\t"+computer.getTarjetaGrafica()+"\t"+computer.getRam());
        }
    }
}
