public class Main {
    public static void main(String [] args){
        ISerivicioEmail serivicioEmail = new EmailGmailimpl("santi@gmail.com","Validacion","holi","no tiene");
        ISerivicioEmail serivicioEmail2 = new EmailOutlookImpl("santi@gmail.com","Validacion","holi");
        ISerivicioEmail serivicioEmail3 = new EmailYahooImpl("santi@gmail.com","Validacion","holi","no tiene");

        Sistema sistema = new Sistema(serivicioEmail);
        Sistema sistema2 = new Sistema(serivicioEmail2);
        Sistema sistema3 = new Sistema(serivicioEmail3);

        sistema.enviarEmail();
        sistema2.enviarEmail();
        sistema3.enviarEmail();
    }
}
