package StateAndObserver;

public class MensagemEstadoExcluida extends MensagemEstado{

    private MensagemEstadoExcluida() {};
    private static MensagemEstadoExcluida instance = new MensagemEstadoExcluida();
    public static MensagemEstadoExcluida getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Excluida";
    }
}
