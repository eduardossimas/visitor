package StateAndObserver;

public class MensagemEstadoEnviada extends MensagemEstado {

    private MensagemEstadoEnviada() {};
    private static MensagemEstadoEnviada instance = new MensagemEstadoEnviada();
    public static MensagemEstadoEnviada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Enviada";
    }

    public boolean editar(Mensagem mensagem) {
        mensagem.setEstado(MensagemEstadoEditada.getInstance());
        return true;
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
