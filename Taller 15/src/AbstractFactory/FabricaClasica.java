package AbstractFactory;

public class FabricaClasica implements IFabricaMuebles{
    @Override
    public ISilla crearSilla() {
        return new SillaClasica();
    }

    @Override
    public IMesa crearMesa() {
        return new MesaClasica();
    }
}
