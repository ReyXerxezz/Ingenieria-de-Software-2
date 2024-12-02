package CuartaPregunta;

public class Configuracion {
    private static Configuracion instancia;
    private String url;
    private String usuario;
    private String password;

    private Configuracion() {
        this.url = "http://default-url.com";
        this.usuario = "defaultUser";
        this.password = "defaultPassword";
    }

    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}