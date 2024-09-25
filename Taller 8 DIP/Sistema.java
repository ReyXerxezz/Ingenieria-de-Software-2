public class Sistema {
    private ISerivicioEmail serivicioEmail;

    public Sistema (ISerivicioEmail serivicioEmail){
        this.serivicioEmail= serivicioEmail;
    }

    public  void enviarEmail(){
        serivicioEmail.enviarEmail();
    }
}