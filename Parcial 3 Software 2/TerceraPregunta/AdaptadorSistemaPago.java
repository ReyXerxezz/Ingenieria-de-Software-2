package TerceraPregunta;

public class AdaptadorSistemaPago {
    private NuevoSistemaPago nuevoSistemaPago;

    public AdaptadorSistemaPago(NuevoSistemaPago nuevoSistemaPago) {
        this.nuevoSistemaPago = nuevoSistemaPago;
    }

    public void crearSesion(NuevoSistemaPagoOperacion sistemaPagoOperacion) {
        sistemaPagoOperacion.crearSesion(nuevoSistemaPago);
    }

    public void validarCorreo(NuevoSistemaPagoOperacion sistemaPagoOperacion) {
        sistemaPagoOperacion.validarCorreo(nuevoSistemaPago);
    }

    public void validarAutorizacion(NuevoSistemaPagoOperacion sistemaPagoOperacion) {
        sistemaPagoOperacion.validarAutorizacion();
    }

    public void realizarPago(NuevoSistemaPagoOperacion sistemaPagoOperacion) {
        sistemaPagoOperacion.realizarPago();
    }
}
