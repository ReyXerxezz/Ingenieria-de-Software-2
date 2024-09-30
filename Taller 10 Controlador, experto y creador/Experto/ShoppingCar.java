package Experto;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCar {
    private List<Book> Books = new ArrayList<>();

    public void agregarLibro(Book book) {
        Books.add(book);
    }

    public void eliminarLibro(Book book) {
        Books.remove(book);
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Book book : Books) {
            total += book.getPrecio();
        }
        return total;
    }

    public void listarLibros() {
        for (Book book : Books) {
            System.out.println(book.getTitulo()+"\n");
        }
    }
}
