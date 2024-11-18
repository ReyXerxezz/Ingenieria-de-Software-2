package Builder;

import java.util.HashSet;
import java.util.Set;

public class Builder {
    String nombre;
    int edad;
    String correo;
    Set<String> intereses = new HashSet<>();

    public Builder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Builder setEdad(int edad) {
        this.edad = edad;
        return this;
    }
    
    public Builder setCorreo(String correo) {
        this.correo = correo;
        return this;
    }
    public Builder addInteres(String interes) {
        this.intereses.add(interes);
        return this;
    }
    
    public Usuario build() {
        return new Usuario(this);
    }
}
