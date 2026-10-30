package decorator;

public class Capinha extends CelularDecorator {
    public Capinha(Celular celular) {
        super(celular);
    }

    public float getPrecoAdicional() {
        return 20.0f;
    }
}
