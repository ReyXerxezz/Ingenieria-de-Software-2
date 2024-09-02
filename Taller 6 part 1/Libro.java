import java.util.Date;

public class Libro implements LibreriaLibros{
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public void devolver() {
        Date current = new Date();
        System.out.println("El libro "+ getTitulo() +" del autor "+ getAutor() +" ha sido devuelto el " + current );
    }

    @Override
    public void prestar() {
        Date current = new Date();
        System.out.println("El libro "+ getTitulo() +" del autor "+ getAutor() +" ha ha sido prestado el " + current );
    }

    @Override
    public void mantenimientoHojas() {
        Date current = new Date();
        System.out.println("El libro "+ getTitulo() +" del autor "+ getAutor() +" ha sido mantenido el " + current );
    }

    @Override
    public void renovarPortada() {
        Date current = new Date();
        System.out.println("El libro "+ getTitulo() +" del autor "+ getAutor() +" ha sido renovarado el " + current );
    }

    @Override
    public void solicitarNuevaVersion() {
        Date current = new Date();
        System.out.println("Una nueva version del libro "+ getTitulo() +" del autor "+ getAutor() +" ha sido solicitada el " + current );
    }
}
