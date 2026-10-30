package templateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoBoletoTest {

    @Test
    void deveRetornarBoletoGeradoComSucesso() {
        PagamentoBoleto pagamento = new PagamentoBoleto();
        pagamento.setParcelas(1);
        assertEquals("Boleto Gerado com Sucesso", pagamento.processarPagamento());
    }

    @Test
    void deveRetornarParcelamentoNaoPermitido() {
        PagamentoBoleto pagamento = new PagamentoBoleto();
        pagamento.setParcelas(2);
        assertEquals("Parcelamento de Boleto Nao Permitido", pagamento.processarPagamento());
    }

    @Test
    void deveRetornarInformacoes() {
        PagamentoBoleto pagamento = new PagamentoBoleto();
        pagamento.setParcelas(1);
        pagamento.setCliente("Marco");
        pagamento.setCodigoTransacao("TX456");
        assertEquals("PagamentoBoleto{codigoTransacao='TX456', cliente='Marco', resultado=Boleto Gerado com Sucesso}", pagamento.getInfo());
    }
}