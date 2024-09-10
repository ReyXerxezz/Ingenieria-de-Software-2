public class EmailYahooImpl  extends EmailYahoo implements ISerivicioEmail {
    public EmailYahooImpl(String to, String subject, String body, String file) {
        super(to, subject, body, file);
    }

    @Override
    public void enviarEmail() {
        System.out.println("Enviando email con yahoo");
    }
}
