package chainOfResponsability;

public class TipoTransacaoBoleto implements TipoTransacao {

    private static TipoTransacaoBoleto tipoTransacaoBoleto = new TipoTransacaoBoleto();

    private TipoTransacaoBoleto() {};

    public static TipoTransacaoBoleto getTipoTransacaoBoleto() {
        return tipoTransacaoBoleto;
    }
}