package TerceraPregunta;

public interface SistemaPago {
    void iniciarSesion();
    void validarCorreo();
    void validarAutorizacion();
    void realizarPago();
}