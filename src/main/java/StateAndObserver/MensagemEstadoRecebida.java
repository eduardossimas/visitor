package StateAndObserver;

public class MensagemEstadoRecebida extends MensagemEstado{

    private MensagemEstadoRecebida() {};
    private static MensagemEstadoRecebida instance = new MensagemEstadoRecebida();
    public static MensagemEstadoRecebida getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Recebida";
    }

    public boolean editar(Mensagem mensagem) {
        mensagem.setEstado(MensagemEstadoEditada.getInstance());
        return true;
    }
}
