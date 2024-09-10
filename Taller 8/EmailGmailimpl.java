public class EmailGmailimpl extends EmailGmail implements ISerivicioEmail {

    public EmailGmailimpl(String to, String subject, String body, String image) {
        super(to, subject, body, image);
    }

    @Override
    public void enviarEmail() {
        System.out.println("Enviando email a gmail");
    }
}
