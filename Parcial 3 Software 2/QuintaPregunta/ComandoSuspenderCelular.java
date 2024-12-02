package QuintaPregunta;

public class ComandoSuspenderCelular implements Comando {
    private Celular celular;

    public ComandoSuspenderCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void ejecutar() {
        celular.suspender();
    }
}
