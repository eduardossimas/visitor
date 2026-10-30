package bridgeAndCriacao;

public class FabricaEletrico implements FabricaAbstrata {

    public CarroPasseio criarCarroPasseio(float potencia) {
        CarroPasseio carroPasseio = new CarroPasseio(potencia);
        carroPasseio.setMotor(new MotorEletrico());
        return carroPasseio;
    }

    public SUV criarSUV(float potencia) {
        SUV suv = new SUV(potencia);
        suv.setMotor(new MotorEletrico());
        return suv;
    }
}
