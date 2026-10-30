package factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoSMSTest {

    @Test
    void deveEnviarNotificacaoSMS() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("SMS");
        assertEquals("Enviar Notificação de SMS", notificacao.enviar());
    }

    @Test
    void deveReceberNotificacaoSMS() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("SMS");
        assertEquals("Receber Notificação de SMS", notificacao.receber());
    }
}