package terceraPregunta;

public class FacturaElectronica {
    private String codigo;
    private double total;
    private String numeroElectronico;
    private ICliente cliente; // Indirection through interface

    public FacturaElectronica(String codigo, double total, String numeroElectronico, ICliente cliente) {
        this.codigo = codigo;
        this.total = total;
        this.numeroElectronico = numeroElectronico;
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

    public String getNumeroElectronico() {
        return numeroElectronico;
    }

    public void setNumeroElectronico(String numeroElectronico) {
        this.numeroElectronico = numeroElectronico;
    }
}