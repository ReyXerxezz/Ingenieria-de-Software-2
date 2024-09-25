package YAGNI;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();
    public void agregarLibro(Libro libro) {
        libro.setAñoPublicacion(2024);
        getLibros().add(libro);
        System.out.println("El libro "+libro.getTitulo()+" de "+libro.getAutor()+" fue agregado exitosamente");
    }
    public List<Libro> getLibros() {
        return libros;
    }
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
