package chainOfResponsability;

public class FuncionarioAnalista extends FuncionarioFinanca {

    public FuncionarioAnalista(FuncionarioFinanca superior) {
        listaTransacoes.add(TipoTransacaoPix.getTipoTransacaoPix());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Analista";
    }
}
