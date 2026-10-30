package StateAndObserver;

public abstract class MensagemEstado {
    public abstract String getEstado();

    public boolean enviar(Mensagem mensagem) {
        return false;
    }

    public boolean receber(Mensagem mensagem) {
        return false;
    }

    public boolean editar(Mensagem mensagem) {
        return false;
    }

    public boolean excluir(Mensagem mensagem) {
        return false;
    }
}
