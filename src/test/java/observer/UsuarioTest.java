package observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void deveNotificarUmUsuario() {
        Mensagem mensagem = new Mensagem("Olá, tudo bem?", "Remetente 1");
        Usuario usuario = new Usuario("Usuário 1");
        usuario.assinar(mensagem);
        mensagem.enviar();
        assertEquals("Usuário 1, nova mensagem recebida: Mensagem{conteudo='Olá, tudo bem?', remetente='Remetente 1'}", usuario.getUltimaNotificacao());
    }

    @Test
    void deveNotificarUsuarios() {
        Mensagem mensagem = new Mensagem("Olá, tudo bem?", "Remetente 1");
        Usuario usuario1 = new Usuario("Usuário 1");
        Usuario usuario2 = new Usuario("Usuário 2");
        usuario1.assinar(mensagem);
        usuario2.assinar(mensagem);
        mensagem.enviar();
        assertEquals("Usuário 1, nova mensagem recebida: Mensagem{conteudo='Olá, tudo bem?', remetente='Remetente 1'}", usuario1.getUltimaNotificacao());
        assertEquals("Usuário 2, nova mensagem recebida: Mensagem{conteudo='Olá, tudo bem?', remetente='Remetente 1'}", usuario2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarUsuario() {
        Mensagem mensagem = new Mensagem("Olá, tudo bem?", "Remetente 1");
        Usuario usuario = new Usuario("Usuário 1");
        mensagem.enviar();
        assertEquals(null, usuario.getUltimaNotificacao());
    }

    @Test
    void deveNotificarUsuarioMensagemA() {
        Mensagem mensagemA = new Mensagem("Mensagem A", "Remetente 1");
        Mensagem mensagemB = new Mensagem("Mensagem B", "Remetente 2");
        Usuario usuario1 = new Usuario("Usuário 1");
        Usuario usuario2 = new Usuario("Usuário 2");
        usuario1.assinar(mensagemA);
        usuario2.assinar(mensagemB);
        mensagemA.enviar();
        assertEquals("Usuário 1, nova mensagem recebida: Mensagem{conteudo='Mensagem A', remetente='Remetente 1'}", usuario1.getUltimaNotificacao());
        assertEquals(null, usuario2.getUltimaNotificacao());
    }
}