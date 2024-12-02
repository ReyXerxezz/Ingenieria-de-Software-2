package TerceraPregunta;

public class Main {
    public static void main(String[] args) {
        NuevoSistemaPago nuevoSistemaPago = new NuevoSistemaPago("Daniel Ramirez", "daniel@gmail.com");
        NuevoSistemaPagoOperacion nuevoSistemaPagoOperacion = new NuevoSistemaPagoOperacion();

        SistemaPago sistemaPago = new AdaptadorSistemaPago(nuevoSistemaPagoOperacion, nuevoSistemaPago);

        sistemaPago.iniciarSesion();
        sistemaPago.validarCorreo();
        sistemaPago.validarAutorizacion();
        sistemaPago.realizarPago();
    }
}