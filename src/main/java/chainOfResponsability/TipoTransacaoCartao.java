package chainOfResponsability;

public class TipoTransacaoCartao implements TipoTransacao {

    private static TipoTransacaoCartao tipoTransacaoCartao = new TipoTransacaoCartao();

    private TipoTransacaoCartao() {};

    public static TipoTransacaoCartao getTipoTransacaoCartao() {
        return tipoTransacaoCartao;
    }
}