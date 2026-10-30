package templateMethod;

public class PagamentoBoleto extends Pagamento {

    @Override
    public String processarPagamento() {
        // Exemplo de regra própria para boleto
        if (this.getParcelas() <= 1) {
            return "Boleto Gerado com Sucesso";
        } else {
            return "Parcelamento de Boleto Nao Permitido";
        }
    }

    @Override
    public String getTipo() {
        return "PagamentoBoleto";
    }
}
