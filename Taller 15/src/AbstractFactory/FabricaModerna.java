package AbstractFactory;

public class FabricaModerna implements IFabricaMuebles{
    @Override
    public ISilla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public IMesa crearMesa() {
        return new MesaModerna();
    }
}
