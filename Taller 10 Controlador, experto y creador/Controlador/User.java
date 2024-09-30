package Controlador;

public class User {
    private SellingsController controller = new SellingsController();
    public void comprar(String tipoEntrada) {
        controller.comprarEntrada(tipoEntrada);
    }
}
