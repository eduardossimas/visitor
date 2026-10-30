package StateAndObserver;

import java.util.Observable;
import java.util.Observer;

public class Usuario implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void assinarMensagem(Mensagem mensagem) {
        mensagem.addObserver(this);
    }

    public void update(Observable mensagem, Object novoEstado) {
        this.ultimaNotificacao = this.nome + " foi notificado: a mensagem mudou para o estado " + novoEstado;
    }
}