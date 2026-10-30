package chainOfResponsability;

public class FuncionarioCFO extends FuncionarioFinanca {

    public FuncionarioCFO(FuncionarioFinanca superior) {
        listaTransacoes.add(TipoTransacaoTed.getTipoTransacaoTed());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "CFO";
    }
}