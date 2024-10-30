package terceraPregunta;

public class FacturaFisica {
    private String codigo;
    private double total;
    private ICliente cliente; // Indirection through interface

    public FacturaFisica(String codigo, double total, ICliente cliente) {
        this.codigo = codigo;
        this.total = total;
        this.cliente = cliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ICliente getCliente() {
        return cliente;
    }

    public void setCliente(ICliente cliente) {
        this.cliente = cliente;
    }
}