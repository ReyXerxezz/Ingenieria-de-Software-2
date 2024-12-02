package QuintaPregunta;

public class ComandoReiniciarComputador implements Comando {
    private Computador computador;

    public ComandoReiniciarComputador(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void ejecutar() {
        computador.reiniciar();
    }
}
