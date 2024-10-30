package primeraPregunta;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Libreria {
    private List<Libro> libros;

    public Libreria() {
        this.libros = new ArrayList<>();
    }

    public void añadirLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscarPorTitulo(String titulo) {
        return libros.stream()
                .filter(libro -> libro.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
    }

    public List<Libro> buscarPorAutor(String autor) {
        return libros.stream()
                .filter(libro -> libro.getAutor().equalsIgnoreCase(autor))
                .collect(Collectors.toList());
    }

    public List<Libro> obtenerLibrosEntrePrecios(double minPrecio, double maxPrecio) {
        return libros.stream()
                .filter(libro -> libro.getPrecio() >= minPrecio && libro.getPrecio() <= maxPrecio)
                .collect(Collectors.toList());
    }

    public List<Libro> obtenerLibrosPorAño(int año) {
        return libros.stream()
                .filter(libro -> libro.getAno() == año)
                .collect(Collectors.toList());
    }
}