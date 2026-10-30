package bridgeAndCriacao;

public class FabricaCombustao implements FabricaAbstrata {

    public CarroPasseio criarCarroPasseio(float potencia) {
        CarroPasseio carroPasseio = new CarroPasseio(potencia);
        carroPasseio.setMotor(new MotorCombustao());
        return carroPasseio;
    }

    public SUV criarSUV(float potencia) {
        SUV suv = new SUV(potencia);
        suv.setMotor(new MotorCombustao());
        return suv;
    }
}
