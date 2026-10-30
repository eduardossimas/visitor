package chainOfResponsability;

public class FuncionarioGerente extends FuncionarioFinanca {

    public FuncionarioGerente(FuncionarioFinanca superior) {
        listaTransacoes.add(TipoTransacaoBoleto.getTipoTransacaoBoleto());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }
}
