package bridgeAndCriacao;

public class FabricaHibrido implements FabricaAbstrata {

    public CarroPasseio criarCarroPasseio(float potencia) {
        CarroPasseio carroPasseio = new CarroPasseio(potencia);
        carroPasseio.setMotor(new MotorHibrido());
        return carroPasseio;
    }

    public SUV criarSUV(float potencia) {
        SUV suv = new SUV(potencia);
        suv.setMotor(new MotorHibrido());
        return suv;
    }
}
