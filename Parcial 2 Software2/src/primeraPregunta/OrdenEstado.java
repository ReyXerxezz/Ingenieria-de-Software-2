package primeraPregunta;

public class OrdenEstado {
    public String obtenerEstado(int ordenId) {
        if (ordenId < 0) {
            return "orden invalida";
        } else if (ordenId == 0) {
            return "pendiente";
        } else if (ordenId >= 100) {
            return "completada";
        } else if (ordenId >= 50) {
            return "en progreso";
        } else {
            return "pendiente";
        }
    }
}