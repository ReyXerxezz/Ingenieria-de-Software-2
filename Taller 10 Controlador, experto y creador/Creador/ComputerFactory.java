package Creador;

public class ComputerFactory {
    public Computer crearComputadora(int id, String procesador, String tarjetaGrafica, int ram){
        return new Computer(id, procesador, tarjetaGrafica, ram);
    }
}
