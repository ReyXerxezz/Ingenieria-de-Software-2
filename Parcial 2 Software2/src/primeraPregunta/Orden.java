package primeraPregunta;

public class Orden {
    private int ordenId;
    private double precio;

    public Orden(int ordenId, double precio) {
        this.ordenId = ordenId;
        this.precio = precio;
    }

    public int getOrdenId() {
        return ordenId;
    }

    public void setOrdenId(int ordenId) {
        this.ordenId = ordenId;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    private double calcularImpuesto(double precio) {
        return precio * 0.1; // 10% tax
    }

    public double calcularTotalConImpuesto(double precio) {
        double impuesto = calcularImpuesto(precio);
        return precio + impuesto;
    }

    public double calcularDescuentoTotal(double descuento) {
        double descuentoPrecio = precio - descuento;
        double impuesto = calcularImpuesto(descuentoPrecio);
        return calcularTotalConImpuesto(descuentoPrecio);
    }
}