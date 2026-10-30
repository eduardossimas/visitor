package atividadeFabricas;

public class Cliente {
    private Contrato contrato;
    private Procuracao procuracao;

    public Cliente (FabricaAbstrata fabrica) {
        this.contrato = fabrica.criarContrato();
        this.procuracao = fabrica.criarProcuracao();
    }

    public String exibirContrato() {
        return this.contrato.exibir();
    }

    public String exibirProcuracao() {
        return this.procuracao.exibir();
    }
}
