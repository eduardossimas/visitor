package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    public void deveRetornarSenhaUnica() {
        Parametros.getInstance().setSenhaUnica("Senha unica");
        assertEquals("Senha unica", Parametros.getInstance().getSenhaUnica());
    }
}