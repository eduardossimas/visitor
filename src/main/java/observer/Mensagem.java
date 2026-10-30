package observer;

import java.util.Observable;

public class Mensagem extends Observable {

    private String conteudo;
    private String remetente;

    public Mensagem(String conteudo, String remetente) {
        this.conteudo = conteudo;
        this.remetente = remetente;
    }

    public void enviar() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Mensagem{" +
                "conteudo='" + conteudo + '\'' +
                ", remetente='" + remetente + '\'' +
                '}';
    }
}