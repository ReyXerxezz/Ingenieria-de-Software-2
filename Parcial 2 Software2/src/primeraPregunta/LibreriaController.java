package primeraPregunta;

import java.util.List;

public class LibreriaController {
    private Libreria libreria;

    public LibreriaController() {
        libreria = new Libreria();
    }

    public void añadirLibro(Libro libro) {
        libreria.añadirLibro(libro);
    }

    public Libro buscarPorTitulo(String titulo) {
        return libreria.buscarPorTitulo(titulo);
    }

    public List<Libro> buscarPorAutor(String autor) {
        return libreria.buscarPorAutor(autor);
    }

    public List<Libro> obtenerLibrosEntrePrecios(double minPrecio, double maxPrecio) {
        return libreria.obtenerLibrosEntrePrecios(minPrecio, maxPrecio);
    }

    public List<Libro> obtenerLibrosPorAño(int año) {
        return libreria.obtenerLibrosPorAño(año);
    }
}
