package bridgeAndCriacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarPotenciaCarroPasseioCombustao() {
        FabricaAbstrata fabrica = FabricaVeiculo.getInstance().obterFabrica("Combustao");
        Cliente cliente = new Cliente(fabrica, 100);
        assertEquals(120f, cliente.exibirPotenciaCarroPasseio(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaCarroPasseioEletrico() {
        FabricaAbstrata fabrica = FabricaVeiculo.getInstance().obterFabrica("Eletrico");
        Cliente cliente = new Cliente(fabrica, 100);
        assertEquals(130f, cliente.exibirPotenciaCarroPasseio(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaCarroPasseioHibrido() {
        FabricaAbstrata fabrica = FabricaVeiculo.getInstance().obterFabrica("Hibrido");
        Cliente cliente = new Cliente(fabrica, 100);
        assertEquals(140f, cliente.exibirPotenciaCarroPasseio(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaSUVCombustao() {
        FabricaAbstrata fabrica = FabricaVeiculo.getInstance().obterFabrica("Combustao");
        Cliente cliente = new Cliente(fabrica, 100);
        assertEquals(120f, cliente.exibirPotenciaSUV(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaSUVEletrico() {
        FabricaAbstrata fabrica = FabricaVeiculo.getInstance().obterFabrica("Eletrico");
        Cliente cliente = new Cliente(fabrica, 100);
        assertEquals(130f, cliente.exibirPotenciaSUV(), 0.01f);
    }

    @Test
    void deveRetornarPotenciaSUVHibrido() {
        FabricaAbstrata fabrica = FabricaVeiculo.getInstance().obterFabrica("Hibrido");
        Cliente cliente = new Cliente(fabrica, 100);
        assertEquals(140f, cliente.exibirPotenciaSUV(), 0.01f);
    }

    @Test
    void deveRetornarExcecaoParaFabricaInexistente() {
        try {
            FabricaVeiculo.getInstance().obterFabrica("Nuclear");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fabrica Inexistente", e.getMessage());
        }
    }
}
