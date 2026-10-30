package decorator;

public abstract class CelularDecorator implements Celular {

    private Celular celular;

    public CelularDecorator(Celular celular) {
        this.celular = celular;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public abstract float getPrecoAdicional();

    public float getPrecoFinal() {
        return this.celular.getPrecoFinal() + this.getPrecoAdicional();
    }
}
