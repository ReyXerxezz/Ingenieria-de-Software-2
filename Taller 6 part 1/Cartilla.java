import java.util.Date;

public class Cartilla implements LibreriaCartilla {
    private String editorial;
    private String nombre;

    public Cartilla(String editorial, String nombre) {
        this.editorial = editorial;
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public void devolver() {
        Date current = new Date();
        System.out.println("La cartilla "+ getNombre() +" de la editorial "+ getEditorial() +" ha sido devuelta el " + current );
    }

    @Override
    public void prestar() {
        Date current = new Date();
        System.out.println("La cartilla "+ getNombre() +" de la editorial "+ getEditorial() +" ha sido prestada el " + current );
    }

    @Override
    public void mantenimientoHojas() {
        Date current = new Date();
        System.out.println("La cartilla "+ getNombre() +" de la editorial "+ getEditorial() +" ha sido mantenida el " + current );
    }
}
