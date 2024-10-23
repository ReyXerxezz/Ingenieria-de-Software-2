/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller15;

import AbstractFactory.FabricaClasica;
import AbstractFactory.FabricaModerna;
import AbstractFactory.IFabricaMuebles;
import AbstractFactory.IMesa;
import AbstractFactory.ISilla;
import FactoryMethod.CreadorPago;
import FactoryMethod.CreadorPaypal;
import FactoryMethod.CreadorTarjeta;
import FactoryMethod.IMetodoPago;

public class Taller15 {
    public static void main(String[] args) {

        CreadorPago creadorTarjeta = new CreadorTarjeta();
        IMetodoPago pagoTarjeta = creadorTarjeta.crearMetodoPago();
        pagoTarjeta.procesarPago(140.75);

        CreadorPago creadorPaypal = new CreadorPaypal();
        IMetodoPago pagoPaypal = creadorPaypal.crearMetodoPago();
        pagoPaypal.procesarPago(115.25);
        
        IFabricaMuebles fabricaModerna = new FabricaModerna();
        ISilla sillaModerna = fabricaModerna.crearSilla();
        IMesa mesaModerna = fabricaModerna.crearMesa();
        sillaModerna.crear();
        mesaModerna.crear();

        IFabricaMuebles fabricaClasica = new FabricaClasica();
        ISilla sillaClasica = fabricaClasica.crearSilla();
        IMesa mesaClasica = fabricaClasica.crearMesa();
        sillaClasica.crear();
        mesaClasica.crear();
    }
}
