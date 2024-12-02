package TerceraPregunta;

public class Main {
    public static void main(String[] args) {
        NuevoSistemaPago nuevoSistemaPago = new NuevoSistemaPago("Daniel Ramirez", "12345678", "daniel@gmail.com");

        NuevoSistemaPagoOperacion sistemaPagoOperacion = new NuevoSistemaPagoOperacion();

        AdaptadorSistemaPago adaptador = new AdaptadorSistemaPago(nuevoSistemaPago);

        adaptador.crearSesion(sistemaPagoOperacion);
        adaptador.validarCorreo(sistemaPagoOperacion);
        adaptador.validarAutorizacion(sistemaPagoOperacion);
        adaptador.realizarPago(sistemaPagoOperacion);
    }
}
