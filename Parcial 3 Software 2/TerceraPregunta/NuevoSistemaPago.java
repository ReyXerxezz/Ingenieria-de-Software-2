package TerceraPregunta;

public class NuevoSistemaPago implements SistemaPago {
    private String nombre;
    private String identificacion;
    private String correo;

    public NuevoSistemaPago(String nombre, String identificacion, String correo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getCorreo() {
        return correo;
    }
}
