package bridge;

public class CarroPasseio extends Veiculo{
    public CarroPasseio(float potencia) {
        super(potencia);
    }

    public float calcularPotencia() {
        return this.potencia * (1 + this.motor.percentualAumento());
    }
}
