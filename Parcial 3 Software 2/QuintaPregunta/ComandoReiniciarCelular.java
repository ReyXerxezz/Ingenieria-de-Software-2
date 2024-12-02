package QuintaPregunta;

public class ComandoReiniciarCelular implements Comando {
    private Celular celular;

    public ComandoReiniciarCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void ejecutar() {
        celular.reiniciar();
    }
}
