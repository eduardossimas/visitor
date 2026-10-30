package abstractFactory;

public class FabricaSamsung implements FabricaAbstrata{
    public Celular criarCelular() {
        return new CelularSamsung();
    }

    public Tablet criarTablet() {
        return new TabletSamsung();
    }
}
