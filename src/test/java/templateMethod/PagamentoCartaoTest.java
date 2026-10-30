package templateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoCartaoTest {

    @Test
    void deveRetornarPagamentoAprovado() {
        PagamentoCartao pagamento = new PagamentoCartao();
        pagamento.setValor(5000.0f);
        assertEquals("Aprovado no Cartao", pagamento.processarPagamento());
    }

    @Test
    void deveRetornarPagamentoNegado() {
        PagamentoCartao pagamento = new PagamentoCartao();
        pagamento.setValor(5001.0f);
        assertEquals("Negado limite insuficiente", pagamento.processarPagamento());
    }

    @Test
    void deveRetornarInformacoes() {
        PagamentoCartao pagamento = new PagamentoCartao();
        pagamento.setValor(5001.0f);
        pagamento.setCliente("Marcelo");
        pagamento.setCodigoTransacao("TX123");
        assertEquals("Pagamento{codigoTransacao='TX123', cliente='Marcelo', resultado=Negado limite insuficiente}", pagamento.getInfo());
    }
}