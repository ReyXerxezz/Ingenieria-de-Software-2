public class Usuario {

    private String nombre;
    private String apellido;
    private String email;
    private String contrasena;

    public Usuario(String nombre, String apellido, String email, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getContrasena() {
        return contrasena;
    }
}

//Violaciones del SRP
//La clase Usuario tiene al menos cuatro responsabilidades distintas:
//
//Gestión de la información del usuario.
//Comunicación por correo electrónico.
//Seguridad y validación de contraseñas.
//Cálculo financiero del salario.
