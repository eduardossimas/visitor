package bridgeAndCriacao;

public class FabricaVeiculo {

    // SINGLETON
    private FabricaVeiculo() {};

    private static FabricaVeiculo instance = new FabricaVeiculo();

    public static FabricaVeiculo getInstance() {
        return instance;
    }

    public FabricaAbstrata obterFabrica(String tipo) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("bridgeAndCriacao.Fabrica" + tipo);
            objeto = classe.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Fabrica Inexistente");
        }

        if (!(objeto instanceof FabricaAbstrata)) {
            throw new IllegalArgumentException("Fabrica Invalida");
        }

        return (FabricaAbstrata) objeto;
    }
}
