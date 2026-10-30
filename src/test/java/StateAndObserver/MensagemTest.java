package StateAndObserver;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MensagemTest {

    Mensagem mensagem;

    @BeforeEach
    public void setUp() {
        mensagem = new Mensagem();
    }

    // Mensagem enviada

    @Test
    public void naoDeveEnviarMensagemEnviada() {
        mensagem.setEstado(MensagemEstadoEnviada.getInstance());
        assertFalse(mensagem.enviar());
    }

    @Test
    public void deveReceberMensagemEnviada() {
        mensagem.setEstado(MensagemEstadoEnviada.getInstance());
        assertTrue(mensagem.receber());
        assertEquals(MensagemEstadoRecebida.getInstance(), mensagem.getEstado());
    }

    @Test
    public void deveEditarMensagemEnviada() {
        mensagem.setEstado(MensagemEstadoEnviada.getInstance());
        assertTrue(mensagem.editar());
        assertEquals(MensagemEstadoEditada.getInstance(), mensagem.getEstado());
    }

    @Test
    public void deveExcluirMensagemEnviada() {
        mensagem.setEstado(MensagemEstadoEnviada.getInstance());
        assertTrue(mensagem.excluir());
        assertEquals(MensagemEstadoExcluida.getInstance(), mensagem.getEstado());
    }

    // Mensagem recebida

    @Test
    public void naoDeveEnviarMensagemRecebida() {
        mensagem.setEstado(MensagemEstadoRecebida.getInstance());
        assertFalse(mensagem.enviar());
    }

    @Test
    public void naoDeveReceberMensagemRecebida() {
        mensagem.setEstado(MensagemEstadoRecebida.getInstance());
        assertFalse(mensagem.receber());
    }

    @Test
    public void deveEditarMensagemRecebida() {
        mensagem.setEstado(MensagemEstadoRecebida.getInstance());
        assertTrue(mensagem.editar());
        assertEquals(MensagemEstadoEditada.getInstance(), mensagem.getEstado());
    }

    @Test
    public void naoDeveExcluirMensagemRecebida() {
        mensagem.setEstado(MensagemEstadoRecebida.getInstance());
        assertFalse(mensagem.excluir());
    }

    // Mensagem editada

    @Test
    public void naoDeveEnviarMensagemEditada() {
        mensagem.setEstado(MensagemEstadoEditada.getInstance());
        assertFalse(mensagem.enviar());
    }

    @Test
    public void deveReceberMensagemEditada() {
        mensagem.setEstado(MensagemEstadoEditada.getInstance());
        assertTrue(mensagem.receber());
        assertEquals(MensagemEstadoRecebida.getInstance(), mensagem.getEstado());
    }

    @Test
    public void naoDeveEditarMensagemEditada() {
        mensagem.setEstado(MensagemEstadoEditada.getInstance());
        assertFalse(mensagem.editar());
    }

    @Test
    public void deveExcluirMensagemEditada() {
        mensagem.setEstado(MensagemEstadoEditada.getInstance());
        assertTrue(mensagem.excluir());
        assertEquals(MensagemEstadoExcluida.getInstance(), mensagem.getEstado());
    }

    // Mensagem excluída

    @Test
    public void naoDeveEnviarMensagemExcluida() {
        mensagem.setEstado(MensagemEstadoExcluida.getInstance());
        assertFalse(mensagem.enviar());
    }

    @Test
    public void naoDeveReceberMensagemExcluida() {
        mensagem.setEstado(MensagemEstadoExcluida.getInstance());
        assertFalse(mensagem.receber());
    }

    @Test
    public void naoDeveEditarMensagemExcluida() {
        mensagem.setEstado(MensagemEstadoExcluida.getInstance());
        assertFalse(mensagem.editar());
    }

    @Test
    public void naoDeveExcluirMensagemExcluida() {
        mensagem.setEstado(MensagemEstadoExcluida.getInstance());
        assertFalse(mensagem.excluir());
    }

    @Test
    void deveNotificarUmUsuario() {
        Usuario usuario = new Usuario("Usuário 1");
        usuario.assinarMensagem(mensagem);
        mensagem.editar();
        assertEquals("Usuário 1 foi notificado: a mensagem mudou para o estado Editada", usuario.getUltimaNotificacao());
    }

    @Test
    void deveNotificarUsuarios() {
        Usuario usuario1 = new Usuario("Usuário 1");
        Usuario usuario2 = new Usuario("Usuário 2");
        usuario1.assinarMensagem(mensagem);
        usuario2.assinarMensagem(mensagem);
        mensagem.editar();
        assertEquals("Usuário 1 foi notificado: a mensagem mudou para o estado Editada", usuario1.getUltimaNotificacao());
        assertEquals("Usuário 2 foi notificado: a mensagem mudou para o estado Editada", usuario2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarUsuario() {
        Usuario usuario = new Usuario("Usuário 1");
        mensagem.editar();
        assertEquals(null, usuario.getUltimaNotificacao());
    }

    @Test
    void deveNotificarUsuarioMensagemA() {
        Mensagem mensagemB = new Mensagem();
        Usuario usuario1 = new Usuario("Usuário 1");
        Usuario usuario2 = new Usuario("Usuário 2");
        usuario1.assinarMensagem(mensagem); // mensagem principal do setUp
        usuario2.assinarMensagem(mensagemB); // outra mensagem separada
        mensagem.editar();
        assertEquals("Usuário 1 foi notificado: a mensagem mudou para o estado Editada", usuario1.getUltimaNotificacao());
        assertEquals(null, usuario2.getUltimaNotificacao());
    }
}
