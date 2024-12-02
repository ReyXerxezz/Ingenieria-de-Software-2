package QuintaPregunta;

public class ComandoEncenderComputador implements Comando {
    private Computador computador;

    public ComandoEncenderComputador(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void ejecutar() {
        computador.encender();
    }
}