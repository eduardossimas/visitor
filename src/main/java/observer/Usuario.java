package observer;

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

    public void assinar(Mensagem mensagem) {
        mensagem.addObserver(this);
    }

    public void update(Observable mensagem, Object arg1) {
        this.ultimaNotificacao = this.nome + ", nova mensagem recebida: " + mensagem.toString();
    }
}