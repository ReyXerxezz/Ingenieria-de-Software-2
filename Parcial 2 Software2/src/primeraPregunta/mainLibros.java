package primeraPregunta;

public class mainLibros {
    public static void main(String[] args) {
        LibreriaController controller = new LibreriaController();

        controller.añadirLibro(new Libro("El Quijote", "Cervantes", 15.99, 1605));
        controller.añadirLibro(new Libro("1984", "Orwell", 12.50, 1949));
        controller.añadirLibro(new Libro("Cien años de soledad", "García Márquez", 20.00, 1967));
        controller.añadirLibro(new Libro("El Principito", "Saint-Exupéry", 10.00, 1943));

        Libro buscado = controller.buscarPorTitulo("1984");
        System.out.println("Buscando por título '1984': " + (buscado != null ? (buscado.getTitulo() +" del año: "+buscado.getAno()+" del autor: "+buscado.getAutor()) : "No encontrado"));

        Libro[] librosPorAutor = controller.buscarPorAutor("Cervantes").toArray(new Libro[0]);
        System.out.println("Libros de Cervantes: ");
        for (Libro libro : librosPorAutor) {
            System.out.println(libro.getTitulo());
        }

        Libro[] librosEntrePrecios = controller.obtenerLibrosEntrePrecios(10.00, 15.00).toArray(new Libro[0]);
        System.out.println("Libros entre 10.00 y 15.00: ");
        for (Libro libro : librosEntrePrecios) {
            System.out.println(libro.getTitulo() + " con un precio de: " + libro.getPrecio());
        }

        Libro[] librosPorAño = controller.obtenerLibrosPorAño(1943).toArray(new Libro[0]);
        System.out.println("Libros del año 1943: ");
        for (Libro libro : librosPorAño) {
            System.out.println(libro.getTitulo()+ " del año " +libro.getAno());
        }
    }
}