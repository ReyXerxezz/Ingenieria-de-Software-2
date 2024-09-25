package YAGNI;

public class YAGNI {
    public static void main(String[] args) {
        Libro l1 = new Libro("El extranjero", "Albert Camus", 2017);
        Libro l2 = new Libro("Los hermanos Karamazov", "Fedor Dostoyevski", 2018);
        Biblioteca b = new Biblioteca();
        b.agregarLibro(l1);
        b.agregarLibro(l2);
    }
}
