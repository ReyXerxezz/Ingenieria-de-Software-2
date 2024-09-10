public class EmailYahoo extends Email{
    private  String file;


    public EmailYahoo(String to, String subject, String body, String file) {
        super(to, subject, body);
        this.file = file;
    }
}
