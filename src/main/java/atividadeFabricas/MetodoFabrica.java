package atividadeFabricas;

public class MetodoFabrica {

    // SINGLETON
    private MetodoFabrica() {};

    private static MetodoFabrica instance = new MetodoFabrica();

    public static MetodoFabrica getInstance() {
        return instance;
    }

    public FabricaAbstrata obterFabrica(String tipo) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("atividadeFabricas.Fabrica" + tipo);
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
