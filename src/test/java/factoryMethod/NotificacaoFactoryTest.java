package factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoFactoryTest {

    @Test
    void deveRetornarExcecaoParaNotificacaoInexistente() {
        try {
            INotificacao notificacao = NotificacaoFactory.obterNotificacao("Telegram");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Notificação inexistente", e.getMessage());
        }
    }
}