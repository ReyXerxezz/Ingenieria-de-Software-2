package Controlador;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        user.comprar("General");
        user.comprar("Platino");
        user.comprar("VIP");
        user.comprar("Platino");
        user.comprar("NoExistente");
    }
}
