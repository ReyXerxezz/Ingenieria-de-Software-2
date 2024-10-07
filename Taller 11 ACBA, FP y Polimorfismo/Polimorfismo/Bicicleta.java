package Polimorfismo;

public class Bicicleta implements Transporte {
    @Override
    public void acelerar() {
        System.out.println("El bicicleta acelera.");
    }

    @Override
    public void frenar() {
        System.out.println("El bicicleta frena");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Info del bicicleta");
    }
}
