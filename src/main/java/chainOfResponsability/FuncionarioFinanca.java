package chainOfResponsability;

import java.util.ArrayList;

public abstract class FuncionarioFinanca {

    protected ArrayList listaTransacoes = new ArrayList();
    private FuncionarioFinanca funcionarioSuperior;

    public FuncionarioFinanca getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(FuncionarioFinanca funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String aprovarTransacao(Transacao transacao) {
        if (listaTransacoes.contains(transacao.getTipoTransacao())) {
            return getDescricaoCargo();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.aprovarTransacao(transacao);
            }
            else
            {
                return "Sem aprovacao";
            }
        }
    }
}
