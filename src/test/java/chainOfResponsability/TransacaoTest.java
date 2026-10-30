package chainOfResponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransacaoTest {

    FuncionarioCFO cfo;
    FuncionarioDiretorFinanc diretorFinanc;
    FuncionarioGerente gerente;
    FuncionarioAnalista analista;

    @BeforeEach
    void setUp() {
        cfo = new FuncionarioCFO(null);
        diretorFinanc = new FuncionarioDiretorFinanc(cfo);
        gerente = new FuncionarioGerente(diretorFinanc);
        analista = new FuncionarioAnalista(gerente);
    }

    @Test
    void deveRetornarAnalistaParaAprovacaoPix() {
        assertEquals("Analista", analista.aprovarTransacao(new Transacao(TipoTransacaoPix.getTipoTransacaoPix())));
    }

    @Test
    void deveRetornarGerenteParaAprovacaoBoleto() {
        assertEquals("Gerente", analista.aprovarTransacao(new Transacao(TipoTransacaoBoleto.getTipoTransacaoBoleto())));
    }

    @Test
    void deveRetornarDiretorFinanceiroParaAprovacaoCartao() {
        assertEquals("Diretor Financeiro", analista.aprovarTransacao(new Transacao(TipoTransacaoCartao.getTipoTransacaoCartao())));
    }

    @Test
    void deveRetornarCFOparaAprovacaoTed() {
        assertEquals("CFO", analista.aprovarTransacao(new Transacao(TipoTransacaoTed.getTipoTransacaoTed())));
    }

    @Test
    void deveRetornarSemAprovacaoParaOutraTransacao() {
        // Criando uma transação que não está mapeada na cadeia (ex: Criptomoeda)
        TipoTransacao tipoDesconhecido = new TipoTransacao() {};
        assertEquals("Sem aprovacao", analista.aprovarTransacao(new Transacao(tipoDesconhecido)));
    }

}