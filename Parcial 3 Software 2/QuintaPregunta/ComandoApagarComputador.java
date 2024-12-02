package QuintaPregunta;

public class ComandoApagarComputador implements Comando {
    private Computador computador;

    public ComandoApagarComputador(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void ejecutar() {
        computador.apagar();
    }
}