package chainOfResponsability;

public class FuncionarioDiretorFinanc extends FuncionarioFinanca {

    public FuncionarioDiretorFinanc(FuncionarioFinanca superior) {
        listaTransacoes.add(TipoTransacaoCartao.getTipoTransacaoCartao());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor Financeiro";
    }
}
