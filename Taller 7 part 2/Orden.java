import java.util.Date;

public class Orden {
    private String id;
    private Date fecha;
    private String destino;
    private String origen;

    public Orden(String id, Date fecha, String destino, String origen) {
        this.id = id;
        this.fecha = fecha;
        this.destino = destino;
        this.origen = origen;
    }

    public String getId() {
        return id;
    }
    public Date getFecha() {
        return fecha;
    }
    public String getDestino() {
        return destino;
    }
    public String getOrigen() {
        return origen;
    }
}
