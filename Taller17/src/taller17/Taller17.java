package taller17;

import Adapter.Impresora;
import Adapter.ImpresoraInkJet;
import Adapter.ImpresoraInkJetAdapter;
import Adapter.ImpresoraLaser;
import Adapter.ImpresoraLaserAdapter;
import Singleton.Settings;

public class Taller17 {

    public static void main(String[] args) {

        Settings configuracion = Settings.getInstance();
        System.out.println("Tema actual: " + configuracion.getConfiguracion("theme"));
        System.out.println("Idioma actual: " + configuracion.getConfiguracion("language"));

        configuracion.setConfiguracion("theme", "dark");
        configuracion.setConfiguracion("language", "es");

        System.out.println("Nuevo tema: " + configuracion.getConfiguracion("theme"));
        System.out.println("Nuevo idioma: " + configuracion.getConfiguracion("language"));

        ImpresoraLaser impresoraLaser = new ImpresoraLaser();
        ImpresoraInkJet impresoraInkJet = new ImpresoraInkJet();

        Impresora impresora1 = new ImpresoraLaserAdapter(impresoraLaser);
        Impresora impresora2 = new ImpresoraInkJetAdapter(impresoraInkJet);

        impresora1.imprimir();
        impresora2.imprimir();
    }
    
}
