package bridge;

public abstract class Veiculo {

    protected Motor motor;
    protected float potencia;

    public Veiculo(float potencia) {
        this.potencia = potencia;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public abstract float calcularPotencia();
}
