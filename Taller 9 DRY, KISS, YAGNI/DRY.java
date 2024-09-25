public class DRY {
    private String email1 = "carlos@gmail.com";
    private String email2 = "sebas@autolock";

    public void verificarValidezEmail(String email) {
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Email inválido: " + email);
        } else {
            System.out.println("Email válido: " + email);
        }
    }

    public static void main(String[] args) {
        DRY main = new DRY();
        main.verificarValidezEmail(main.email1);
        main.verificarValidezEmail(main.email2);
    }
}
