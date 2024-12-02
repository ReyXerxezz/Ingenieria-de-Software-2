package QuintaPregunta;

import java.util.HashMap;
import java.util.Map;

public class ControlRemoto {
    private Map<String, Comando> comandos = new HashMap<>();

    public void agregarComando(String nombre, Comando comando) {
        comandos.put(nombre, comando);
    }

    public void ejecutarComando(String nombre) {
        Comando comando = comandos.get(nombre);
        if (comando != null) {
            comando.ejecutar();
        } else {
            System.out.println("Comando no encontrado: " + nombre);
        }
    }
}
