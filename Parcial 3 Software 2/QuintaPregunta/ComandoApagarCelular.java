package QuintaPregunta;

public class ComandoApagarCelular implements Comando {
    private Celular celular;

    public ComandoApagarCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void ejecutar() {
        celular.apagar();
    }
}
