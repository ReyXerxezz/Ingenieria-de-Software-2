public class EmailOutlookImpl extends EmailOutlook implements ISerivicioEmail {

    public EmailOutlookImpl(String to, String subject, String body) {
        super(to, subject, body);
    }

    @Override
    public void enviarEmail(){
        System.out.println("Enviando a outlook");
    }
}