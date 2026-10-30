package factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoEmailTest {

    @Test
    void deveEnviarNotificacaoEmail() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("Email");
        assertEquals("Enviar Notificação do Email", notificacao.enviar());
    }

    @Test
    void deveReceberNotificacaoEmail(){
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("Email");
        assertEquals("Receber Notificação do Email", notificacao.receber());
    }

}