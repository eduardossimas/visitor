package bridgeAndCriacao;

public class Cliente {
    private CarroPasseio carroPasseio;
    private SUV suv;

    public Cliente(FabricaAbstrata fabrica, float potencia) {
        this.carroPasseio = fabrica.criarCarroPasseio(potencia);
        this.suv = fabrica.criarSUV(potencia);
    }

    public float exibirPotenciaCarroPasseio() {
        return this.carroPasseio.calcularPotencia();
    }

    public float exibirPotenciaSUV() {
        return this.suv.calcularPotencia();
    }
}
