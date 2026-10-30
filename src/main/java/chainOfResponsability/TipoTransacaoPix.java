package chainOfResponsability;

public class TipoTransacaoPix implements TipoTransacao {

    private static TipoTransacaoPix tipoTransacaoPix = new TipoTransacaoPix();

    private TipoTransacaoPix() {};

    public static TipoTransacaoPix getTipoTransacaoPix() {
        return tipoTransacaoPix;
    }
}
