package factoryMethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificacaoWhatsAppTest {

    @Test
    void deveEnviarNotificacaoWhastApp() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("WhatsApp");
        assertEquals("Enviar Notificação do WhatsApp", notificacao.enviar());
    }

    @Test
    void deveReceberNotificacaoWhatsApp() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("WhatsApp");
        assertEquals("Receber Notificação do WhatsApp", notificacao.receber());
    }
}