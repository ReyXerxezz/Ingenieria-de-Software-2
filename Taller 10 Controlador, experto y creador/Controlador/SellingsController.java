package Controlador;

import java.util.ArrayList;
import java.util.List;

public class SellingsController {
    private List<Entry> entries = new ArrayList<>();

    public SellingsController() {
        entries.add(new Entry("VIP", 100.0,true));
        entries.add(new Entry("Platino", 50.0,true));
        entries.add(new Entry("General", 30.0,true));
    }

    public void comprarEntrada(String tipoEntrada) {
        Entry entry = encontrarEntrada(tipoEntrada);
        if(entry != null){
            if (entry.isDisponible()) {
                entry.setDisponible(false);
                System.out.println("Entrada comprada.");
            } else {
                System.out.println("Entrada no disponible.");
            }
        }else{
            System.out.println("Tipo de entrada inválido");
        }
    }

    private Entry encontrarEntrada(String tipoEntrada) {
        for (Entry entry : entries) {
            if (entry.getTipo().equalsIgnoreCase(tipoEntrada)) {
                return entry;
            }
        }
        return null;
    }
}
