package atividadeFabricas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveExibirContratoPF() {
        FabricaAbstrata fabrica = MetodoFabrica.getInstance().obterFabrica("PF");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato PF", cliente.exibirContrato());
    }

    @Test
    void deveExibirContratoPJ() {
        FabricaAbstrata fabrica = MetodoFabrica.getInstance().obterFabrica("PJ");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato PJ", cliente.exibirContrato());
    }

    @Test
    void deveRetornarProcuracaoPF() {
        FabricaAbstrata fabrica = MetodoFabrica.getInstance().obterFabrica("PF");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuracao PF", cliente.exibirProcuracao());
    }

    @Test
    void deveRetornarProcuracaoPJ() {
        FabricaAbstrata fabrica = MetodoFabrica.getInstance().obterFabrica("PJ");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuracao PJ", cliente.exibirProcuracao());
    }
}