package chainOfResponsability;

public class TipoTransacaoTed implements TipoTransacao {

    private static TipoTransacaoTed tipoTransacaoTed = new TipoTransacaoTed();

    private TipoTransacaoTed() {};

    public static TipoTransacaoTed getTipoTransacaoTed() {
        return tipoTransacaoTed;
    }
}