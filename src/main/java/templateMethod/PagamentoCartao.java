package templateMethod;

public class PagamentoCartao extends Pagamento {

    @Override
    public String processarPagamento() {
        // Exemplo de regra: Cartão aprova se o valor for menor ou igual a 5000 ou se tiver limite
        if (this.getValor() <= 5000.0f) {
            return "Aprovado no Cartao";
        } else {
            return "Negado limite insuficiente";
        }
    }

}
