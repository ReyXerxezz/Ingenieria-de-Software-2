package Polimorfismo;

public class main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Coche coche = new Coche();
        Avion avion = new Avion();
        Bicicleta bicicleta = new Bicicleta();
        garage.estacionar(coche);
        garage.estacionar(avion);
        garage.estacionar(bicicleta);
    }
}
