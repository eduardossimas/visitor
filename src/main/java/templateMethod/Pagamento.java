package templateMethod;

public abstract class Pagamento {

    private String codigoTransacao;
    protected String cliente;
    private float valor;
    private int parcelas;

    public String getCodigoTransacao() {
        return codigoTransacao;
    }

    public void setCodigoTransacao(String codigoTransacao) {
        this.codigoTransacao = codigoTransacao;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public float calcularValorTotal() {
        return this.valor;
    }

    public abstract String processarPagamento();

    public String getTipo() {
        return "Pagamento";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "codigoTransacao='" + this.codigoTransacao + '\'' +
                ", cliente='" + this.cliente + '\'' +
                ", resultado=" + this.processarPagamento() +
                '}';
    }
}