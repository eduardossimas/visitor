package bridge;

public class SUV extends Veiculo{
    public SUV(float potencia) {
        super(potencia);
    }

    public float calcularPotencia() {
        return this.potencia * (1 + this.motor.percentualAumento());
    }
}
