package abstractFactory;

public class Cliente {
    private Celular celular;
    private Tablet tablet;

    public Cliente(FabricaAbstrata fabrica) {
        this.celular = fabrica.criarCelular();
        this.tablet = fabrica.criarTablet();
    }

    public String criarCelular() {
        return this.celular.criar();
    }

    public String criarTablet() {
        return this.tablet.criar();
    }

}
