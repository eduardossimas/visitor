package decorator;

public class CartaoSD extends CelularDecorator {

    public CartaoSD(Celular celular) {
        super(celular);
    }

    public float getPrecoAdicional() {
        return 30.0f;
    }
}
