package decorator;

public class CelularBase implements Celular {
    public float precoFinal;

    public CelularBase(float precoFinal) {
        this.precoFinal = precoFinal;
    }

    public float getPrecoFinal() {
        return precoFinal;
    }
}
