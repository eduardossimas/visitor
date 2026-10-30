package StateAndObserver;

import java.util.Observable;

public class Mensagem extends Observable {

    private MensagemEstado estado;

    public Mensagem() {
        this.estado = MensagemEstadoEnviada.getInstance();
    }

    public void setEstado(MensagemEstado estado) {
        this.estado = estado;
        setChanged();
        notifyObservers(this.estado.getEstado());
    }

    public MensagemEstado getEstado() {
        return estado;
    }

    public boolean enviar() {
        return estado.enviar(this);
    }

    public boolean receber() {
        return estado.receber(this);
    }

    public boolean editar() {
        return estado.editar(this);
    }

    public boolean excluir() {
        return estado.excluir(this);
    }
}
