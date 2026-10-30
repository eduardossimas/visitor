package StateAndObserver;

public class MensagemEstadoEditada extends MensagemEstado{

    private MensagemEstadoEditada() {};
    private static MensagemEstadoEditada instance = new MensagemEstadoEditada();
    public static MensagemEstadoEditada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Editada";
    }

    public boolean excluir(Mensagem mensagem) {
        mensagem.setEstado(MensagemEstadoExcluida.getInstance());
        return true;
    }

    public boolean receber(Mensagem mensagem) {
        mensagem.setEstado(MensagemEstadoRecebida.getInstance());
        return true;
    }
}
