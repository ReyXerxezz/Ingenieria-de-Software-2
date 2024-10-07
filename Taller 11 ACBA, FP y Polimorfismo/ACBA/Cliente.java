package ACBA;

public class Cliente {
    private int id;
    private String name;
    private String direccion;

    public Cliente(int id, String name, String direccion) {
        this.id = id;
        this.name = name;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDireccion() {
        return direccion;
    }
}
