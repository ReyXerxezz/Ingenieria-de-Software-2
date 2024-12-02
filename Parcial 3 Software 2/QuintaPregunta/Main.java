package QuintaPregunta;

public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador();
        Celular celular = new Celular();

        ControlRemoto controlRemoto = new ControlRemoto();

        controlRemoto.agregarComando("encenderComputador", new ComandoEncenderComputador(computador));
        controlRemoto.agregarComando("reiniciarComputador", new ComandoReiniciarComputador(computador));
        controlRemoto.agregarComando("suspenderComputador", new ComandoSuspenderComputador(computador));
        controlRemoto.agregarComando("apagarComputador", new ComandoApagarComputador(computador));

        controlRemoto.agregarComando("encenderCelular", new ComandoEncenderCelular(celular));
        controlRemoto.agregarComando("reiniciarCelular", new ComandoReiniciarCelular(celular));
        controlRemoto.agregarComando("suspenderCelular", new ComandoSuspenderCelular(celular));
        controlRemoto.agregarComando("apagarCelular", new ComandoApagarCelular(celular));

        controlRemoto.ejecutarComando("encenderComputador");
        controlRemoto.ejecutarComando("reiniciarCelular");
        controlRemoto.ejecutarComando("apagarComputador");
        controlRemoto.ejecutarComando("suspenderCelular");
    }
}
