package taller16;

import Builder.Builder;
import Builder.Usuario;
import Prototype.Producto;

public class Taller16 {

    public static void main(String[] args) {

        Producto productoOriginal = new Producto("Laptop", 1500.0, "Electrónica");
        Producto productoClonado = (Producto) productoOriginal.clone();
        
        System.out.println("Producto Original: " + productoOriginal);
        System.out.println("Producto Clonado: " + productoClonado);
        
        System.out.println("¿Son el mismo objeto? " + (productoOriginal == productoClonado));

        Usuario usuario1 = new Builder()
                                .setNombre("Charles")
                            .setEdad(30)
                            .setCorreo("charles@example.com")
                            .addInteres("Musica")
                            .addInteres("Deportes")
                            .build();

        Usuario usuario2 = new Builder()
                            .setNombre("Seb")
                            .setEdad(25)
                            .setCorreo("seb@example.com")
                            .addInteres("Tecnología")
                            .build();

        System.out.println(usuario1);
        System.out.println(usuario2);
        
    }
    
}
