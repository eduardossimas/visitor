package abstractFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarCelularApple() {
        FabricaAbstrata fabrica = new FabricaApple();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Celular Apple", cliente.criarCelular());
    }

    @Test
    void deveRetornarCelularSamsung() {
        FabricaAbstrata fabrica = new FabricaSamsung();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Celular Samsung", cliente.criarCelular());
    }

    @Test
    void deveRetornarTabletApple() {
        FabricaAbstrata fabrica = new FabricaApple();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Tablet Apple", cliente.criarTablet());
    }

    @Test
    void deveRetornarTabletSamsung() {
        FabricaAbstrata fabrica = new FabricaSamsung();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Tablet Samsung", cliente.criarTablet());
    }

}