package TerceraPregunta;

public class NuevoSistemaPagoOperacion {
    public void crearSesion(NuevoSistemaPago nuevoSistemaPago){
        System.out.println("Creando la sesion a: "+nuevoSistemaPago.getNombre());
    }
    public void validarCorreo(NuevoSistemaPago nuevoSistemaPago){
        System.out.println("Validando el correo: "+nuevoSistemaPago.getCorreo());
    }
    public void validarAutorizacion(){
        System.out.println("Validando autorizacion");
    }
    public void realizarPago(){
        System.out.println("Realizando el pago");
    }
}