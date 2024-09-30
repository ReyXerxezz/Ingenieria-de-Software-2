package Experto;

public class Main {
    public static void main(String[] args) {
        Book libro1 = new Book("Sorprende a tu mente", "Ana Ibañez", "9789564085319", 87000);
        Book libro2 = new Book("Código limpio", "Robert  Cecil Martin", "9788441532106", 228000);
        Book libro3 = new Book("Si lo crees, lo creas", "Brian Tracy", "9789585549319", 39000);

        ShoppingCar carrito = new ShoppingCar();

        carrito.agregarLibro(libro1);
        carrito.agregarLibro(libro2);
        carrito.agregarLibro(libro2);
        carrito.agregarLibro(libro3);

        System.out.println("Listado de los libros:");
        carrito.listarLibros();
        System.out.println("Precio total: $" + carrito.calcularPrecioTotal()+"\n");

        carrito.eliminarLibro(libro2);

        System.out.println("Listado de los libros actualizado:");
        carrito.listarLibros();
        System.out.println("Precio total después de eliminar un libro: " + carrito.calcularPrecioTotal());
    }
}
