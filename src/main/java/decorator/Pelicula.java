package decorator;

public class Pelicula extends CelularDecorator {

    public Pelicula(Celular celular) {
        super(celular);
    }

    public float getPrecoAdicional() {
        return 10.0f;
    }
}
