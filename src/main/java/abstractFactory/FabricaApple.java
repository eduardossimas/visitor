package abstractFactory;

public class FabricaApple implements FabricaAbstrata{
    public Celular criarCelular() {
        return new CelularApple();
    }

    public Tablet criarTablet() {
        return new TabletApple();
    }
}
