package TerceraPregunta;

public class AdaptadorSistemaPago implements SistemaPago {
    private NuevoSistemaPagoOperacion nuevoSistemaPagoOperacion;
    private NuevoSistemaPago nuevoSistemaPago;

    public AdaptadorSistemaPago(NuevoSistemaPagoOperacion nuevoSistemaPagoOperacion, NuevoSistemaPago nuevoSistemaPago) {
        this.nuevoSistemaPagoOperacion = nuevoSistemaPagoOperacion;
        this.nuevoSistemaPago = nuevoSistemaPago;
    }

    @Override
    public void iniciarSesion() {
        nuevoSistemaPagoOperacion.crearSesion(nuevoSistemaPago);
    }

    @Override
    public void validarCorreo() {
        nuevoSistemaPagoOperacion.validarCorreo(nuevoSistemaPago);
    }

    @Override
    public void validarAutorizacion() {
        nuevoSistemaPagoOperacion.validarAutorizacion();
    }

    @Override
    public void realizarPago() {
        nuevoSistemaPagoOperacion.realizarPago();
    }
}