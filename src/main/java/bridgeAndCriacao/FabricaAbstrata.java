package bridgeAndCriacao;

public interface FabricaAbstrata {
    CarroPasseio criarCarroPasseio(float potencia);
    SUV criarSUV(float potencia);
}
